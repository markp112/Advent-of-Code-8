import org.junit.Test;

import java.util.Random;

public class TestTheLayerClass {
    Layer theTestLayer = new Layer();

    private Row buildATestRow(){
        Row aTestRow = new Row();
        Random RANDOM = new Random();
        for(int index = 0; index < 25; index++){
            int aRandomPixel = RANDOM.nextInt(2) + 0;
            aTestRow.storeAPixel(aRandomPixel);
        }
        return aTestRow;
    }

    private String buildATestStringImageWidthByLayerHigh(int width, int layers){
        Random RANDOM = new Random();
        String aTestString="";
        for(int index = 0; index < width * layers; index++){
             aTestString += RANDOM.nextInt(3) + 0;
        }
        return aTestString;
    }

    @Test
    public void givenALayer_CheckItHasALenghtOfZeroWhenInitialised(){
        assert (theTestLayer.length()) == 0;
    }

    @Test
    public void givenALayer_CheckARowCanBeStored(){
        Row aTestRow = buildATestRow();
        theTestLayer.addARow(aTestRow);
        assert(theTestLayer.get(0).length()) == 25;
    }

    @Test
    public void givenALayer_CheckRowsAreAddedInSequence(){
        theTestLayer = new Layer();
        Row rowOne = buildATestRow();
        Row rowTwo  = buildATestRow();
        Row rowThree  = buildATestRow();
        theTestLayer.addARow(rowOne);
        theTestLayer.addARow(rowTwo);
        theTestLayer.addARow(rowThree);
        assert(theTestLayer.length()) == 3;
        assert(theTestLayer.get(0).toString().equals(rowOne.toString()));
        assert(theTestLayer.get(1).toString().equals(rowTwo.toString()));
        assert(theTestLayer.get(2).toString().equals(rowThree.toString()));
    }

    @Test
    public void givenAStringofNumberOfImageWidthbyLayersHigh_CheckTheseCanBeBuiltIntoLayerOfRows(){
        final int width = 25;
        final int layers = 6;
        final int lastPosition = (width * layers) - 1;
        String aTestString = buildATestStringImageWidthByLayerHigh(width,layers);
        theTestLayer = new Layer();
        theTestLayer.buildLayer(aTestString);
        assert (theTestLayer.length()) == layers;
        assert(theTestLayer.get(1).length()) == 25;
        assert (theTestLayer.get(5).get(24)) == Character.getNumericValue(aTestString.charAt((lastPosition)));
    }

    @Test
    public void givenALayer_CheckTheCountOfZerosWhenTheLayerIsBuiltWithAllZeros(){
        String aStringOfZeros = new String(new char[150]).replace('\0', '0');
        theTestLayer = new Layer();
        theTestLayer.buildLayer(aStringOfZeros);
        assert (theTestLayer.countOfDigitsInLayer(0)) == 150;
    }


    @Test
    public void givenALayer_CheckTheCountOfZerosWhenTheLayerIsBuiltWithNoZeros(){
        String aStringWithNoZeros = new String(new char[150]).replace('\0', '1');
        theTestLayer = new Layer();
        theTestLayer.buildLayer(aStringWithNoZeros);
        assert (theTestLayer.countOfDigitsInLayer(0)) == 0;
    }

    @Test
    public void givenALayer_CheckTheCountOfZerosWhenTheLayerIsBuilt8Zeros(){
        String aStringWithZeros = new String(new char[8]).replace('\0', '0');
        aStringWithZeros +=  new String(new char[142]).replace('\0', '1');
        theTestLayer = new Layer();
        theTestLayer.buildLayer(aStringWithZeros);
        assert (theTestLayer.countOfDigitsInLayer(0)) == 8;
    }
}
