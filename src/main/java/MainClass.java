public class MainClass {
    public static void main(){
        Image theTestImage;
        theTestImage = new Image();
        theTestImage.buildImage();
        int layerToScan = theTestImage.getTheLayerWithTheLeastZeros();
        int numberOfOnes = theTestImage.count(layerToScan,1);
        int numberOfTwos = theTestImage.count(layerToScan,2);

        System.out.println("The Answer is " + numberOfOnes * numberOfTwos);
    }
}
