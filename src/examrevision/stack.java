package examrevision;

public class stack {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static boolean isEmpty(){
        return false;
    }
    public static Node head;
    public static Node tail;
    public static Node size;
    public static void push(int data){
        Node n = new Node(data);

        if(isEmpty()){
            head = n;
            return;

        }
        n.next = head;
        head = n;

    }

    public static int push(){
        if(isEmpty()){
            System.out.println("empty stack container");
        }
        int val = head.data;
        head = head.next;
        System.out.println("the poped element is "+val);
       return val;
    }

    public static void peek(){
        if(isEmpty()){
            System.out.println("empty stack container");
        }
        System.out.println("the last element is "+head.data);
    }

    public static void printst(){
        if(isEmpty()){
            System.out.println("empty stack container");
        }
        Node temp = head;
        int i=0;
        while(temp != null){
            System.out.println("the "+i+" item stored in stack is "+ temp.data);
            i++;
            temp = temp.next;
        }
    }

    public static void main(String[] args){
        stack st = new stack();
        st.push(3);
        st.push(2);
        st.push(5);
        st.push(8);
        st.push(1);
        st.push(9);
//        st.peek();
        st.printst();


    }
}
