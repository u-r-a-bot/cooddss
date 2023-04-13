import java.util.Scanner;

class fraction{
    int a,b,c,d,an,ad;
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
    int gcd(int x,int y){
    	int gcd=0,n;
    	if(x>y)
    		n =x;
    	else
    		n =y;
    	for(int i=1;i<n;i++){
    		if(x%i==0 && y%i==0)
    			gcd =i;
    	}
    	return gcd;
    }
    void addition(){
        an = a*d;
        an = an+(b*c);
        
        ad = (b*d);
        int x = gcd(an,ad);
        an =an/x;
        ad =ad/x;
        
        System.out.println("Ans of the fraction is \n\t"+an+"\n\t--"+"\n\t"+ad);
    }
    void sub(){
    	an = (a*d) -(b*c);
    	ad = (b*d);
        int x = gcd(an,ad);
        an =an/x;
        ad =ad/x;
        System.out.println("Ans of the fraction is \n\t"+an+"\n\t--"+"\n\t"+ad);
    }
    void mul(){
    	an =(a*c);
    	ad =(d*b);
        int x = gcd(an,ad);
        an =an/x;
        ad =ad/x;
        System.out.println("Ans of the fraction is \n\t"+an+"\n\t--"+"\n\t"+ad);
    }
    void div(){
    	an =(a*d);
    	ad =(b*c);
        int x = gcd(an,ad);
        an =an/x;
        ad =ad/x;
        System.out.println("Ans of the fraction is \n\t"+an+"\n\t--"+"\n\t"+ad);
    }
}

class fractionop{
        public static void main(String[] args) {
            fraction abcd = new fraction();
            Scanner sc = new Scanner(System.in);
            boolean bo = true;
            do{
            System.out.println("Enter val of numerator of fraction 1");
            int a = sc.nextInt();
            System.out.println("Enter val of denominator of fraction 1");
            int b = sc.nextInt();
            System.out.println("Enter val of numerator of fraction 2");
            int c = sc.nextInt();
            System.out.println("Enter val of denominator of fraction 2");
            int d = sc.nextInt();
            abcd.set(a,b,c,d);
            System.out.println("enter Choice:\n1.Addition\n2.Subtraction\n3.multiplicaiton\n4.division\n5.Exit");
            int choice;
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    abcd.addition();	
                    break;
                case 2:
                    abcd.sub();
                    break;
                case 3:
                    abcd.mul();
                    break;
                case 4:
            	    abcd.div();        
                    break;
                case 5:
                    bo= false;
                    break;
                default:
                    System.out.println("Wrong choice entered :(");
                    break;
            }
        }
        while(bo);
        }
}
