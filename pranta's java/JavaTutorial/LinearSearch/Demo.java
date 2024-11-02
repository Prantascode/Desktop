package JavaTutorial.LinearSearch;

public class Demo {
    public static void main(String[] args) {
        int nums[] = {3, 5, 7, 9, 11};
        int target = 11;

        int result1 = LinearSearch(nums,target);
        
        if(result1 != -1){
            System.out.println("Element found at "+result1);
        }
        else{
            System.out.println("Element not found");
        }

        int result2 = BinarySearch(nums, target);
        
        if(result2 != -1){
            System.out.println("Element found at "+result2);
        }
        else{
            System.out.println("Element not found");
        }
    }
    //LinearSearch
    public static int LinearSearch(int[] nums, int target){
        int steps = 0;
        for(int i = 0;i<=nums.length;i++){
            steps++;
            if(nums[i] == target){
                System.out.println("Steps in Linear Search "+steps);
                return i;  
            }   
        }
        System.out.println("Steps in Linear Search "+steps);
        return -1;
            
    }
    //BinarySearch
    public static int BinarySearch(int[] nums, int target){
        int step = 0;
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            step++;
            int mid = (left + right)/2;
            if(nums[mid] == target){
                System.out.println("Steps in Binary Search "+step);
                return mid;
            }
            else if(nums[mid]<target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        System.out.println("Steps in Binary Search "+step);
        return -1;
    }
}
