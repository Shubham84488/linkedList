public class Q4Palindrome {

    // Using 2 Pointers slow and fast for finding middle node
    void checkPal(){
        Node slow =head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node SecMiddle=slow;
        Node Second= reverselist(SecMiddle);  //Reversing 2nd Half

        // Checking for palindrome 
        while(Second !=null){
            if(head.data != Second.data){
                System.out.println("Not a Palindrome");
                return;
            }
            head=head.next;
            Second=Second.next;
        }
        System.out.println("It is a Palindrome");
    }
    
    // Reversing 2nd Half
    Node reverselist(Node SecMiddle){
        Node curr=SecMiddle,prev=null,next=null;
        while(curr != null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
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
            System.out.print(current.data+"->");
            current=current.next;
        }System.out.print("null\n");
    }

    public static void main(String[] args) {
        Q4Palindrome l1 = new Q4Palindrome();

        l1.insertAtEnd(1);
        l1.insertAtEnd(2);
        l1.insertAtEnd(3);
        l1.insertAtEnd(8);
        l1.insertAtEnd(3);
        l1.insertAtEnd(2);
        l1.insertAtEnd(1);
        
        l1.display();
        l1.checkPal();
    
    }
}
