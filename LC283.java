package OJ;

import java.util.Stack;

public class LC283 {
    static class Solution {
        public static void moveZeroes(int[] nums) {
            int len = nums.length;

            int i = 0;
            int indexofzero = 0;
            while(indexofzero < len && i < len){

                if(nums[i] != 0){
                    int tmp = nums[i];
                    nums[i]= nums[indexofzero];
                    nums[indexofzero] = tmp;
                }
                if(nums[indexofzero] != 0){
                    indexofzero++;
                }

                i++;
            }
        }
    }

    public static void main(String[] args) {
        LC283 test = new LC283();
        int[] nums = {1};
        Solution.moveZeroes(nums);
        for(int num : nums){
            System.out.printf(num + " ");
        }
    }
}
