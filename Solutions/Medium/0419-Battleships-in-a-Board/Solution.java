class Solution {
    boolean[][] vis;
    char[][] board_g ;
    int[][] dir = {{0,1}, {-1,0}, {1,0}, {-1,0}}; 
    public int countBattleships(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        vis = new boolean[m][n];
        board_g=board;
        int cnt = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='X' && !vis[i][j]){
                    cnt++;
                    dfs(board, i, j);
                }
            }
        }
        return cnt;
    }

    public void dfs(char[][] board, int i, int j){
        for(int[] d:dir){
            boolean check=false;
            int new_i = i+d[0];
            int new_j = j+d[1];
            if(!check && new_i>=0 &&new_i<board_g.length && new_j>=0&&new_j<board_g[0].length && board_g[new_i][new_j]=='X'&&!vis[new_i][new_j]){
                check = true;
                vis[new_i][new_j] = true;
                dfs(board_g, new_i, new_j);
            }
        }
    }
}