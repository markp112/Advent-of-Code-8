import org.junit.Test;

public class TestRawDataClass {
    RawData theTestRawData = new RawData();

    @Test
    public void givenRawData_CheckItHasData(){
        assert(theTestRawData.getTheRawData().length()) > 0;
    }

    @Test
    public void givenRawData_CheckItsLengthIsDivisableBy25and6(){
        assert(theTestRawData.getTheRawData().length() % 25) == 0;
        assert(theTestRawData.getTheRawData().length() % 6) == 0;
    }
}
