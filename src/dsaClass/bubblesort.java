package dsaClass;

public class bubblesort {
    public static void Sort(int[] arr){

        for(int i=0;i<arr.length;i++){
            for(int j = i+1;j< arr.length;j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + "->");
        }

    }
    public static void main(String args[]){
        int[] arr = {2,1,4,3,7,5,0,8};
        Sort(arr);
    }
}
