class Node{
    int data;
    Node prev;
    Node next;
    Node(int data){
        this.data=data;
        this.prev=null;
        this.next=null;
    }
}
class dll{
    Node head;
    public void insertfirst(int data){
        Node newnode=new Node(data);
        newnode.next=head;
        newnode.prev=null;
        if(head != null){
            head.prev=newnode;
        }
        head=newnode;
    }
    public void deletefirst(){
        if(head ==null){
            return;
        }
        head=head.next;
        if(head != null){
            head.prev=null;
        }
        
    }
    public void deletelast(){
        Node temp = head;
        while (temp.next !=null){
            temp=temp.next;
        }
        temp.prev.next=null;
    }
    public void display(){
        Node temp=head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp=temp.next;
    }
    if(temp ==null)
        System.out.print("null");
    
    }
        
    
}
class DoublyLinkedListDeletion {
    public static void main(String[] args) {
        dll dll = new dll();
        dll.insertfirst(10);
        dll.insertfirst(20);
        dll.insertfirst(30);
        dll.insertfirst(40);
        dll.insertfirst(50);
        //dll.deletefirst();
        //dll.deletelast();
        dll.display();
        
    }
}