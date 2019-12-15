import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Layer {
    private int countOfZerosInLayer = 0;
    private int countOfOnesInLayer = 0;
    private int countOfTwosInLayer = 0;

    public int getCountOfZerosInLayer() {
        return countOfZerosInLayer;
    }

    public int getCountOfOnesInLayer() {
        return countOfOnesInLayer;
    }

    public int getCountOfTwosInLayer() {
        return countOfTwosInLayer;
    }

    public void buildLayer(String aLayer){
        int sliceStart = 0;
        for (int index = 25; index <= aLayer.length(); index += 25 ){
            Row aRow = new Row();
            String rowData = aLayer.substring(sliceStart, index);
            aRow.buildARow(rowData);
            this.countOfZerosInLayer += aRow.getCountOfZeros();
            this.countOfOnesInLayer += aRow.getCountOfOnes();
            this.countOfTwosInLayer += aRow.getCountOfTwos();
            sliceStart = index;
        }
    }
}
