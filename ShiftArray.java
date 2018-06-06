import java.util.ArrayList;
public class ShiftArray{
  public static void main(String[] args) {
    int[] arr = {1,5,10,7,-2};
    ArrayList<Integer> newarray = new ArrayList<Integer>();
    for(int i=0; i<arr.length-1; i++){
        arr[i] = arr [i+1];
        newarray.add(arr[i]);
    }
        arr[arr.length-1] = 0;
        newarray.add(arr[arr.length-1]);
        System.out.println(newarray);
  }
}
