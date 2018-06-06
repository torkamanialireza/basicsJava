import java.util.ArrayList;
public class CalSum {
	public static void main(String[] args) {
    ArrayList<Object> list = new ArrayList<Object>();
    int sum = 0;
    for(int i = 1; i < 256; i = i + 2){
            list.add(i);
            sum += i;
    }
    System.out.println(sum);
	}
}
