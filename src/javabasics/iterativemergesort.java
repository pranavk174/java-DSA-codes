package javabasics;

public class iterativemergesort {


        public static void merge(int[] arr, int left, int mid, int right) {
            int n1 = mid - left + 1;
            int n2 = right - mid;

            int[] leftArray = new int[n1];
            int[] rightArray = new int[n2];

            // Copy data to temporary arrays leftArray[] and rightArray[]
            for (int i = 0; i < n1; ++i) {
                leftArray[i] = arr[left + i];
            }
            for (int j = 0; j < n2; ++j) {
                rightArray[j] = arr[mid + 1 + j];
            }

            // Merge the temporary arrays
            int i = 0, j = 0;
            int k = left;
            while (i < n1 && j < n2) {
                if (leftArray[i] <= rightArray[j]) {
                    arr[k] = leftArray[i];
                    i++;
                } else {
                    arr[k] = rightArray[j];
                    j++;
                }
                k++;
            }

            // Copy remaining elements of leftArray[], if any
            while (i < n1) {
                arr[k] = leftArray[i];
                i++;
                k++;
            }

            // Copy remaining elements of rightArray[], if any
            while (j < n2) {
                arr[k] = rightArray[j];
                j++;
                k++;
            }
        }

        public static void iterativeMergeSort(int[] arr) {
            int n = arr.length;

            for (int currentSize = 1; currentSize <= n - 1; currentSize *= 2) {
                for (int left = 0; left < n - 1; left += 2 * currentSize) {
                    int mid = Math.min(left + currentSize - 1, n - 1);
                    int right = Math.min(left + 2 * currentSize - 1, n - 1);
                    merge(arr, left, mid, right);
                }
            }
        }

//        public static void printArray(int[] arr) {
//            for (int value : arr) {
//                System.out.print(value + " ");
//            }
//            System.out.println();
//        }

        public static void main(String[] args) {
            int[] arr = {12, 11, 13, 5, 6, 7};


            System.out.println("Original array:");
            for(int i=0 ;i< arr.length ;i++)
            {
                System.out.print( " " + arr[i]);
            }


            iterativeMergeSort(arr);

            System.out.println("\nSorted array:");
            for(int i=0 ;i< arr.length ;i++)
            {
                System.out.print(" " +arr[i]);
            }
        }
    }


