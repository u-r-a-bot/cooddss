import java.util.Scanner;

class Stack{
    int[] stack;
    static int length;
    static int pointer;
    Stack(int length){
        this.length = length;
        stack = new int[length];
        pointer = -1;
    }
    Stack pop(Stack a)throws Exception{
        if(Stack.pointer < 0) throw new Exception();
        else{
            a.stack[pointer] = 0;
            pointer --;
        }
        return a;
    }
    Stack push(Stack a,int b) throws Exception{
        if(Stack.pointer == Stack.length-1) throw new Exception();
        else{
            pointer ++;
            a.stack[pointer] = b;
        }
        a.printer(a);
        return a;
    }
    void printer(Stack a){
        System.out.println("The Elements are");
        for (int i = 0; i <=Stack.pointer; i++) {
            System.out.println(a.stack[i]);
        }
    }
}
class stacked{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of Stack");
        int length = sc.nextInt();
        Stack stacked = new Stack(length);
        boolean b = true;
        while(b){
            System.out.println("Enter the number to perform following expression on stack\n1.Push\n2.Pop\n3.Print\n4.exit");
            int choice = sc.nextInt();
            try{
            switch(choice){
                case 1:
                try{
                    System.out.println("Enter the number you want to push");
                    int pu = sc.nextInt();
                    stacked = stacked.push(stacked, pu);
                    break;}catch(Exception e){System.out.println();}
                case 2:
                    System.out.println("The Element will be poped ");
                    stacked = stacked.pop(stacked);
                    break;
                case 3:
                    stacked.printer(stacked);
                    break;
                case 4:
                    b= false;
                    break;
            }
        }catch(Exception e){
            System.out.println("CAnnot perform operation");
        }
    }
}}