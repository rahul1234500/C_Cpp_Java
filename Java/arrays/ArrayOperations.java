import java.util.Arrays;
import java.util.OptionalInt;
public class ArrayOperations{
    public static void main(String[] args) {
        int[] numberList = {10,20,30,40};
        System.err.println("Array traversal");
        Arrays.stream(numberList).forEach(System.out::println);
        int findTarget = 20;
        System.err.println("Array Searching");
        System.err.println("Target Value = " + findTarget);
        
        Arrays.stream(numberList).filter(num -> num == findTarget).forEach(num -> System.out.println("Get Target : " + num));
        int sum = Arrays.stream(numberList).sum();
        
        System.err.println("Summation of All Element in Array :" + sum);

        OptionalInt maxNum = Arrays.stream(numberList).max();
        maxNum.ifPresent(max -> System.err.println("Maximum Element : " + max));
        OptionalInt minNum = Arrays.stream(numberList).min();
        minNum.ifPresent(min -> System.err.println("Minimum Element : " + min));
        

    } 
}