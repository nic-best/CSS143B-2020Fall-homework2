import java.util.Arrays;

public class Problem1 {

    /*
    Describe your algorithm here in up to 5 sentences:
    Establish a front, rear and two midpoints.
    Iterate through the array, alternating from the front side and from the back side of the array.
    As we find 0s or 2s, swap them to the front or rear points, then add/subtract the front/rear point by 1
    If we find a 1, if we are on the left, swap it to leftBack point, if we are on the right, swap to rightBack point.
        Do not make a swap if the index is greater/less than our back/front variable for 1s or 2s.
     */

    // Do not change signature (function name, parameters type, and return type)
    public static void colorSort(int[] nums) {
        if(nums==null || nums.length==0){
            return;
        }
        int leftFront = 0;
        int leftBack;
        //if even, midpoints surround the true mid (ie length 4 will give midpoints 1 and 2)
        if(nums.length%2==0){
             leftBack = nums.length/2 -1;
        }
        //if odd, midpoints are the true mid (ie length 4 will give midpoints 1 and 1
        else{
            leftBack = nums.length/2;
        }
        int rightFront = nums.length/2;
        int rightBack = nums.length -1;

        //indexes of where we are from either side of the array
        int leftIndex = 0;
        int rightIndex = nums.length-1;
        boolean onLeft = true;
        //not used to loop "through" the array, but instead to run our algo for each value of the array
        //alternates from left or right using a boolean
        //increments either left index or right index
        //will increment/decrement our front, rear, or either midpoint depending on the action it takes.
        for (int i = 0; i < nums.length; i++) {
            if(onLeft){
                if(nums[leftIndex]==0){
                    swap(nums, leftIndex, leftFront);
                    leftFront++;
                }
                else if(nums[leftIndex]==1){
                    if(leftIndex<leftBack){
                        swap(nums, leftIndex, leftBack);
                        leftBack--;
                    }
                }
                else if(nums[leftIndex]==2){
                    if(leftIndex<rightBack){
                        swap(nums, leftIndex, rightBack);
                        rightBack--;
                    }
                }
                leftIndex++;
            }
            else{
                if(nums[rightIndex]==0){
                    swap(nums, rightIndex, leftFront);
                    leftFront++;
                }
                else if(nums[rightIndex]==1){
                    if(rightIndex>rightFront){
                        swap(nums, rightIndex, rightFront);
                        rightFront++;
                    }
                }
                else if(nums[rightIndex]==2){
                    if(rightIndex<rightBack){
                        swap(nums, rightIndex, rightBack);
                        rightBack--;
                    }
                }
                rightIndex--;
            }
            onLeft=!onLeft;
        }
    }

    //pass by reference so we arent copying the array
    private static void swap(int[] nums, int from, int to){
        int temp = nums[from];
        nums[from] = nums[to];
        nums[to] = temp;
    }
}
