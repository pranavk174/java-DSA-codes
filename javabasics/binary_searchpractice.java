package javabasics;

public class binary_searchpractice {
    public static void binaryS(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;


        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == key){
                System.out.println(mid);
                return; }
            else if (key < arr[mid])
                right = mid - 1;
            else if (key > arr[mid])
                left = mid + 1;
        }
    }
    public static void main(String args[]) {
        int[] arr = {2, 4, 6, 8, 9, 12, 15};
        int key = 4;
        binaryS(arr,key);
    }
}
