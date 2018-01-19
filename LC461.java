package OJ;

public class LC461 {
    static class Solution {
        public static int hammingDistance(int x, int y) {
            String xstr = Integer.toBinaryString(x);
            String ystr = Integer.toBinaryString(y);
            System.out.println(xstr);
            System.out.println(ystr);
            int count = 0;
            int length;
            if(xstr.length() > ystr.length()){
                length = xstr.length() - ystr.length();
                for(int i = 0; i < length; i ++){
                    ystr = "0"+ystr;
                }
            }else{
                length = ystr.length() - xstr.length();
                for(int i = 0; i < length; i ++){
                    xstr = "0"+xstr;
                }
            }
            System.out.println(xstr);
            System.out.println(ystr);
            for(int i = 0; i < xstr.length(); i++){
                //System.out.println(ystr.charAt(i));
                if(xstr.charAt(i) != ystr.charAt(i)){
                    count++;
                }
            }
            return count;
        }
    }

    public static void main(String[] args) {
        //Solution solution = new Solution();
        System.out.println(Solution.hammingDistance(1,4));
    }
}
