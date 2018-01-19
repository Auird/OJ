package OJ;

public class LC657 {
    class Solution {
        public boolean judgeCircle(String moves) {
            int sumLR = 0;
            int sumUD = 0;
            for(int i = 0; i < moves.length(); i++){
                if(moves.charAt(i) == "L".charAt(0)){
                    sumLR += -1;
                }else if(moves.charAt(i) == "R".charAt(0)){
                    sumLR += 1;
                }else if(moves.charAt(i) == "U".charAt(0)){
                    sumUD += 1;
                }else if(moves.charAt(i) == "D".charAt(0)){
                    sumUD += -1;
                }
            }
            if(sumLR == 0 && sumUD == 0){
                return true;
            }
            return false;
        }
    }
}
