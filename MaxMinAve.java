import java.util.ArrayList;
public class MaxMinAve{
  public static void main(String[] args) {
    int[] myarray = {1,5,10,-2};
    int max = myarray[0];
    int min = myarray[1];
    double sum = 0;

    for (int i = 0; i < myarray.length; i++) {
      if(myarray[i] < min){
        min = myarray[i];
      }
      if(myarray[i] > max){
        max = myarray[i];
      }
      sum += myarray[i];
    }
    double ave = sum/ myarray.length;
    System.out.println("[" + max + "," + min +","+ave+"]");

  }
}
