import java.util.HashMap;
import java.util.Map;

public class ArrayFrquencyCount {
    public static void main(String[] args) {
        int[] arr = {10,20,10,30,40,30,20,40};
        Map<Integer, Integer> map = new HashMap<>();

        for(int x : arr){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        System.err.println(map);
    }
}
