package com.company;
import java.util.*;
public class Main {
    public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	BST b = new BST();
	int ch =0;
	do{
        System.out.println("\n---------------------------------------");
        System.out.println("\n1)Create BST\n2)Search data\n3)Update data\n4)Delete data");
        System.out.println("\n----------------------------------------");
        System.out.println("Enter your choice : ");
        ch = sc.nextInt();
        switch(ch){
            case 1:
                System.out.println("\n--------------------------------------");
                b.create();
                break;
            case 2:
                System.out.println("Inorder Traversal");
                b.Inorder(b.root);
                break;
            case 3:
                System.out.println("Pre-Order Traversal");
                b.PreOrder(b.root);
                break;
            case 4:
                System.out.println("Post-Order Traversal");
                b.PostOrder(b.root);
                break;
            case 5:
                System.out.println("Searching data ");
                b.Search();
                break;
            case 6:
                System.out.println("Update data ");
                b.Update();
                break;
            case 7:
                System.out.println("Enter data to delete : ");
        }

    }while(ch !=0);
    }
}
