package ProblemSolving;

public class Stack {
    int MAX = 100;
    int top;
    int[] a = new int[MAX];

    boolean isEmpty(){
        return (top<0);
    }

    Stack(){
        top = -1;
    }

    boolean push(int x){
        if(top >= MAX-1){
            System.out.println("Stack Overflow \n");
            return false;  
        }
        a[++top] = x;
        System.out.println( x + " Added to the top of the list \n");
        return true;
    }

    int pop(){
        if(top < 0){
            System.out.println("Stakc Underflow \n");
            return 0;
        }
        int x = a[top--];
        System.out.println("The element " + x + " was removed from the Stack \n");
        return x ;
    }

    int peek(){
        if(top < 0){
            System.out.println("Stack UnderFlow \n");
            return 0;
        }

        int x = a[top];
        return x;
    }

    void print(){
        System.out.println("Printing the elements of the Stack : ");
        for(int i = top; i > -1; i--){
            System.out.println(a[i] + " ");
        }
    }
    
}

class Main{
    public static void main(String[] args){
        Stack s = new Stack();
        s.push(100);
        s.push(20);
        s.push(50);
        System.out.println("Peeking the Stack : " + s.peek());
        s.pop();
        s.print();
    }
}