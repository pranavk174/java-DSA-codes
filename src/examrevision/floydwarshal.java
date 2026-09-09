package examrevision;

public class floydwarshal {
    public static void floydWarshal(int[][] arr){
        int n= arr.length;

        for(int k = 0;k<n;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    arr[i][j] = Math.min(arr[i][j],arr[i][k]+arr[k][j]);
                }
            }

        }

    }

    public static void main(String[] args){

        int inf = 100000;
//        int[][] arr = {
//                {0,inf,6,3,inf},
//                {3,0,inf,inf,inf},
//                {inf,inf,0,2,inf},
//                {inf,1,1,0,inf},
//                {inf,4,inf,2,0}
//        };

//        int[][] arr= {
//                {0,8,inf,1},
//                {inf,0,1,inf},
//                {4,inf,0,inf},
//                {inf,2,9,0}
//        };


        int[][] arr=
                {
                        {0,3,inf,5},
                        {2,0,inf,4},
                        {inf,1,0,inf},
                        {inf,inf,2,0}
                };



        int n= arr.length;
        floydWarshal(arr);
        for(int i=0;i< n;i++){
            for(int j = 0;j<n;j++){
                if(arr[i][j] == inf)
                    System.out.print("inf ");
                else
                    System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
