public class FizzBuzz {
  public static void main(String[] args) {

  }

  public String fizzBuzz(int number) {
    for (int i = 1; i < number; i++) {
      if (i % 3 == 0 && i % 5 ==0){
        return "Fizz Buzz";
      }
      else if (i % 3 == 0) {
        return "Fizz";
      }
      else if (i % 5 == 0) {
        return "Buzz";
      }
      else {
        System.out.println(Integer.toString(i));
      }
    }
    return null;
  }


}