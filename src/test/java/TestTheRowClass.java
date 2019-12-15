import org.junit.Test;

public class TestTheRowClass {
    Row theTestRow = new Row();
    final String aTestString = "12120010211";

    @Test
    public void givenARow_CheckItHasALenghtOfZeroWhenInitialised(){
        assert (theTestRow.length()) == 0;
    }

    @Test
    public void givenARow_CheckAPixelCanBeStored(){
        theTestRow.storeAPixel(4);
        assert(theTestRow.length()) == 1;
        assert(theTestRow.get(0)) == 4;
    }

    @Test
    public void givenARow_CheckPixelsAreAddedAtTheEndOfTheRow(){
        theTestRow = new Row();
        theTestRow.storeAPixel(3);
        theTestRow.storeAPixel(1);
        theTestRow.storeAPixel(4);
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
        assert(theTestRow.get(2)) == (int)aTestString.charAt(2);
        assert(theTestRow.get(10)) == (int)aTestString.charAt(10);
        assert(theTestRow.get(5)) == (int)aTestString.charAt(5);
    }

    @Test
    public void givenARowofNumbers_CheckTheCountofZeros(){
        theTestRow = new Row();
        theTestRow.buildARow(aTestString);
        assert(theTestRow.getCountOfDigits (0)) == 3;
    }
}
