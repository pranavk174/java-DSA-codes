package examrevision;
import java.util.*;
import org.w3c.dom.ls.LSOutput;

public class Btree {
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
   public static class BinaryTree{
       static int i= -1;
       public Node buildTree(int nodes[]){
           i++;
           Node n = new Node(nodes[i]);
           if(nodes[i] ==-1 )
               return null;

           n.left = buildTree(nodes);
           n.right= buildTree(nodes);

           return n;
       }
   }
        public static void preorder(Node root) {
            if (root == null)
                return ;
            System.out.print("/"+root.data);
            preorder(root.left);
            preorder(root.right);
        }

        public static void inorder(Node root){
        if(root== null)
            return;
        inorder(root.left);
        System.out.print("/"+root.data);
        inorder(root.right);
        }

        public static void postorder(Node root){
       if(root == null)
           return ;
       postorder(root.left);
       postorder(root.right);
            System.out.print(" / "+root.data);
        }

    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree bt = new BinaryTree();
        Node root = bt.buildTree(nodes);
        System.out.print("choose option (1:root.data / 2:preorder / 3:inorder / 4:postorder ) -> ");
        int option = sc.nextInt();
        switch(option) {
            case 1:
                System.out.println("the root node is " + root.data);
                break;
            case 2:
                System.out.println("preorder sequence ->");
                preorder(root);
                break;
            case 3:
                System.out.println("inorder sequence ->");
                inorder(root);
                break;
            case 4:
                System.out.println("postorder sequence -> ");
                postorder(root);
                break;
            default:
                System.out.println("invalid input");
                break;
        }
    }
}
