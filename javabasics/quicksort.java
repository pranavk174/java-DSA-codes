package javabasics;

public class quicksort {
//
    public static int partition(int[] arr,int low,int high){        // int[] arr = {3, 5, 1, 9, 2, 8, 7};
        int pivot = arr[high];
        int i = low -1;
        for(int j = low ; j< high ; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
           
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] =  temp;
       return i;
    }
    public static void sort (int[] arr,int low,int high){
        if (low < high) {
            int pidx = partition(arr, low, high);
            sort(arr, low, pidx - 1);
            sort(arr, pidx + 1, high);
        }

    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 9, 2, 8, 7};
        int n = arr.length;
        sort(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
