package practice;

public class sorting {

    public static void selectionSOrt(int[] arr){

        for(int i = 0;i< arr.length ;i++){
           for(int j = i+1;j< arr.length;j++){
               if(arr[i] > arr[j]){
                   int temp = arr[j];
                   arr[j] = arr[i];
                   arr[i] = temp;

               }
           }

        }
        for(int i = 0;i< arr.length ;i++){
            System.out.print(arr[i]);
        }
    }

 public static void main(String[] args){


        String str = "New Data Pranav Kumar";

        int[] arr = {3,2,0,5,1,8,6};
       selectionSOrt(arr);

    }
}
