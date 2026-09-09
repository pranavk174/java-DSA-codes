package examrevision;

class Nqueen{
    public static boolean isSafe(char[][] board,int row,int col){
        int l = board.length;

        for( int i=row-1;i>=0;i--){
            if(board[i][col] == 'Q')
                return false;
        }
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j] == 'Q')
                return false;
        }
        for(int i=row-1,j=col+1;i>=0 && j<l;i--,j++){
            if(board[i][j] == 'Q')
                return false;
        }
        return true;
    }
    public static boolean isSafety(char[][] board,int row,int col){
        int l = board.length;
        //for vertical up
        for(int i = row-1;i>=0;i--){
            if (board[i][col] == 'Q')
                return false;
        }
        // for left diagonal up
        for(int i = row-1,j = col-1; i>=0 && j>=0 ;i--,j--){
            if (board[i][j] == 'Q')
                return false;
        }
        // for right diagnal up
        for(int i = row-1,j= col+1;i>=0 && j<l;i--,j++){
            if (board[i][j] == 'Q')
                return false;
        }
        return true;
    }
    public static void nqueen(char[][] board,int row){
        int l = board.length;

        if(row == l){
            printboard(board);
        }

        for(int j=0;j<l;j++){
            if(isSafe(board,row,j)){
                board[row][j] = 'Q';
                nqueen(board,row+1);
                board[row][j]= '_';
            }
        }
    }


    public static void printboard(char[][] board){
        int l = board.length;
        System.out.println("------chess board------");
        for(int i=0;i<l;i++){
            for(int j=0;j<l;j++){
                System.out.print(board[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int n= 4;
        char[][] board= new char[n][n];

        for(int i=0;i<n;i++){
            for(int j =0;j<n;j++){
                board[i][j] = '_';
            }
        }
        nqueen(board,0);
    }
}