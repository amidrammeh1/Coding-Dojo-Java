import java.util.ArrayList;

public class JavaBasic {
  

    public void printTo255(){
    for(int i = 0; i < 256; i++){
      System.out.println(i);
    }
  }

  public void printSumTo255(){
    int result = 0;
    for(int i = 0; i < 256; i++){
      result+=1;
      System.out.println("New number: " + i + " Result: " + result);
    }
  }

  public void printOddto255(){
    for (int i = 0; i < 256; i++){
      if (i % 2 == 1) {
        System.out.println(i);
      }
    }
  }

  public void iterateThroughArr(int [] array){
    for (int i = 0; i < array.length; i++) {
      System.out.println(i);
    }
  }
  
  public int printMaxValue(int[] array) {
    int maximum = array[0];
    for (int i = 0; i < array.length; i++){
      if( i > maximum) {
        maximum = i;
      }
    }
    return maximum;
  }

  public ArrayList<Integer> arrofOdd() {
    ArrayList<Integer> y = new ArrayList<Integer>();
    for (int i = 1; i < 256; i++){
      if(i % 2 !=0){
        y.add(i);
      }
    }
    return y;
  } 

  



}
