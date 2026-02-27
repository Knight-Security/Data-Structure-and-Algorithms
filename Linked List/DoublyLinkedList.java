class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
class dll{
    Node head;
    public void insertfirst(int data){
        Node newnode=new Node(data);
        newnode.next=head;
        newnode.prev=null;
         if(head != null){
            head.prev = newnode;
        }   
        head=newnode;
    }
    public void display(){
        Node temp=head;
        while(temp != null){
            System.out.print(temp.data +"->");
            temp=temp.next;
        }
        if(temp==null){
            System.out.print("null");
        }
    }
}
class DoublyLinkedList {
    public static void main(String[] args) {
        dll dll=new dll();
        dll.insertfirst(10);
        dll.insertfirst(20);
        dll.insertfirst(30);
        dll.insertfirst(40);
        dll.display();
    }
}