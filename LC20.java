package OJ;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class LC20 {
    class Solution {
        public boolean isValid(String s) {

            Map<Character, Integer> tempMap = new HashMap<>();
            tempMap.put("(".charAt(0), -1);
            tempMap.put(")".charAt(0), 1);
            tempMap.put("{".charAt(0), -2);
            tempMap.put("}".charAt(0), 2);
            tempMap.put("[".charAt(0), -3);
            tempMap.put("]".charAt(0), 3);

            Stack<Character> myStack = new Stack<>();

            for(int i = 0; i < s.length(); i++){
                if(tempMap.get(s.charAt(i)) <  0){
                    myStack.push(s.charAt(i));
                }else{
                    if(myStack.isEmpty()){
                        return false;
                    }else{
                        Character temp = myStack.pop();
                        if(tempMap.get(temp) + tempMap.get(s.charAt(i)) != 0){
                            return false;
                        }
                    }
                }
            }

            if(myStack.isEmpty()){
                return true;
            }else{
                return false;
            }

        }
    }
}
