package examrevision;

public class BSTree {
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data= data;
            this.left= null;
            this.right=null;
        }
    }

    public static Node insert(Node root,int val){
        if(root == null){
            Node n = new Node(val);
            return n;
        }

        if(val < root.data){
            root.left = insert(root.left,val);
        }
        else
            root.right = insert(root.right,val);

        return root;
    }

    public static void inorder(Node root){
        if(root == null)
            return;

        inorder(root.left);
        System.out.print(root.data+"/");
        inorder(root.right);
    }

    public static boolean search(Node root,int key){
        if(key == root.data){
            System.out.println("\ntrue");
            return true;
        }
        if(key > root.data)
            search(root.right,key);
        else
            search(root.left,key);

        return false;
    }

    public static void main(String[] args){
        int[] arr = {3,1,6,2,9,5,8,10,7,4};
        Node root = null;
        for(int i=0;i<arr.length;i++){
            root = insert(root,arr[i]);
        }

        inorder(root);
        search(root,8);
    }
}




//public static Node insert(Node root,int val){
//    if(root == null){
//        Node n = new Node(val);
//        return n;
//    }
//    if(val < root.data)
//        root.left = insert(root.left,val);
//    else
//        root.right = insert(root.right,val);
//    return root;
//}




//public static void inorder(Node root){
//    if(root == null) {
//        return ;
//    }
//
//    inorder(root.left);
//    System.out.print(root.data+" /");
//    inorder(root.right);
//}
