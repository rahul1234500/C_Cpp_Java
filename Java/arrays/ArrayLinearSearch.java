import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class ArrayLinearSearch {
    public static void main(String[] args) {
        int[] numberList = {10,20,30,40,50,60};
        int findTarget = 50;
        System.err.println("My Target is : " + findTarget);
        int index = -1;
        for(int i = 0; i < numberList.length; i++){
            if(numberList[i] == findTarget){
                index = i;
                break;
            }
        }
        System.err.println("Index : " + index);
    }
}
