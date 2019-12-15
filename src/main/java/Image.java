import java.util.ArrayList;
import java.util.List;

public class Image {
    List<Layer> theImage = new ArrayList<Layer>();
    private final int imageWidth = 25;
    private final int layerSize = 6;
    private final int layerChunk = layerSize * imageWidth;

    public void buildImage(){
        RawData rawData = new RawData();
        String theData = rawData.getTheRawData();
        int sliceStart = 0;
        for (int index = layerChunk; index < rawData.length(); index += layerChunk){
            Layer aLayer = new Layer();
            String layerData = theData.substring(sliceStart,index);
            aLayer.buildLayer(layerData);
            theImage.add(aLayer);
            sliceStart = index;
        }
    }

    public int getTheLayerWithTheLeastZeros(){
        int theLayer = -1;
        int theLowestCountOfZeros = 150;
        for(int layer = 0; layer < theImage.size(); layer++){
            int countOfZeros = theImage.get(layer).getCountOfZerosInLayer();
            if(countOfZeros < theLowestCountOfZeros) {
                theLayer = layer;
                theLowestCountOfZeros = countOfZeros;
            }
        }
        return theLayer;
    }

    public int count(int indexOfTheLayerToCheck, int pixelTypeToCount){
        Layer theLayer = theImage.get(indexOfTheLayerToCheck);
        if(pixelTypeToCount == 1) return theLayer.getCountOfOnesInLayer(); else if(pixelTypeToCount == 2) return theLayer.getCountOfTwosInLayer();
        return 0;
    }
}
