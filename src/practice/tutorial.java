package practice;

public class tutorial {


    public static int factorial(int n){

        if(n == 0 || n== 1) return 1;

        int data = factorial(n-1);
        data = data * n;
        return data;
    }


    public static void fibonacciSequence(int a, int b, int n){

        if(n == 0 ){
            return ;
        }
        if( b==0){
            return;
        }

        int c = a + b;
        System.out.println(b);
        fibonacciSequence(b,c,n-1);
    }

    public static int powerN(int x, int n){

        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }

        int d = powerN(x ,n-1);
        int res = d * x;
        return res;
    }

    public static void reverseSting(StringBuilder str){
        StringBuilder updated = new StringBuilder("");
        for(int i = 0 ;i<str.length()/2;i++){
            int back = str.length() -i -1;

        char s = str.charAt(i);
        char s1 = str.charAt(back);

        str.setCharAt(back,s);
        str.setCharAt(i,s1);



        }

        System.out.println(str);
    }


    public static void towerOfHanoe(int n , String src, String help,String dest,int i){

        if(n== 1){
            System.out.println("Moving "+ n+ " from---- "+ src + " to "+ " "+ dest );
            return ;
        }

        towerOfHanoe(n-1,src,dest,help,i++);
        System.out.println("Moving "+ n+ " from "+ src + " to "+ " "+ dest);
        towerOfHanoe(n-1,help,src,dest,i++);
    }
    public static void main(String[] args){


        StringBuilder str = new StringBuilder("Kumar");

//       reverseSting(str);
//       int fact =factorial(4);
//        System.out.println(fact);

//        fibonacciSequence(0,1,10-2);
       int res=  powerN(2,10);
//        System.out.println(res + " result");


        towerOfHanoe(5,"source","helper","destination",0);
    }
}
