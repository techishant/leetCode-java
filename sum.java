/**
 * @author : Ishant Sharma
 * @created : 2023-02-11
 *
 * Give an array of integers num and an integer target, return indices of the two numbers such that they add up to target.
**/

public class sum{
  public static void main(String[] args){
    int[] nums = {2,7,11,15};
    int target = 9;
    int[] out = findSum(nums,9);
    for(int i = 0; i<out.length; i++){
      System.out.print(out[i] + " ");
    }
    System.out.println();
  }

  public static int[] findSum(int[] nums, int target){
    int[] out = new int[2];
    for(int i = 0; i<nums.length; i++){
      for(int j = 0; j<nums.length; j++){
        if(i!=j){
          if(nums[i] + nums[j] == target){
            out[0] = i;
            out[1] = j;
          }
        }
      }
    }
    return out;
  }

}

