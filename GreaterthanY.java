public class GreaterthanY{
  public static void main(String[] args) {
    int[] myarray = {1,3,5,7};
    int number = 5;
    for (int i = 0; i < myarray.length; i++){
      if(myarray[i] == number){
        int great = i+1;
        System.out.println("index number is :" + great);
      }
    }
  }
}
