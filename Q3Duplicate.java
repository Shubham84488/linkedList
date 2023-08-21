public class Q3Duplicate{

    // Main part of program 
    void duplicate(){
        Node current=head;
        while(current !=null){
            if(current.data == current.next.data){
                current.next=current.next.next;
            }
            current=current.next;
        }
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

    void display(){
        Node current = head;
        while(current != null){
            System.out.print(current.data+" ");
            current=current.next;
        }System.out.println();
    }
    public static void main(String[] args) {
        Q3Duplicate l1= new Q3Duplicate();

        l1.insertAtEnd(1);
        l1.insertAtEnd(1);
        l1.insertAtEnd(2);
        l1.insertAtEnd(3);
        l1.insertAtEnd(3);

        System.out.print("List before : ");
        l1.display();

        l1.duplicate();
        System.out.print("List after : ");
        l1.display();
    }
}