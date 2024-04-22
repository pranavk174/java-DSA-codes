package javabasics;

public class binarysearchtree {
    public static class Node{
        int data;
        Node left;
        Node right;

            public Node(int data){
                this.data= data;
                this.left = null;
                this.right = null;
            }
    }


         public static Node insert(Node root,int val){

             if(root == null) {
                 root = new Node(val);
                 return root;
             }
             if(root.data > val) {
                 root.left = insert(root.left, val);

             }
             else{
                 root.right = insert(root.right , val);

             }


           return root;
         }
         public static void inorder(Node root){
             if(root == null){
                 return;
             }
             inorder(root.left);
             System.out.print(root.data+" ");
             inorder(root.right);
         }
         public static boolean search(Node root, int key) {
             if (root == null) {
                 return false;

             }

             if (root.data == key)
                 return true;
             if (root.data > key)
                 return search(root.left, key);
             else
                 return search(root.right, key);


         }
         public static Node delete(Node root,int val) {
            if (root.data > val)
                root.left =delete(root.left,val);
            else if (root.data < val)
                root.right = delete(root.right,val);

            else {
                // case-1
                if (root.left == null && root.right == null)
                    return null;

//             case-2
                if (root.left == null)
                    return root.right;
                else if (root.right == null) {
                    return root.left;
                }
                //case 3
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
        int values[] = {5,1,3,4,2,7};
        int key= 3;
        Node root= null;
        for(int i = 0;i<values.length;i++){
            root = insert(root,values[i]);
            System.out.print(root.data+" \n");
        }
        inorder(root);
//        if(search(root,key))
//            System.out.println( key +" found");
//        else
//            System.out.println(key + " not found");
        System.out.println( "\n");
        delete(root,key);
        inorder(root);
//        if(search(root,key))
//            System.out.println( key +" found");
//        else
//            System.out.println(key + " not found");

    }
}
