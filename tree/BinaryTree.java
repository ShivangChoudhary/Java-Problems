package tree;

import java.util.Scanner;

class BinaryTree {

    public BinaryTree() {

    }

    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }
    private Node root;
    public void populate(Scanner sc){
        System.out.println("Enter root n.o: ");
        int value= sc.nextInt();
        root=new Node(value);
        populate(sc,root);
    }
    private void populate(Scanner sc , Node node){
        System.out.println("Do you want to enter left of: "+node.value);
        Boolean left = sc.nextBoolean();
        if (left){
            System.out.println("Enter n.o you want to enter on left of: "+node.value);
            int value = sc.nextInt();
            node.left=new Node(value);
            populate(sc,node.left);
        }
        System.out.println("Do you want to enter right of: "+node.value);
        Boolean right = sc.nextBoolean();
        if (right){
            System.out.println("Enter n.o you want to enter on right of: "+node.value);
            int value = sc.nextInt();
            node.right= new Node(value);
            populate(sc,node.right);
        }
    }
    //Dispaly
    public void display(){
        display(this.root,"");
    }
    private void display(Node node,String space){
        if (node==null){
            return;
        }
        System.out.println(space+node.value);
        display(node.left,space+"\t");
        display(node.right,space+"\t");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(sc);
        tree.display();

    }

}
