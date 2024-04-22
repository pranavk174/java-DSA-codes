package javabasics;
import java.util.*;
public class minheap {
// min heap sort
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        //adding node
        public void add(int data){           //tc O(log N)
            arr.add(data);    // add at last index     TC O(1)
            int x = arr.size()-1 ;      //index of last child node
            int par = (x-1)/2;      // index of parent
            while(arr.get(x)< arr.get(par)){        //fix the heap  tc O(log N)
                int temp = arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par,temp);
//
                x=par;
                par = (x-1)/2;
            }
        }
        public int peek (){
            return arr.get(0);
        }
        public void min_heapify(int i){     //tc O(log N)
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int min = i;
            if(left < arr.size() && arr.get(left)< arr.get(min)){
                min = left;
            }

            else if(right < arr.size() && arr.get(right)< arr.get(min)){
                min = right;
            }
            if(min != i){
                int temp = arr.get(min);
                arr.set(min,arr.get(i));
                arr.set(i,temp);
            }
        }

        public int delete (){
            int x = arr.size()-1 ;      //index of last child node
            int par = (x-1)/2;      // index of parent

            int temp = arr.get(x);
            arr.set(x,arr.get(0));
            arr.set(0,temp);


            arr.remove(x);

            min_heapify(0);

            return x;
        }
        public boolean isEmpty(){
            return arr.size() == 0;
        }
    }
    public static void main(String args[]){
        Heap hp = new Heap();
        hp.add(3);
        hp.add(7);
        hp.add(2);
        hp.add(9);
        hp.add(13);
        hp.add(4);
        hp.add(17);
        hp.add(12);
        hp.add(0);


         while(!hp.isEmpty()){
             System.out.print(hp.peek()+ " ");
             hp.delete();
         }
    }
}
