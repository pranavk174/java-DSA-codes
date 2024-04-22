package javabasics.dynamicprogramming;

public class Nqueen {
    public static boolean isSafe(char[][] board,int row,int col){
        int l = board.length;
        //for vertical up
        for(int i = row-1;i>=0;i--){
            if (board[i][col] == 'Q')
                return false;
        }
        // for left diagonal up
        for(int i = row-1, j = col-1; i>=0 && j>=0 ;i--,j--){
            if (board[i][j] == 'Q')
                return false;
        }
        for(int i = row-1,j= col+1;i>=0 && j<l;i--,j++){
            if (board[i][j] == 'Q')
                return false;
        }
        return true;
    }
    public static void Nqueenp(char[][] board,int row){

        int l = board.length;
        //base case
        if(row == l){
            printboard(board);
            return;
        }
        // column loop
            for(int j=0 ;j<l;j++){
                if (isSafe(board,row,j)) {
                    board[row][j] = 'Q';
                    Nqueenp(board, row + 1);       //call for next row
                    board[row][j] = '*';        //backtrack step
                }

            }
    }
    public static void printboard( char[][] board){
        int l = board.length;
        System.out.println("------------ Chess Board -----------");

        for(int i=0;i<l;i++){
            for(int j=0 ;j<l;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int n= 8;
        char[][] board = new char[n][n];

        //  initialization
        for(int i=0;i<n;i++){
            for(int j=0 ;j<n;j++){
                board[i][j] = '*';
            }
        }
        Nqueenp(board,0);
    }
}
