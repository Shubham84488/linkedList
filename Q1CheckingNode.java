public class Q1CheckingNode{

    // Main part of code checking if it is presnt or not 
    void checking(int val){
        Node temp= head;

        while(temp !=null){
            if(temp.data == val){
                System.out.println("Yes,Element is present");
                return;
            }
            temp=temp.next;
        }
        System.out.println("No,Elemnt is not present");
    }


    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;
    Node tail=null;

    void insertAtEnd(int newdata){
        Node newNode = new Node(newdata);
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
    }

    public static void main(String[] args) {
        Q1CheckingNode l1 = new Q1CheckingNode();

        l1.insertAtEnd(231);
        l1.insertAtEnd(21);
        l1.insertAtEnd(84);
        l1.insertAtEnd(90);
        l1.insertAtEnd(2);
        l1.insertAtEnd(17);
        
        l1.checking(312);
    }
}