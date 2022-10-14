import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test 
	public void testReverseInPlace3() {
    int[] input1 = { 3, 2, 4 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 4, 2, 3 }, input1);
	}

  @Test 
	public void testReverseInPlace4() {
    int[] input1 = { 3, 2, 4, 5 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 5, 4, 2, 3 }, input1);
	}

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed3() {
    int[] input1 = { 1, 2, 3 };
    assertArrayEquals(new int[]{ 3, 2, 1 }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed3alt() {
    int[] input1 = { 1, 2, 0 };
    assertArrayEquals(new int[]{ 0, 2, 1 }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverageWithoutLowestEmpty() {
    double[] input1 = { };
    assertEquals(0, ArrayExamples.averageWithoutLowest(input1), 0);
  }

  @Test
  public void testAverageWithoutLowest1() {
    double[] input1 = { 11.0 };
    assertEquals(0, ArrayExamples.averageWithoutLowest(input1), 0);
  }

  @Test
  public void testAverageWithoutLowest2() {
    double[] input1 = { 1.2, 1.21 };
    assertEquals(1.21, ArrayExamples.averageWithoutLowest(input1), 0);
  }

  @Test
  public void testAverageWithoutLowest3() {
    double[] input1 = { 1.2, 1.21, 0.0 };
    assertEquals((1.21+1.2)/2.0, ArrayExamples.averageWithoutLowest(input1), 0);
  }

  @Test
  public void testAverageWithoutLowestDupes() {
    double[] input1 = { 1.0, 1.0, 1.0, 2.0 };
    assertEquals((1.0+1.0+2.0)/3.0, ArrayExamples.averageWithoutLowest(input1), 0);
  }

}
