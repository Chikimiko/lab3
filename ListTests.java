import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ListTests {
  @Test
  public void test1() {
    List<String> list1 = new ArrayList<>();
    list1.add("cook");
    list1.add("ate");
    list1.add("cookie");
    List<String> solution = new ArrayList<>();
    solution.add("cook");
    solution.add("cookie");
    assertEquals(solution, ListExamples.filter(list1, new StringCheckerClass()));
  }

  @Test
  public void test2() {
    List<String> list1 = new ArrayList<>();
    list1.add("cook");
    list1.add("ate");
    List<String> solution = new ArrayList<>();
    solution.add("cook");
    assertEquals(solution, ListExamples.filter(list1, new StringCheckerClass()));
  }


}
