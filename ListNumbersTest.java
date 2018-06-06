import java.util.ArrayList;
public class ListNumbersTest {
	public static void main(String args[]) {
    ArrayList<Object> list = new ArrayList<Object>();
    for (int i=1; i<255; i++) {
      list.add(i);
	  }
    System.out.println(list);
  }
}
