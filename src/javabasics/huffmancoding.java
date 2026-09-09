package javabasics;
import java.util.*;
public class huffmancoding {

        private static class Node implements Comparable<Node> {
            char data;
            int freq;
            Node left, right;

            Node(char data, int freq) {
                this.data = data;
                this.freq = freq;
            }

            Node(Node left, Node right) {
                this.data = '-';
                this.freq = left.freq + right.freq;
                this.left = left;
                this.right = right;
            }

            public int compareTo(Node node) {
                return this.freq - node.freq;
            }
        }

        public static void printCodes(Node root, String s) {
            if (root.left != null) {
                printCodes(root.left, s + "0");
            }
            if (root.right != null) {
                printCodes(root.right, s + "1");
            }
            if (root.left == null && root.right == null) {
                System.out.println(root.data + " : " + s);
            }
        }

        public static void main(String[] args) {
            String text = "hello world";
            int[] freq = new int[256];
            for (char c : text.toCharArray()) {
                freq[c]++;
            }
            PriorityQueue<Node> q = new PriorityQueue<>();
            for (int i = 0; i < 256; i++) {
                if (freq[i] > 0) {
                    q.add(new Node((char) i, freq[i]));
                }
            }

            Node root = null;
            while (q.size() > 1) {
                Node x = q.poll();
                Node y = q.poll();

                Node f = new Node(x, y);
                root = f;

                q.add(f);
            }

            printCodes(root, "");
        }
    }

