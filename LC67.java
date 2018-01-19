package OJ;

public class LC67 {
    static class Solution {
        public static String addBinary(String a, String b) {
            long aa = getNumber(a);
            long bb = getNumber(b);
            long res = aa + bb;
            return Long.toBinaryString(res);
        }

        public static long getNumber(String a){
            long res = 0;
            for(int i = a.length()-1; i >=0 ; i--){
                res +=  Character.getNumericValue(a.charAt(i)) * Math.pow(2, a.length() - 1 - i);
            }
            return res;
        }

    }

    public static void main(String[] args) {
        System.out.println(Solution.addBinary("1111","11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111"));
    }
}
