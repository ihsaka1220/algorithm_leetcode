package backTrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class solveNQueens {

    List<List<String>> results = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        char[][] chessBoard = new char[n][n];
        for(char[] c:chessBoard){
            Arrays.fill(c,'.');
        }
        backTrack(chessBoard,0,n);
        return results;
    }

    void backTrack(char[][] chessBoard, int row, int n) {
        if(row==n){
            results.add(Array2List(chessBoard));
            return;
        }
        for(int col = 0; col<n; col++){
            //左上角、右上角不是
            if(isVaild(chessBoard,row,col,n)){
                chessBoard[row][col]='Q';
                backTrack(chessBoard,row+1,n);
                chessBoard[row][col]='.';
            }
        }
    }

    private boolean isVaild(char[][] chessBoard, int row, int col, int n) {
        if(row==0&&col==0){
            return true;
        }
        for(int x=row-1,y=col-1;x>=0 && y>=0;x--,y--){
            if(chessBoard[x][y]=='Q'){
                return false;
            }
        }
        for(int x=row-1,y=col+1;x>=0 && y<n;x--,y++){
            if(chessBoard[x][y]=='Q'){
                return false;
            }
        }
        for(int y = row-1; y >=0; y--){
            if(chessBoard[y][col]=='Q'){
                return false;
            }
        }
        return true;
    }

    private List<String> Array2List(char[][] chessBoard) {
        List<String> res=new ArrayList<>();
        for(char[] c: chessBoard){
            res.add(new String(c));
        }
        return res;
    }
}