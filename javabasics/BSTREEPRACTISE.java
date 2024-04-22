package javabasics;

public class BSTREEPRACTISE {
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data= data;
            this.left= null;
            this.right= null;
        }
    }
    public static Node insert(Node root,int val){         // time complexity is O(H)  h== height;
        if(root == null) {
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            root.left = insert(root.left,val);
        }
        else
            root.right = insert(root.right, val);

        return root;

    }

    public static boolean search(Node root, int key){      // time complexity is O(H)  h== height;
        if(root == null){

            return false;
        }
        else if(root.data == key) {

            return true;

        }
        else if(root.data > key)
            return search(root.left,key);
        else
            return search(root.right,key);


    }
    public static void inorder(Node root){
        if(root == null)
            return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);

    }
    public static Node delete(Node root,int val) {
        if (root.data > val) {
            root.left = delete(root.left, val);
        } else if (root.data < val) {
            root.right = delete(root.right, val);

        } else {      // root.data == val;
            //case-1
            if (root.left == null && root.right == null) {
                return null;
            }

            //case -2
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            //        case - 3
            else {
                Node IS = inordersuccessor(root.right);
                root.data = IS.data;
                root.right = delete(root.right, IS.data);
            }
        }


        return root;
    }
    public static Node inordersuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }


    public static void main(String args[]){
        int values[] = {5,2,8,3,0,1};
        Node root = null;
        for(int i=0;i<values.length; i++){
            root = insert(root,values[i]);


        }
        inorder(root);
        if(search(root,0))
            System.out.println("found");
        else
            System.out.println(" not found");

    delete(root,3);
        inorder(root);

    }
}

