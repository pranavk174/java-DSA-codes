package javabasics;

public class linkedlist {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public static Node prev;
    public void addfirst(int data){  // add first node
//        create a node
        Node newnode = new Node(data);
        size++;
        if (head == null){       // this condition will be used only when the linked list is null
            head = tail = newnode;
            return ;
        }

        //linking
        newnode.next = head ;  // linking the new node with head node by assigning reference value of head node

    // making newnode the head node
        head = newnode ;
    }

    public void addlast(int data){    //add last node
        Node newnode = new Node(data);
        size++;
        if(head == null){
            head = tail = newnode;
            return;
        }
        tail.next = newnode; //linking with last node

        tail = newnode;
    }
    public void printll() {
        if (head == null){
            System.out.print("linked list is empty ");
        return;
    }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public int removefirst(){  //delete 1st node
        if(size == 0){
            System.out.println("linked-list is empty ");
            return Integer.MIN_VALUE;
        }
        else if (size == 1){
            int val = head.data;
            head = tail = null;
            return val;

        }
        int val = head.data;
        head = head.next;
        size--;
        return val;

    }
    public int removelast(){
        if (size== 0){
            System.out.print("empty linkd list");
        }
        else if (size == 1){
            int val = head.data ;
            head = tail= null;
            return val;
        }

        Node prev = head;
       for(int i = 0 ;i<size-2;i++){   // to find previous node   because last index is n -1 (0 indexing)
           prev = prev.next;
        }
       int val =  tail.data;
       tail = prev;
       size-- ;
    prev.next = null;
    tail = prev;
    return val;


    }
    public void addmiddle(int idx,int data){
        if(idx == 0){
            addfirst(data);
            return;
        }
        Node newnode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while(i<idx -1){  // to find previous node
            temp = temp.next ;
            i++;
        }
        newnode.next =temp.next ;
        temp.next = newnode ;


    }

    //iterative searching
    public void search(int data){  // TC = O(n)
        Node idx = head;
        int i = 0;
        while(idx !=null){
            if ( idx.data == data){
                System.out.println(" the data is on index is "+ i);
                return;
            }
            idx = idx.next;
            i++;
        }

    }
    // recursive search
    public int helper(Node head,int key){
        if(head == null){
            return -1;
        }

        if (head.data ==key ){

            return 0;
        }
        int idx = helper(head.next,key);
        if(idx == -1)
            return -1;
       return idx + 1 ;
    }

    public int R_search(int key){
        return  helper(head,key);
    }
//
//    public boolean r_helper(Node head,int key){
//        if(head == null)
//            return false;
//        if (head.data == key)
//            return true;
//
//        else
//            return r_helper(head.next,key);
//
//    }
//    public boolean r_search(int key){
//        return r_helper(head,key);
//    }

    public static void main(String[] args){
        linkedlist ll= new linkedlist();
        ll.addfirst(1);
        ll.addfirst(2);
        ll.addlast(3);
        ll.addlast(4);
        ll.addmiddle(3,9);
        ll.printll();
        System.out.println(ll.size);
        ll.search(40);
       int t = ll.R_search(4);
        System.out.println("the key is present in the index "+ t);
//        ll.removefirst();
//        ll.printll();
//        System.out.println(ll.size);
//        ll.removelast();
//        ll.printll();
//        System.out.println(ll.size);


//        if (ll.r_search(4))
//            System.out.print("yes ");
//        else
//            System.out.println("no");





    }
}
