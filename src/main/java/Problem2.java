import java.util.Arrays;

public class Problem2 {

    /*
    Describe your algorithm here in up to 5 sentences:
    While loop keeps moving until it finds the next unique number.
    The current number is then overwrites the value at the the next available position where we can store unique numbers at the beginning of the array.
    The recursive algorithm is called with the new unique number the loop found and the next available position where we can store unique numbers at the beginning of the array.
    Once the index is out of bounds of the original array length, the recursive function returns the last position of a unique number that was saved.
    The main function returns that position plus one because the last index of an array is 1 less than the length of the array.
     */

    // Do not change signature (function name, parameters and return type)
    // Do not use extra space for another array. Solution to be in-pace with O(1) extra memory
    public static int remove(int[] nums) {
        if(nums!=null && nums.length>0){
            return recur(nums, nums[0], 0, 0)  +1; //arrays start at 0, have to add an extra
        }
        return 0;
    }
    private static int recur(int[] nums, int target, int index, int position){
        boolean isFirst = true;
        while(index<nums.length&&nums[index]==target){
            index++;
        }
        nums[position]=target;
        if(index<nums.length){
            position = recur(nums, nums[index], index, ++position);
        }

        return position;
    }
}
