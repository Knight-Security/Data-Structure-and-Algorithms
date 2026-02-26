class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList{
    Node head;
    public void insertatfirst(int data){
        Node newnode=new Node(data);
        newnode.next=head;
        head=newnode;
    }
    public void reverseLinkedList(){
        Node currentnode=head;
        Node prevnode=null;
        Node nextnode;
        while(currentnode != null){
            nextnode=currentnode.next;
            currentnode.next=prevnode;
            prevnode=currentnode;
            currentnode=nextnode;
            
        }
        head=prevnode;
    }
    public void display(){
        Node temp = head;
        while(temp !=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        if(temp==null){
            System.out.print("null");
        }
    }
}
class ReverseLinkedList {
    public static void main(String[] args) {
        class LinkedList l= new class LinkedList();
        l.insertatfirst(10);
        l.insertatfirst(20);
        l.insertatfirst(30);
        l.insertatfirst(40);
        l.insertatfirst(50);
        l.reverseLinkedList();
        l.display();
    }
}