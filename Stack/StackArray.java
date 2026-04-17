class ArrayStack{
    private int top;
    private int []array;
    private int size;
    ArrayStack(int size){
        this.size=size;
        this.array=new int [size];
        this.top=-1;
    }
    public void push(int data){
        if(top==size-1){
            System.out.println("Stack Overflow!!!");
            return;
        }
        array[++top]=data;
    }
    public void pop(){
        if(top==-1){
            System.out.println("Stack Underflow!!!");
            return;
        }
        top--;
    }
    public void peek(){
        if(top==-1){
            System.out.println("Stack is Empty !!!");
            return;
        }
        System.out.println(array[top]);
    }
    public void display(){
        if(top ==-1){
            System.out.println("Stack is Empty");
            return;
        }
        for(int i=top;i>=0;i--){
            System.out.print(array[i]+" ");
        }
    }
}
class StackArray {
    public static void main(String[] args) {
        ArrayStack s= new ArrayStack(5);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.pop();
        s.display();
        // s.peek();
}
}