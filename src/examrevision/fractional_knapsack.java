package examrevision;

public class fractional_knapsack {
    public static void knapsack(int[] items,int[] value,int capacity){
       int sum =0;
       double ratio[] = new double[items.length];
       for(int i =0;i<items.length;i++){
           ratio[i] = value[i] / (double)items[i];
       }
       for(int i=0;i<items.length;i++) {
           if (items[i] <= capacity) {
               sum += value[i];
               capacity -= items[i];
           } else {
               sum += (ratio[i] * capacity);
               break;
           }
       }
        System.out.println(sum);
       }

    public static void main(String[] args){
//        int weight = 50;
//        int items[]={30,20,15,10};
//        int profit[] ={120,100,60,80};

        int weight[] = {10,20,30};
        int value[]={60,100,120};
        int w= 50;

        knapsack(weight,value,w);
    }
}
