package dsaClass;

public class selectionsort {

    public static void Sort(int[] arr){
        int min = Integer.MIN_VALUE ;

        for(int i=0;i< arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] < arr[j]){
                   min = arr[i] ;


                }
            }
        }
    }
}
