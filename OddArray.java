import java.util.ArrayList;
public class OddArray{
  public static void main(String[] args) {
    ArrayList<Integer> arlist = new ArrayList<Integer>();
    for (int i = 1; i < 255; i += 2) {
      arlist.add(i);
    }
    System.out.println(arlist);
  }
}
