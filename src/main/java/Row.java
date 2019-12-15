import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Row {
//    private List<Integer> theRow = new ArrayList<Integer>();
    private int[] theRow;
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

    public int[] getTheRow() {
        return theRow;
    }

    public int length(){
        return theRow.length;
    }

    public int get (int index){
        return theRow[index];
   }

    public void buildARow(String aStringOfNumbers){
        theRow = new int[aStringOfNumbers.length()];
         for(int index = 0; index < aStringOfNumbers.length(); index++){
            int aPixel = Character.getNumericValue(aStringOfNumbers.charAt(index));
            theRow[index] = aPixel;
            if (aPixel == 0) countOfZeros++; else if(aPixel == 1) countOfOnes++; else countOfTwos++;
        }
   }

    @Override
    public String toString() {
        return (String)Arrays.toString(theRow).replaceAll("\\[|\\]|,|\\s", "");
    }
}
