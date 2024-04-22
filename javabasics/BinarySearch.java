package javabasics;


    public class BinarySearch {

        public static void binarySearch(int[] arr, int key, int size) {
            int left = 0;
            int right = size - 1;

            while (left <= right) {
                int mid = (left + right) / 2;
                if (arr[mid] == key) {
                    System.out.println(mid);
                    break;
                }
                if (arr[mid] < key)
                    left = mid + 1;
                else
                    right = mid - 1;
            }
        }
        public static void main(String[] args) {
            int[] arr = {3, 5, 7, 9, 12, 15, 18};
            int key = 5;
            int size = arr.length;
            binarySearch(arr, key, size);
        }


    }

