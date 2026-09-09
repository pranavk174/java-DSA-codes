package examrevision;

public class factorial {

    public static void equals(int[] arr1 , int[] arr2){
        for(int i = 0;i< arr1.length;i++){
            if(arr1[i] == arr2[i]){
                System.out.println("the array is equal ");

            }
            else{
                System.out.println("the array is not equal");
            }
        }
    }
    public static void main(String args[]){
        int[] arr1 = {2,4,1,6,8,9};
        int[] arr2 = {2,4,1,6,8,9};

        equals(arr1,arr2);
    }
}
