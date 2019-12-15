import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Row {
    private int countOfZeros = 0;
    private int countOfOnes = 0;
    private int countOfTwos = 0;

    public int getCountOfZeros() {
        return countOfZeros;
    }

    public int getCountOfOnes() {
        return countOfOnes;
    }

    public int getCountOfTwos() {
        return countOfTwos;
    }

    public void buildARow(String aStringOfNumbers){
         for(int index = 0; index < aStringOfNumbers.length(); index++){
            int aPixel = Character.getNumericValue(aStringOfNumbers.charAt(index));
            if (aPixel == 0) countOfZeros++; else if(aPixel == 1) countOfOnes++; else countOfTwos++;
        }
   }
}
