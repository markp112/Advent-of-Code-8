import org.junit.Test;

import com.google.common.base.Stopwatch;

import java.util.concurrent.TimeUnit;



public class TestTheImageClass {
    Image theTestImage;
    @Test
    public void givenAnImage_CheckTheLowestCountOfZerosInALayer(){
        Stopwatch stopwatch = Stopwatch.createUnstarted();
        stopwatch.elapsed(TimeUnit.MILLISECONDS);
        stopwatch.start();
        theTestImage = new Image();
        theTestImage.buildImage();
        int layerToScan = theTestImage.getTheLayerWithTheLeastZeros();
        int numberOfOnes = theTestImage.count(layerToScan,1);
        int numberOfTwos = theTestImage.count(layerToScan,2);
        stopwatch.stop();
        System.out.println("stopwatch is" + stopwatch);
        System.out.println("The Answer is " + numberOfOnes * numberOfTwos);
    }
}
