public class JavaBasicTest {
 
    
    public static void main(String[] args) {
        JavaBasic basics = new JavaBasic();

        System.out.println("Print Numbers from 1 to 255");

        basics.printTo255();

        System.out.println("Print Sum to 255");

        basics.printSumTo255();

        System.out.println("Print Odd Numbers to 255");
        basics.printOddto255();

        System.out.println("Print Maximum Value in array");
        int [] array = {5, 7, 31, 7};
        System.out.println(basics.printMaxValue(array));

        System.out.println("Array With Odd Numbers");
        System.out.println(basics.arrofOdd());
        
}

}