import org.junit.Test;

public class TestTheRowClass {
    Row theTestRow = new Row();
    final String aTestString = "12120010211";

    @Test
    public void givenARow_CheckAPixelCanBeStored(){
       theTestRow.buildARow("14");
        assert(theTestRow.length()) == 2;
        assert(theTestRow.get(1)) == 4;
    }

    @Test
    public void givenARow_CheckPixelsAreAddedAtInSequence(){
        theTestRow = new Row();
        theTestRow.buildARow("314");
        assert(theTestRow.length()) == 3;
        assert(theTestRow.get(0)) == 3;
        assert(theTestRow.get(1)) == 1;
        assert((int)theTestRow.get(2)) == 4;
    }

    @Test
    public void givenAStringOfNumbers_CheckTheRowCanBuildItselfFromTheNumbers(){
        theTestRow = new Row();
        theTestRow.buildARow(aTestString);
        assert(theTestRow.length()) == aTestString.length();
        assert((int)theTestRow.get(2)) == Character.getNumericValue(aTestString.charAt(2));
        assert(theTestRow.get(10)) == Character.getNumericValue(aTestString.charAt(10));
        assert(theTestRow.get(5)) == Character.getNumericValue(aTestString.charAt(5));
    }

    @Test
    public void givenARowofNumbers_CheckTheCountofZeros(){
        theTestRow = new Row();
        theTestRow.buildARow(aTestString);
        assert(theTestRow.getCountOfZeros()) == 3;
    }

    @Test
    public void givenARowofNumbers_CheckTheCountofOnes(){
        theTestRow = new Row();
        theTestRow.buildARow(aTestString);
        assert(theTestRow.getCountOfOnes()) == 5;
    }
    @Test
    public void givenARowofNumbers_CheckTheCountofTwos(){
        theTestRow = new Row();
        theTestRow.buildARow(aTestString);
        assert(theTestRow.getCountOfTwos()) == 3;
    }

}
