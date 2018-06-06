import java.util.ArrayList;
public class SquareArray{
  public static void main(String[] args) {
    int[] myarray = {1,5,10,-2};
    ArrayList<Integer> newarray = new ArrayList<Integer>();
    for (int i = 0; i < myarray.length; i++){
      myarray[i] *= myarray[i];
      newarray.add(myarray[i]);
    }
    System.out.println(newarray);
  }
}
