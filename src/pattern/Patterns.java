package pattern;

public class Patterns {

    public static void hollowRectangle(int n){
        for(int i=0;i<n-1;i++){
            for(int j = 0 ;j < n;j++){

                if((i == 0 || i == 3) || (j== 0 || j == n-1 ) ){
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }


public static void rightTrianglePattern(int n){
        for(int i=0;i<n;i++){
            for(int j= n ;j>n-i-1 ;j --  ){
                    System.out.print("");
                    System.out.print(" *");
            }
            System.out.println();
        }
}

public static void leftTrinagle(int n ){

        for(int i =0;i< n;i++){
            for(int j= i ;j<n ;j++ ){
                System.out.print("  ");
            }
            for(int k = 0 ;k<=i ;k++){
                System.out.print(" *");
            }
            System.out.println();
        }
}

public static void invertedHaflPyramid(int n){
        for(int i = 0;i<n;i++){
            for(int j=1; j<n-i ;j++ ){
                System.out.print(j+" ");
            }
            System.out.println();
        }
}

public static void floydsTriangle(int n){
        int num =1;
        for (int i = 1; i <= n; i++) {
     for (int j = 1; j <= i; j++) {
        if (num <= n * (n + 1) / 2) {
            System.out.print(num + " ");
            num++;
        } else {
            System.out.print(" ");

        }
    }
    System.out.println(); // Move to the next row
}
}


public static void zeroOneTriangle(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                if( (j +i) % 2==0 ){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
}

public static void numberPyramid(int n){
        for(int i=0;i<n;i++){
            for(int j= n ;j >i;j-- ){
                System.out.print(i);
            }
            for(int k=i;k<n;k++){
                System.out.print(i);
            }
            System.out.println();
        }
}

    public static void main(String args[]){
    hollowRectangle(5);
        System.out.println();
        rightTrianglePattern(5);
        System.out.println();
        leftTrinagle(4);
        System.out.println();
        invertedHaflPyramid(6);
        System.out.println();
        floydsTriangle(6);
        System.out.println();
        zeroOneTriangle(5);
        System.out.println();
        numberPyramid(5);



    }
}
