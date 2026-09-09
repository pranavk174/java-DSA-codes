package examrevision;
import java.util.*;
public class mergesort {

public static void conquer(int[] arr,int si,int ei,int mid) {
    int merged[] = new int[ei - si + 1];
    int idx1 = si;
    int idx2 = mid + 1;
    int x = 0;

    while (idx1 <= mid && idx2 <= ei) {
        if (arr[idx1] <= arr[idx2])
            merged[x++] = arr[idx1++];
        else
            merged[x++] = arr[idx2++];
    }


    while (idx1 <= mid) {
        merged[x++] = arr[idx1++];
    }
    while (idx2 <= ei) {
        merged[x++] = arr[idx2++];
    }
    for (int i = 0, j = si; i < merged.length; i++, j++) {
        arr[j] = merged[i];
    }
}




    public static void divide(int arr[] ,int si,int ei){
        int mid = si+(ei-si)/2;
        if(si >= ei)
        {
            return;
        }
            divide(arr,si,mid);
            divide(arr,mid+1,ei);
            conquer(arr,si,ei,mid);

    }
    public static void main(String[] args){
//

        int[] arr={3,5,1,7,2,9};

        divide(arr,0,arr.length-1);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+ ", ");
        }
    }
}










//public static void conquer(int[] arr,int si,int mid,int ei){
//    int[] merged = new int[ei-si+1];
//    int idx1= si;       // for the left array starting index
//    int idx2 = mid+1;  // for the right array starting index
//    int x= 0;
//    while(idx1 <= mid && idx2 <= ei){
//        if(arr[idx1] <= arr[idx2]){
//            merged[x++] = arr[idx1++];
//        } else{
//            merged[x++] = arr[idx2++];
//        }
//    }
//    while(idx1 <= mid){
//        merged[x++] = arr[idx1++];
//    }
//    while(idx2 <= ei){
//        merged[x++] = arr[idx2++];
//    }
//    for(int i =0,j=si ;i<merged.length;i++,j++){
//        arr[j] = merged[i];
//    }
//
//
//
//}
//
//public static void divide(int[] arr,int si,int ei){
//    if(si >= ei)
//        return;
//    int mid= si+ (ei-si)/2;
//    divide(arr,si,mid);
//    divide(arr,mid+1,ei);
//    conquer(arr,si,mid,ei);
//
//}




