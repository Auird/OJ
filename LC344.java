package OJ;

public class LC344 {
    public static String reverseString(String s) {
        //String res = "";
        char[] tmp = s.toCharArray();
        for(int i = 0; i < tmp.length/2; i++){
            char val = tmp[i];
            tmp[i] = tmp[tmp.length - 1 - i];
            tmp[tmp.length - 1 - i] = val;
        }
        s = String.valueOf(tmp);
        return s;
    }

    public static void main(String[] args) {
        System.out.println(reverseString("hello"));
    }
}
