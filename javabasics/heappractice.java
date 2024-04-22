package javabasics;
import java.util.*;
public class heappractice {

    public static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();
        public void add(int data) {
            arr.add(data);
            int x = arr.size() - 1;
            int par = (x - 1) / 2;
            while (arr.get(par) > arr.get(x)) {
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x-1)/2;
            }
        }
        public int peek() {
            return arr.get(0);
        }
        public void heapify(int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int min = i;

            if (left < arr.size() - 1 && arr.get(left) < arr.get(min)) {
                min = left;
            }

            if (right < arr.size() - 1 && arr.get(right) < arr.get(min)) {
                min = right;
            }


            if (min != i) {
                int temp = arr.get(min);
                arr.set(min, arr.get(i));
                arr.set(i, temp);
            }

        }
            public int delete() {
                int x = arr.size() - 1;
                int par = (x - 1) / 2;
                int temp = arr.get(x);
                arr.set(x, arr.get(0));
                arr.set(0, temp);
                arr.remove(x);
                heapify(0);
                return x;
            }
        public boolean isEmpty(){
            return arr.size()==0;
        }
    }
        public static void main(String args[]) {
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

