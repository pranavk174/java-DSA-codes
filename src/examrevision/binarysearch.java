package examrevision;
import java.util.*;

public class binarysearch {

//    public static void Bsearch(int[] arr,int key,int si,int ei){
//        int mid = si + (ei-si)/2;
//
//        if(arr[mid]== key){
//            System.out.println("the key is found on the "+ mid+" index" );
//            return;
//        }
//        if(arr[mid]>key) {
//            Bsearch(arr, key, si, mid);
//        }
//        else if(arr[mid] < key) {
//            Bsearch(arr, key, mid+1,ei);
//        }
//
//    }

    public static void Bsearch(int[] arr, int key ,int si,int ei){
        int mid = (si + ei)/2;

        if(si>ei){

            System.out.println("Sorry the key is not present in the Array");
            return;
        }
        if(arr[mid] == key){
            System.out.println("the key is found and is present at the index "+ mid);
            return;
        }


        else if(arr[mid] < key){
            Bsearch(arr ,key , mid+1 ,ei);
        }
        else if(arr[mid]> key){
            Bsearch(arr ,key ,si, mid );
        }

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,4,7,8,10,15};
        System.out.print("enter the key to find -> ");
        int key = sc.nextInt();
        Bsearch(arr,key,0,arr.length-1);


    }
}
