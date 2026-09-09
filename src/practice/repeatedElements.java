package practice;

public class repeatedElements {
    public static void printRepeat(int[] arr){
        for(int i = 0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    System.out.print(arr[i]+" ");
                }

            }
        }
    }
    public static void main(String args[]){
        int[] arr = {2,4,1,6,8,2 ,6 ,1,4};

        printRepeat(arr) ;
    }
}
