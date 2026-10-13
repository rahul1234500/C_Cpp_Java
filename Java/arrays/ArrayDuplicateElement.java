import java.util.HashMap;
import java.util.Map;

public class ArrayDuplicateElement {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,1,3,2};
        Map<Integer, Integer> map = new HashMap<>();

        for(int i : arr){
            map.put(i, map.getOrDefault(i,0)+ 1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                System.err.println(entry.getKey());
            }
        }
    }
}
