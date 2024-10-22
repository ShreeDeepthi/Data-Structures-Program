
import java.util.*;
public class SLLProg {
    public static class Node {
        int data;
        
        
        System.out.println("5 for Delete Desired");
        System.out.println("6 for Delete Last");
        System.out.println("7 Sort");
        System.out.println("8 Search");
        System.out.println("9 Display");
        System.out.println("0 Exit");
    }
    public static void insertFront(Node head, int val) {
        Node newNode=new Node(val);
        newNode.next=head.next;
        head.next=newNode;
        System.out.println("\t Inserted sucessfully at front");
    }
    public static void display(Node temp) {
        if(temp==null) 
            return;
        System.out.print(temp.data+" ");
        display(temp.next);
    }
    public static void insertLast(Node head, int val) {
        Node newNode=new Node(val);
        Node temp=head;
        while(temp.next!=null)
            temp=temp.next;
        temp.next=newNode;
        System.out.println("\t Value inserted at last");
    }
    public static void insertDesired(Node head, int val,int pos) {
        Node newNode=new Node(val);
        Node temp=head;
        int i=1;
        while(temp.next!=null && i<pos)
        {
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        System.out.println("\t Value inserted at postition "+ pos);
    }
    public static void delFront(Node head) {
        if(head.next==null)
            System.out.println("\t List is Empty");
        else
        {
            Node delNode;
            delNode=head.next;
            head.next=head.next.next;
            System.out.println("\t Deleted Node has value ="+delNode.data);
        }

    }
    public static void delLast(Node head) {
        if(head.next==null)
            System.out.println("\t List is Empty");
        else
        {
            Node temp=head;
            Node delNode;
            while(temp.next.next!=null)
                temp=temp.next;
            delNode=temp.next;
            temp.next=null;
            System.out.println("\t Deleted Node has value ="+delNode.data);
        }
    }

    public static void search(Node head, int key) {
        Node temp=head;
        int pos=0;
        if(temp.next==null)
            System.out.println("\t List is empty");
        while(temp!=null)
        {
            if(temp.data==key)
                System.out.println("value found at " + pos);
            pos++;
            temp=temp.next;
        }
    }
        
    public static void main(String[] args) {
        Node head=new Node(0);
        int ch=1;
        Scanner sc=new Scanner(System.in);
        int val;
        while(ch!=0)
        {
            menu();
            System.out.println("Enter your choice");
            ch=sc.nextInt();
            switch (ch) {
                case 1: System.out.println("\t Enter a value to insert Front");
                        val=sc.nextInt();
                        insertFront(head, val);
                    break;
                case 2: System.out.println("\t Enter a value to insert at Desired");
                        val=sc.nextInt();
                        System.out.println("\t Enter a position of value to insert ");
                        int pos=sc.nextInt();
                        insertDesired(head,val,pos);
                        break;
                case 3: System.out.println("\t Enter a value to insert Last");
                    val=sc.nextInt();
                    insertLast(head, val);
                break;
                case 4: delFront(head); break;
                case 6: delLast(head); break;
                case 8: System.out.println("\t Enter a value to search");
                        val=sc.nextInt();
                        search(head,val); break;
                
                case 9: display(head.next); break;
                default:
                    break;
            }
        }
        sc.close();
    }
}
