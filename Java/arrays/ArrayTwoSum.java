public class ArrayTwoSum {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int target = 10;
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if(sum == target){
                System.err.println(arr[left] + " + " + arr[right] + " = " + target);
                break;
            } else if(sum < target){
                left++;
            } else {
                right--;
            }

        }
    }
}
