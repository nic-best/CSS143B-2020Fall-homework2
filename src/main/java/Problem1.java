import java.util.Arrays;

public class Problem1 {

    /*
    Describe your algorithm here in up to 5 sentences:
    Establish a front, rear and two midpoints (1 away from eachother if even, on the same mid point if odd).
    Iterate through the array, alternating from the front side and the back side of the array.
    As we find 0s or 2s, swap them to the front or rear points, then add/subtract the front/rear point by 1
    If we find a 1, if we are on the left, swap it to leftBack point, if we are on the right, swap to rightBack point.
        Do not make a swap if the index is greater/less than our back/front variable for 1s or 2s.
     */

    // Do not change signature (function name, parameters type, and return type)
    public static void colorSort(int[] nums) {
        int leftFront = 0;
        int leftBack;
        if(nums.length%2==0){
             leftBack = nums.length/2 -1;
        }
        else{
            leftBack = nums.length/2;
        }
        int rightFront = nums.length/2;
        int rightBack = nums.length -1;

        int leftIndex = 0;
        int rightIndex = nums.length-1;
        boolean onLeft = true;
        for (int i = 0; i < nums.length; i++) {
            if(onLeft){
                if(nums[leftIndex]==0){
                    System.out.println("0");
                    swap(nums, leftIndex, leftFront);
                    leftFront++;
                }
                else if(nums[leftIndex]==1){
                    System.out.println("1");
                    if(leftIndex<leftBack){
                        swap(nums, leftIndex, leftBack);
                        leftBack--;
                    }
                    System.out.println(leftFront+" "+leftBack + " " + rightFront+ " " +rightBack);
                }
                else if(nums[leftIndex]==2){
                    System.out.println("2");
                    if(leftIndex<rightBack){
                        swap(nums, leftIndex, rightBack);
                        rightBack--;
                    }
                }
                leftIndex++;
            }
            else{
                if(nums[rightIndex]==0){
                    System.out.println("3");
                    swap(nums, rightIndex, leftFront);
                    leftFront++;
                }
                else if(nums[rightIndex]==1){
                    System.out.println("4");
                    if(rightIndex>rightFront){
                        swap(nums, rightIndex, rightFront);
                        rightFront++;
                    }

                }
                else if(nums[rightIndex]==2){
                    System.out.println("5");
                    if(rightIndex<rightBack){
                        swap(nums, rightIndex, rightBack);
                        rightBack--;
                    }
                }
                rightIndex--;
            }
            System.out.println("Right: " + rightIndex);
            onLeft=!onLeft;
        }
        System.out.println("im done!");
    }
    //pass by reference so we arent copying the array
    private static void swap(int[] nums, int from, int to){
        System.out.println(Arrays.toString(nums));
        System.out.println("Swapping index: "+from +" Value: " +nums[from] + " With index: "+to+" Value: "+ nums[to]);
        int temp = nums[from];
        nums[from] = nums[to];
        nums[to] = temp;
        System.out.println(Arrays.toString(nums));

    }
}
