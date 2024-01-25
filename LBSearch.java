public class LBSearch {
    public static void main(String[] args) {

        int nums[] = {1, 3, 6, 7, 89, 90, 99};
        int item  = 89;

        int result1 = linearSearch(nums, item);
        int result2 = binarySearch(nums, item, 0 , nums.length-1);
        if(result1 != -1)
        System.out.println("Element at index : " + result1);
        else
            System.out.println("Element not found");

    }

    public static int linearSearch(int nums [], int item){
        int steps = 0;
        for(int i = 0; i < nums.length; i++){
            steps++;
            if (nums[i] == item) {
                System.out.println("Steps taken by Linear Search: " + steps);
                return i;
            }
        }
        System.out.println("Steps taken by Linear Search: " + steps);
        return - 1;
    }
    public static int binarySearch(int nums[], int item, int left, int right){
        int steps = 0;

        if(left <= right){
            int mid = (left+right)/2;
            if(nums[mid] == item)
                return mid;
            else if(nums[mid] < item)
               return binarySearch(nums, item, mid+1, right);

            else
                return binarySearch(nums, item, left, mid-1);

        }
        return -1;
    }
}
