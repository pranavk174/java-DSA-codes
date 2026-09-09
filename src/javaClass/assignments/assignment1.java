package javaClass.assignments;

public class assignment1 {
    public static void average(int[] arr){
        int size = arr.length;
        int sum = 0;
        for(int i=0;i<arr.length ;i++){
            sum += arr[i] ;
        }

        System.out.println(sum);
        double avg = sum / size ;

        System.out.println("the average is "+avg);

    }


    public static void areaOfSquare(int side){
        int area = side * side;
        System.out.println("area is "+area);
    }

    public static void totalPrice(float item1 , double item2 ,double item3){
        double bill = item1+item2+item3;
        System.out.println(bill);
        double  totalBill = bill+ (bill * 0.18 );
        System.out.println("the total bill after gst is "+totalBill);
    }

    public static void main(String[] args){

        int[] arr = {2,4,10};
        int side = 4;

        float pen = 10;
        double copy = 32.50;
        double pencil = 33 ;




        average(arr);
        areaOfSquare(side);
        totalPrice(pen , copy,pencil) ;

    }
}
