package javabasics;

public class bubblesort {

    public static void printArr(int[] arr){

        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
    public static void insertionSort(int[] arr){

        for(int i = 1;i<arr.length ;i++){
            int current = arr[i];
            int j = i-1;
            while(j >=0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = current;
        }


        printArr(arr);
    }

    public static void Bsort(int[] arr) {
        int n = arr.length;
//        int[] sorted = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i = 0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }



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


    public static void main(String[] ags){
        int[] arr = {4,1,6,2,8,3};
//        Bsort(arr);
//        selectionSOrt(arr);
        printArr(arr);
        insertionSort(arr);



    }
}
