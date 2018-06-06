public class GetAverage{
  public static void main(String[] args) {
    int average;
    int sum = 0;
    int[] list = {2, 10, 3};
    for(int i = 0; i < list.length; i++){
      sum += list[i];
    }
    average = sum/list.length;
    System.out.println(average);
  }
}
