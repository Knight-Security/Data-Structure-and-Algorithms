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
        Node newnode=new Node(data);
        newnode.next=head;
        head=newnode;
        
    }
    public void deletionatfirst(){
        head=head.next;
    }
    public void deletionlast(){
        Node temp=head;
        Node prevnode=null;
        while(temp.next!=null){
            prevnode=temp;
            temp=temp.next;
        }
        prevnode.next=null;
    }
    public void deleteposition(int position){
        int i=1;
        Node temp=head;
        Node nextnode=null;
        while(i<=position-1){
            temp=temp.next;
            i++;
        }
        nextnode=temp.next;
        temp.next=nextnode.next;
        
        
        
    }
    public void display(){
        Node temp=head;
        while(temp !=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        if(temp==null){
            System.out.print("null");
        }
    }
}
class SinglyLinkedlistDeletion {
    public static void main(String[] args) {
        ll l=new ll();
        l.insertatfirst(10);
        l.insertatfirst(20);
        l.insertatfirst(30);
        l.insertatfirst(40);
        // l.deletionatfirst();
        // l.deletionlast();
        // l.deleteposition(3);
        l.display();
    }
}