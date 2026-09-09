package dsaClass;

public class subArrays {

    public static void printSubArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            int start = i;
            for(int j=i;j<arr.length;j++){
                int end = j;
                for(int k=start;k<end;k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String args[]){
        int[] arr={2,4,1,5,7,8,0,10,21};
        printSubArray(arr);
    }
}
