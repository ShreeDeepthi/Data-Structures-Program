import java.util.*;
public class DLLProg {
    public static class Node{
        int data;
        Node Llink, Rlink;
        Node(int d){
            data=d;
            Llink=null;
            Rlink=null;
        }
    }
    public static void insertFront(Node head, Node tail, int data) {
        Node newNode=new Node(data);
        if(head.Rlink==null){
            head.Rlink=newNode;
            newNode.Llink=head;
            tail=newNode;   
        }
        else{
            newNode.Llink=head;
            newNode.Rlink=head.Rlink;
            newNode.Rlink.Llink=newNode;
            head.Rlink=newNode;
        }
        System.out.println("\n\t Node Inserted in Front");

    }
    public static void insertLast(Node head, Node tail, int data) {
        Node newNode=new Node(data);
        Node temp=head;
        while(temp.Rlink!=null)
        {
            temp=temp.Rlink;
        }
        newNode.Llink=temp;
        temp.Rlink=newNode;
        tail=newNode;
        System.out.println("\tNode inserted at Last");
    }
    public static void delFront(Node head, Node tail) {
        if(head.Rlink==null)
            System.out.println("\t List is empty");
        else{
            Node delNode=head.Rlink;
            head.Rlink=delNode.Rlink;
            delNode.Rlink.Llink=head;
            if(head.Rlink==null)
                tail=head;
        System.out.println("\t "+delNode.data+" is deleted from front");
        }
    }
    public static void delLast(Node head, Node tail) {
        if(head.Rlink==null)
            System.out.println("\t List is empty");
        else{
            Node temp=head;
            while(temp.Rlink!=null)
                temp=temp.Rlink;
            Node delNode=temp;
            temp.Llink.Rlink=null;
            System.out.println("\t "+delNode.data+" is deleted from Last");
        }
    }
    public static void display(Node head, Node tail) {
        if(head.Rlink==null)
            System.out.println("\tList is empty");
        else{
            Node temp=head;
            System.out.print("\n List contains: ");
            while(temp.Rlink!=null){
                System.out.print(temp.Rlink.data +" ");
                temp=temp.Rlink;
            }
        }
    }
public static void main(String[] args) {
    Node head=new Node(0);
    Node tail=head;
    insertFront(head,tail,100);
    insertFront(head,tail,50);
    insertFront(head,tail,20);
    display(head,tail);
    insertLast(head, tail,200);
    display(head, tail);
    delFront(head, tail);
    display(head, tail);
    delLast(head, tail);
    display(head, tail);
    
}
}
