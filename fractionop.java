import java.util.Scanner;

class fraction{
    int a,b,c,d;
    fraction(){
        a=1;
        b=1;
        c=1;
        d=1;
    }
    void set(int a,int b, int c,int d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    void addition(){
        
    }
}

class fractionop{
        public static void main(String[] args) {
            fraction abcd = new fraction();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter val of a");
            int a = sc.nextInt();
            System.out.println("Enter val of b");
            int b = sc.nextInt();
            System.out.println("Enter val of c");
            int c = sc.nextInt();
            System.out.println("Enter val of d");
            int d = sc.nextInt();
            abcd.set(a,b,c,d);
            System.out.println("enter Choice:\n1.Addition\n2.Subtraction\n3.multiplicaiton\n4.division");
            int choice;
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                default:
                    break;
            }
        }
}