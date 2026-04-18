class Stack<T> {
    private int size;
    private T[] a;
    private int top;
    Stack(int size) {
        this.size = size;
        this.a = (T[]) new Object[size];
        this.top = -1;
    }
    public void push(T data) {
        if (top == size - 1) {
            System.out.println("Stack overflow!!!!");
            return;
        }
        a[++top] = data;
    }
    public void pop() {
        if (top == -1) {
            System.out.println("Stack underflow!!!!");
            return;
        }
        top--;
    }
    public void display() {
        for (int i = top; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }
}

class GenericArrayStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        Stack<String> s2 = new Stack<>(3);
        s2.push("Hello");
        s2.push("World");
        s2.display();
    }
}