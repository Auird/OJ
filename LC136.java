package OJ;

import java.util.HashMap;
import java.util.Map;

public class LC136 {
    public static int singleNumber(int[] nums) {
        int res = -1;
        Map<Integer, Integer> dic = new HashMap<>();
        for(int num : nums){
            if(dic.containsKey(num)){
                dic.put(num, dic.get(num)+1);
            }else{
                dic.put(num, 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : dic.entrySet()){
            if(entry.getValue() == 1){
                res = entry.getKey();
            }
        }
        return res;
    }

    public static int singleNumberUsingXOR(int[] nums){
        int res = nums[0];
        for(int i = 1; i < nums.length; i++){
            res ^= nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,4,4,4,3,4};
        //System.out.println(singleNumber(nums));
        System.out.println(singleNumberUsingXOR(nums));
    }
}
