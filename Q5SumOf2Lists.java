public class Q5SumOf2Lists {

    // To find out total representation(sum) of nodes in linked lists
    int sum(){
        Node current = head;
        String l=current.data+"";
        while(current.next != null){
            l=l+""+current.next.data+"";
            current=current.next;
        }
        return Integer.parseInt(l);
    }

    // Node class
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

    // Insert elements in the end used for creation of 1st and 2nd Linked list
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

    // Inserts at the beginning used for creation of new Linked List 
    void insertAtBeginning(int newdata){
        Node newNode=new Node(newdata);

        newNode.next=head;
        head=newNode;
    }
    void display(){
        Node current = head;
        while(current != null){
            System.out.print(current.data+"->");
            current=current.next;
        }System.out.print("null\n");
    }

    public static void main(String[] args) {

        // making 3 linked lists
        Q5SumOf2Lists l1 = new Q5SumOf2Lists();
        Q5SumOf2Lists l2 = new Q5SumOf2Lists();
        Q5SumOf2Lists res= new Q5SumOf2Lists();

        // Adding Nodes
        l1.insertAtEnd(7);
        l1.insertAtEnd(5);
        l1.insertAtEnd(9);
        l1.insertAtEnd(4);
        l1.insertAtEnd(6);

        l2.insertAtEnd(8);
        l2.insertAtEnd(4);

        int a = l1.sum();                    // to get representaion of nodes
        int b = l2.sum();                   
        int c = a+b;                         // total sum of both nodes

        // making 3rd Linked lists
        while(c != 0){
            res.insertAtBeginning(c%10);    // to insert elements in the beginning.
            c=c/10;
        }

        System.out.print("Resultant linked list:   "); 
        res.display();
    }
}
