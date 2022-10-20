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
    list1.add("cookies");
    list1.add("ate");
    list1.add("cookie");
    List<String> solution = new ArrayList<>();
    solution.add("cook");
    solution.add("cookies");
    solution.add("cookie");
    assertEquals(solution, ListExamples.filter(list1, new StringCheckerClass()));
  }

  @Test
  public void test3() {
    List<String> list1 = new ArrayList<>();
    list1.add("cook");
    list1.add("ate");
    list1.add("cookies");
    List<String> list2 = new ArrayList<>();
    list1.add("and");
    list1.add("milk");
    List<String> solution = new ArrayList<>();
    solution.add("cook");
    solution.add("ate");
    solution.add("cookies");
    solution.add("and");
    solution.add("milk");
    assertEquals(solution, ListExamples.merge(list1, list2));
  }

}
