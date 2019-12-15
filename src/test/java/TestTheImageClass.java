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
        int answer = theTestImage.getTheCountOfOnes() * theTestImage.getThecountOfTwos();

        stopwatch.stop();
        System.out.println("stopwatch is :" + stopwatch);
        System.out.println("The Answer is " + answer );
    }
}
