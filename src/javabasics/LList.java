package javabasics;

public class LList {
  public static class Node{
  int data;
  Node next;



      public Node(int data){
      this.data=data;
      this.next=null;
        }
  }

  public static Node head;
  public static Node tail;

  public static void addfirst(int data){
      Node newnode = new Node(data);
      if(head == null){
          head = tail= newnode;
      }
      newnode.next= head;
      head = newnode;
  }
  public static void print(){
      Node temp = new Node(5);
      if (head == null)
          System.out.println("empty");
      while(temp.next != null){
          System.out.println(temp.data+"->");
      }

  }


  public static void main(String args[]){
      LList ll = new LList();
      ll.addfirst(5);
      ll.print();
  }
}
