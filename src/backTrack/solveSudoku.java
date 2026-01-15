package backTrack;

public class solveSudoku {
    public void solveSudoku(char[][] board) {
        backTrack(board);
    }
    public boolean backTrack(char[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]!='.'){
                    continue;
                }
                for(char k='1';k<='9';k++){
                    if(isVaild(board,i,j,k)){ // (i, j) 这个位置放k是否合适
                        board[i][j]=k;
                        if(backTrack(board)){
                            return true; // 如果找到合适一组立刻返回
                        }
                        board[i][j]='.'; // 回溯，撤销k
                    }
                }
                return false;    // 9个数都试完了，都不行，那么就返回false
            }
        }
        return true;    // 遍历完没有返回false，说明找到了合适棋盘位置了
    }

    private boolean isVaild(char[][] board, int i, int j, char k) {
        for(int y=0;y<board[0].length; y++){
            if (board[i][y]==k) {
                return false;
            }
        }
        for (char[] chars : board) {
            if (chars[j] == k) {
                return false;
            }
        }
        int startRow=(i/3)*3,endRow=startRow+3;
        int startCol=(j/3)*3,endCol=startCol+3;
        for(int x=startRow;x<endRow;x++){
            for(int y=startCol;y<endCol;y++){
                if(board[x][y]==k){
                    return false;
                }
            }
        }
        return true;
    }
}
