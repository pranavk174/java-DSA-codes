package javabasics;

public class Btreepractise {
    public static class Node{
        int data;
        Node right;
        Node left;

        Node(int data){
            this.data=data;
            this.left = null;
            this.right=null;

        }
    }

    public static class binary_tree{
        static int idx= -1;
        static Node buildtree( int arr[]){
            idx++;
            if(arr[idx]== -1){
                return null;
            }

            Node newnode = new Node(arr[idx]);
            newnode.left = buildtree(arr);
            newnode.right = buildtree(arr);

            return newnode;

        }
    }
    public static void main(String args[]){
        int nodes[]= {3,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binary_tree tree = new binary_tree();
        Node root = tree.buildtree(nodes);

        System.out.println(root.data);
    }
}
