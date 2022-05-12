package com.company;
import java.util.*;
public class BST {
    Scanner sc = new Scanner(System.in);
    Node temp,curr;
    Node root = null;

    public Node create() {
        System.out.println("Enter data : ");
        int data = sc.nextInt();
        Node temp = new Node(data);
        if (root == null) {
            root = temp;
        }else{
            Node curr = root;
            while(curr != null){
                if(temp.data< curr.data){
                    if(curr.left == null){
                        curr.left = temp;
                        break;
                    }else{
                        curr = curr.left;
                    }
                }else if(temp.data>curr.data){
                     if(curr.right == null ){
                         curr.right= temp;
                         break;
                    }else{
                         curr = curr.right;
                     }
                }
            }
        }
        return root;
    }
    public void Inorder(Node l){
        if(l != null){
            Inorder(l.left);
            System.out.print(l.data+" ");
            Inorder(l.right);
        }
    }
    public void PreOrder(Node l){
        if(l != null){
            System.out.println(l.data+" ");
            PreOrder(l.left);
            PreOrder(l.right);
        }
    }
    public void PostOrder(Node l){
        if(l !=null){
            PostOrder(l.left);
            PostOrder(l.right);
            System.out.println(l.data+ " ");
        }
    }
    public Node Search(){
        System.out.println("Enter data to search : ");
        int search = sc.nextInt();
        Node curr =root;
        while(curr !=null){
            if(curr.data ==search){
                System.out.println("Data found "+curr.data);
                return curr;
            }
            if(curr.data >search){
                curr =curr.left;
            }else if(curr.data < search){
                curr=curr.right;
            }

        }return null;
    }
    public void Update() {

        System.out.println("Enter data to search : ");
        int update = sc.nextInt();
        Node curr = root;
        while (curr != null) {
            if (curr.data == update) {
                System.out.println("Enter new data : ");
                curr.data = sc.nextInt();
                System.out.println(update+" updated to "+curr.data);
                break;
            }
            if (curr.data > update) {
                curr = curr.left;
            } else if (curr.data < update) {
                curr = curr.right;
            }
        }
        System.out.println("Updated successfully ");
    }
    public void delete(){
        Node parent = curr;
        if(curr.left == null && curr.right == null){
            System.out.println();
            if(curr!=root){
                if(parent.left == curr){
                    parent.left = null;
                }else{
                    parent.right = null;
                }
            }else{
                root =null;
            }
            System.out.println("Deleted successfully !");
        }
    }
}
