import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Layer {
//    private List<Row> theLayer = new ArrayList<Row>();
    private Row[] theLayer;
    private int countOfZerosInLayer = 0;
    private int countOfOnesInLayer = 0;

    public int getCountOfZerosInLayer() {
        return countOfZerosInLayer;
    }

    public int getCountOfOnesInLayer() {
        return countOfOnesInLayer;
    }

    public int getCountOfTwosInLayer() {
        return countOfTwosInLayer;
    }

    private int countOfTwosInLayer = 0;


//    public List<Row> getTheLayer() {
//        return theLayer;
//    }
    public Row[] getTheLayer() {
    return theLayer;
}

//    public void addARow(Row theRow){
//        theLayer.add(theRow);
//    }

    public int length(){
        return theLayer.length;
    }

//    public Row get (int index){
//        return theLayer.get(index);
//    }
    public Row get (int index){
        return theLayer[index];
    }

    public void buildLayer(String aLayer){
        int sliceStart = 0;
        int layerIndex = 0;
        theLayer = new Row [aLayer.length()/25];
        for (int index = 25; index <= aLayer.length(); index += 25 ){
            Row aRow = new Row();
            String rowData = aLayer.substring(sliceStart, index);
            aRow.buildARow(rowData);
            theLayer[layerIndex++] = aRow;
            //            addARow(aRow);
            this.countOfZerosInLayer += aRow.getCountOfZeros();
            this.countOfOnesInLayer += aRow.getCountOfOnes();
            this.countOfTwosInLayer += aRow.getCountOfTwos();
            sliceStart = index;
        }
    }

//    public int countOfDigitsInLayer(int digitToMatch){
//        int theCountOfDigits = 0;
//        for (int row = 0; row < this.length(); row++ ){
//            theCountOfDigits += theLayer.get(row).getCountOfDigits(digitToMatch);
//        }
//        return theCountOfDigits;
//    }

    @Override
    public String toString() {
        return "Layer{" +
                "theLayer=" + Arrays.toString(theLayer) +
                '}';
    }
}
