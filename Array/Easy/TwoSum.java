import java.util.HashMap;
import java.util.Scanner;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */

public class TwoSum {

  public static int[] twoSum(int[] nums, int target) {

    HashMap<Integer, Integer> map = new HashMap<>();

    for(int i=0;i<nums.length;i++){
      int value = target-nums[i];
      if(map.containsKey(value)){
        System.out.println("Indices -> " + map.get(value) + "," + i);
        return new int[] {map.get(value),i};
      }
      map.put(nums[i], i);
    }

    System.out.println("No element found....");
    return new int[] {};

  }

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter total number of elements....");
    int n = scanner.nextInt();

    int[] nums = new int[n];
    System.out.println("Enter " + n + " numbers:");
    for (int i = 0; i < n; i++) {
      nums[i] = scanner.nextInt();
    }

    System.out.print("Enter target: ");
    int target = scanner.nextInt();

//    int[] nums = {2,6,11,15};
//    int target = 9;

    twoSum(nums,target);

  }
}
