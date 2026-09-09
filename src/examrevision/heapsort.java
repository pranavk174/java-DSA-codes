package examrevision;
import java.util.*;
public class heapsort {
     static class Heap{
    static ArrayList<Integer> arr = new ArrayList<>();
        public static void insert(int data){
            int n = 9;
            arr.add(data);
            int child = arr.size()-1;
            int par = (child-1)/2;

            while(arr.get(child) < arr.get(par)){
                int temp = arr.get(par);
                arr.set(par,arr.get(child));
                arr.set(child,temp);

                child= par;
                par = (child-1)/2;
            }
        }
        public  int peek(){return arr.get(0) ;}
        private static void heapify(int i){
            int left = 2 * i + 1;
            int  right= 2 * i + 2;
            int min = i;

            int child = arr.size()-1;
            int par =(child-1)/2;

        if(left < arr.size() && arr.get(left) < arr.get(min) ){
            min = left;
        }
        if(right < arr.size()-1 && arr.get(right) < arr.get(min) ){
                min = right;
            }

        if( min !=i){
            int temp = arr.get(i);
            arr.set(i,arr.get(min));
            arr.set(min,temp);
            heapify(min);
        }

        }
        public static int delete(){
            int child = arr.size()-1;
            int par =(child-1)/2;
            int temp = arr.get(0);
            arr.set(0,arr.get(child));
            arr.set(child,temp);


            arr.remove(child);



            heapify(0);

            return child;
        }
         public static boolean isEmpty(){

                 return arr.size() == 0;
         }
    }



    public static void main(String[] args){
            Heap hp = new Heap();
        hp.insert(3);
        hp.insert(7);
        hp.insert(2);
        hp.insert(9);
        hp.insert(13);
        hp.insert(4);
        hp.insert(17);
        hp.insert(12);
        hp.insert(0);

        System.out.println(hp.peek());

        while(!hp.isEmpty()){
            System.out.print(hp.peek()+"/");
            hp.delete();
        }
    }
}
