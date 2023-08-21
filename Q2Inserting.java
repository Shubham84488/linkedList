public class Q2Inserting {

    // Main part of program 
    void insertafter(int newdata,int afterdata){
        Node newNode= new Node(newdata);

        Node temp=head;
        while(temp.data != afterdata){
            temp=temp.next;
        }
        newNode.next= temp.next;
        temp.next=newNode;
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
        Q2Inserting l1= new Q2Inserting();

        l1.insertAtEnd(32);
        l1.insertAtEnd(4);
        l1.insertAtEnd(86);
        l1.insertAtEnd(96);

        l1.display();
        l1.insertafter(67, 4);

        l1.display();
    }
}
