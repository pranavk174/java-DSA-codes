package dsaClass;

public class alphabetPattern {
    public static void main(String args[]){
        char[] arr = {'A','B','C','D','E','F','G','H','I'};

        for(int i=0 ;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                System.out.print(arr[j]+" ");
            }
            System.out.printf("\n");
        }
    }
}
