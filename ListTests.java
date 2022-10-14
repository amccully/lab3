import static org.junit.Assert.*;
import org.junit.*;

public class ListTests {
    
    @Test 
	public void testFilter() {
        int[] input1 = { 3 };
        ArrayExamples.reverseInPlace(input1);
        assertArrayEquals(new int[]{ 3 }, input1);
	}
}

class compareStr implements StringChecker {

    String sc;
    compareStr(String sc) {
        this.sc = sc;
    }

    @Override
    public boolean checkString(String s) {
        return (this.sc == s);
    }

} 
