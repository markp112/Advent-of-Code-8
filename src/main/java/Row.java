import java.util.ArrayList;
import java.util.List;

public class Row {
    private List<Integer> theRow = new ArrayList<Integer>();
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

    public List<Integer> getTheRow() {
        return theRow;
    }

    public int length(){
        return theRow.size();
    }

    public int get (int index){
        return theRow.get(index);
   }

    public void storeAPixel(int pixel){
        theRow.add(pixel);
    }

    public void buildARow(String aStringOfNumbers){
         for(int index = 0; index < aStringOfNumbers.length(); index++){
            int aPixel = Character.getNumericValue(aStringOfNumbers.charAt(index));
            storeAPixel(aPixel);
            if (aPixel == 0) countOfZeros++; else if(aPixel == 1) countOfOnes++; else countOfTwos++;
        }
   }

   public int getCountOfDigits(int digitToMatch) {
        return (int)theRow.stream().filter(digit -> digit == digitToMatch).count();
   }

    @Override
    public String toString() {
        return "Row{" +
                "theRow=" + theRow +
                '}';
    }
}
