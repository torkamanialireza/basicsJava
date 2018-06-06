import java.util.ArrayList;
public class ListNumbersoddTest {
	public static void main(String[] args) {
    ArrayList<Object> list = new ArrayList<Object>();
		for(int i = 1; i < 256; i = i + 2){
    	list.add(i);
    }
    System.out.println(list);
	}
}
