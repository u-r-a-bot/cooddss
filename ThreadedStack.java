import java.util.Random;
import java.util.Scanner;

class Stack {
    static int[] intstack;
    static int stacklen;
    static int pointer = -1;
    boolean bool = false;
    Random runner = new Random();
    Stack(int stacklen) {
        this.stacklen = stacklen;
        intstack = new int[stacklen];
    }

    public synchronized void push(int ele) throws Exception {
        while (bool) {
            wait();
        }
        if (pointer == stacklen - 1) {
            bool = true;
            throw new Exception("THe stack is full");
        } else {
            bool = true;
            pointer++;
            intstack[pointer] = ele;
            System.out.println("The element pushed is: " + ele);
            System.out.println("The stack now is: ");
            for (int i = pointer; i >=0; i--) {
                System.out.println(intstack[i]);
            }
            notify();
        }
    }

    public synchronized void pop() throws Exception {
        while (!bool) {
            wait();
        }
        if (pointer <= 0) {
            bool = false;
            notify();
            throw new Exception("Stack is empty");
        } else {
            bool = false;
            System.out.println("The element popped will be: " + intstack[pointer]);
            pointer--;
            System.out.println("The stack now is:");
            for (int i = pointer; i >= 0; i--) {
                System.out.println(intstack[i]);
            }
            notify();
            //Changing sleep time
            int sleep=0;
            int coderun = runner.nextInt(100);
            if(coderun<33)
                sleep = 269;
            else if (coderun>=33 && coderun<=66) {
                sleep = 670;
            }
            else sleep =860;
            Thread.sleep(sleep);
        }
    }
}

class push extends Thread {
    public push(Stack myStack) {
        this.myStack = myStack;
    }

    Stack myStack;
    Random ran = new Random();

    @Override
    public void run() {
        try {
            while(true)
            myStack.push(ran.nextInt(100));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

class pop extends Thread {
    public pop(Stack myStack) {
        this.myStack = myStack;
    }

    Stack myStack;

    @Override
    public void run() {
        while(true) {
            try {
                myStack.pop();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class ThreadedStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the stack");
        int length = sc.nextInt();
        Stack myStack = new Stack(length);
        push t1 = new push(myStack);
        pop t2 = new pop(myStack);
        t1.start();
        t2.start();
    }
}
