class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class ll{
    Node head;
    public void insertatfirst(int data){
        Node newNode= new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public void insertatlast(int data){
        Node newNode= new Node(data);
        Node head = temp;
        while(temp!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public void deleteatfirst(){
        head=head.next;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
            if(temp==null){
                System.out.print("null");
            }
        }
    } 

}
class SinglyLinkedList {
    public static void main(String[] args) {
        ll list= new ll();
        list.insertatfirst(10);
        list.insertatfirst(20);
        list.insertatfirst(30);
        list.deleteatfirst();
        list.display();
        
    }
}