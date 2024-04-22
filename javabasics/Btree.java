package javabasics;

import java.security.spec.RSAOtherPrimeInfo;

public class Btree {
    public static class Node{
        int data;
        Node left;
        Node right;


        Node(int data){
            this.data= data;
            this.left = null;   // in starting left and right both is null by default;
            this.right= null;
        }
    }


    static class binary_tree{
        static int idx = -1;
        public static Node buildtree(int array[]){

            idx++;
            if(array[idx] == -1){
                return null;
            }
            Node newnode= new Node(array[idx]);
            newnode.left = buildtree(array);
            newnode.right = buildtree(array);

            return newnode;

        }


    }
    public static void preorder(Node root){
        if( root == null)
            return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);


    }
    public static void inorder(Node root){
        if(root  == null)
            return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void postorder(Node root){
        if(root == null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" " );
    }


    public static void main(String args[]){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};       // -1 indicattes null value   its in preorder sequence
        binary_tree tree = new binary_tree();
        Node root = tree.buildtree(nodes);
//        System.out.print(root.data);
        preorder(root);
System.out.println("\n");
        inorder(root);
        System.out.println("\n");
        postorder(root);
    }
}
