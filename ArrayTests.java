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
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void test1() {
    int[] input1 = {1};
    assertArrayEquals(new int[]{1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void test2() {
    int[] input1 = {0};
    assertArrayEquals(new int[]{0}, ArrayExamples.reversed(input1));
  }
  
  @Test
  public void test3() {
    int[] input1 = {0,1};
    assertArrayEquals(new int[]{1,0}, ArrayExamples.reversed(input1));
  }
  
  @Test
  public void test4() {
    int[] input1 = {1,2,3};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{3,2,1}, input1);
  }

  @Test
  public void test5() {
    int[] input1 = {1,0,1};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{1,0,1}, input1);
  }

  @Test
  public void test6() {
    int[] input1 = {1,0,4,1};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{1,4,0,1}, input1);
  }

  @Test
  public void test7() {
    double[] input1 = {};
    double solution = 0.0;
    assertEquals(solution, ArrayExamples.averageWithoutLowest(input1), 0);
  }
  
  @Test
  public void test8() {
    double[] input1 = {1};
    double solution = 0.0;
    assertEquals(solution, ArrayExamples.averageWithoutLowest(input1), 0);
  }
  
  @Test
  public void test9() {
    double[] input1 = {1,2,3};
    double solution = 2.5;
    assertEquals(solution, ArrayExamples.averageWithoutLowest(input1), 0);
  }

  @Test
  public void test10() {
    double[] input1 = {1, 2, 1};
    double solution = 1.5;
    assertEquals(solution, ArrayExamples.averageWithoutLowest(input1), 0);
  }

}
