package OJ;

public class LC547 {
    class Solution {
        public int findCircleNum(int[][] M) {
            int n = M.length;
            int count = 0;
            boolean[] flags = new boolean[n];
            for(int i = 0; i < n; i++) {
                flags[i] = false;
            }
            for(int i = 0; i < n; i ++){
                if(flags[i] == false){
                    DFS(i, M, flags);
                    count++;
                }
            }
            return count;
        }

        public void DFS(int i, int[][] M, boolean[] flags){
            flags[i] = true;
            for(int j = 0; j < M[i].length; j++){
                if(M[i][j] == 1 && flags[j] == false){
                    DFS(j, M, flags);
                }
            }
        }
    }

}
