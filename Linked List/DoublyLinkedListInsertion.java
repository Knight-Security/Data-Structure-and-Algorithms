class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data=data;
        this.prev=null;
        this.next=null;
    }
}
class dll{
    Node head;
    public void insertatfirst(int data){
        Node newnode=new Node(data);
        newnode.next=head;
        newnode.prev=null;
        if(head !=null){
            head.prev=newnode;
        }
        head=newnode;
    }
    public void insertatend(int data){
        Node newnode=new Node(data);
        Node temp=head;
        while(temp.next != null){
            temp=temp.next;
        }
        temp.next=newnode;
        newnode.prev=temp;
    }
    public void insertposition(int data,int position){
        Node newnode= new Node(data);
        Node temp=head;
        int i=1;
        while(i<position-1){
            temp=temp.next;
            i++;
        }
        newnode.next=temp.next;
        newnode.prev=temp;
        temp.next.prev=newnode;
        temp.next=newnode;
    }
    public void display(){
        Node temp=head;
        while(temp != null){
            System.out.print(temp.data+ "->");
            temp=temp.next;
        }
        if(temp==null){
            System.out.print("null");
        }
    }
}
class DoublyLinkedListInsertion {
    public static void main(String[] args) {
        dll dll = new dll();
        dll.insertatfirst(10);
        dll.insertatfirst(20);
        dll.insertatfirst(30);
        dll.insertatfirst(40);
        dll.insertatend(50);
        dll.insertposition(60,3);
        dll.display();
        
    }
}