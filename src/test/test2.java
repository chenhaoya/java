package test;
import java.util.*;
public class test2 {
    int r;//行数
    int c;//列数
    int size;//woed长度
    char []words;//word数组
    private int[] ;

    public boolean exist(char[][] board, String word) {
        c=board[0].length;
        r=board.length;
        size=word.length();
        words=word.toCharArray();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                    if (board[i][j] == words[0] && match(board, 0, i, j))
                        return true;
            }
        }
        return false;
    }
    public boolean match(char[][]board,int index,int x,int y){
        if(index==size)
            return true;
        if(x<0||x>=r||y<0||y>=c||board[x][y]!=words[index]|| board[x][y] == '#')
            return false;
        char temp=board[x][y];
        board[x][y]='#';
        boolean asn=match(board,index+1,x+1,y)||match(board,index+1,x,y-1)||match(board,index+1,x,y+1)||match(board,index+1,x-1,y);
        board[x][y]=temp;
        return asn;
    }
    public int removeDuplicates(int[] nums) {
        String aa=nums.toString();
        aa.l
    }
}