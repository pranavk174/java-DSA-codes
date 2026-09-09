package examrevision;

public class quicksort {

    public static int partition(int arr[],int low,int high){
        int pivot = arr[high];
        int  i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp= arr[high];
        arr[high] = arr[i];
        arr[i] = temp;

        return i;
    }
public static void Qsort(int[] arr,int low,int high){
    if(low < high){
        int pidx = partition(arr,low,high);
        Qsort(arr,low,pidx-1);
        Qsort(arr,pidx+1,high);
    }
}



    public static void main(String[] args){
        int[] arr = {4,1,6,2,8,9};
        int high = arr.length-1;
        Qsort(arr,0,high);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }


    }
}














//public static int partition(int[] arr,int low,int high) {
//    int pivot = arr[high];
//    int i = low-1;
//
//    for(int j=low;j<high;j++){
//        if(arr[j]<pivot){
//            i++;
//            int temp = arr[j];
//            arr[j]= arr[i];
//            arr[i] = temp;
//        }
//    }
//    i++;
//    int temp = arr[high];
//    arr[high]= arr[i];
//    arr[i] = temp;
//    return i;
//}
//public static void Qsort(int[] arr,int low,int high){
//    if(low<high){
//        int pidx = partition(arr,low,high);
//        Qsort(arr,low,pidx-1);
//        Qsort(arr,pidx+1,high);
//    }
//}