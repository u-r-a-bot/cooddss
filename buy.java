import java.util.Scanner;
import java.lang.Math;
class purchase{
	Scanner inp = new Scanner(System.in);
	String item;
	int qt;
	float price;
    double total;
	purchase(String item,int qt,float price){
		this.item = item;
		this.qt = qt;
		this.price = price;
	}
	void Display(purchase a[],int n){
		System.out.println("item\t\tquantity\t\tprice\t\tPrice per unit");
		for(int i=0; i<n; i++){
			System.out.println(a[i].item +"\t\t" + a[i].qt+"\t\t\t\b"+(a[i].price*a[i].qt)+"\t\t\t\b"+a[i].price);
			
		}
		System.out.println("\nTotal\t\t\t"+a[0].total(a,n));
	
	}
    void payment(long cc){
        long displayedcc = cc%10000;
        System.out.println("Cred number for this transaction is: XXXX "+ displayedcc);
    }
    void payment(){
        System.out.println("Total amt with additional charges is: "+ (total + 50));

    }
    void payment(String Bname,long accno){
        System.out.println("Bank name: "+ Bname + "\nAccount number is: XXX "+ (accno%1000));
    }
	double total(purchase a[],int n){
		double sum =0;
		for(int i=0;i<n;i++){
			sum+= (a[i].price*a[i].qt);
		}
        total = sum;
		return sum;
	}
}

class buy{
	public static void main(String args[]){
	purchase a[] = new purchase[50];
	Scanner sc = new Scanner(System.in);
	int choice1=0, choice2,choice3,n=0;
	double total;
		while(true){
			
			System.out.println("Enter the name of the item");
			String item= sc.next();
			System.out.println("Enter the quantity");
			int qt = sc.nextInt();
			System.out.println("Enter the price of the item");
			float price = sc.nextFloat();
			a[n] = new purchase(item,qt,price);
			n++;
			System.out.println("Enter 1 to exit or anything else to continue (in integer)");
			choice1 = sc.nextInt();
			if(choice1 == 1)
				break;
		}
	a[0].Display(a,n);
	total = a[0].total(a,n);
		System.out.println("Enter choice \n1.Enter another item \n2.Proceed to payment \n3.exit");
		choice2 = sc.nextInt();
		switch(choice2){
			case 1:
				while(true){
			
			System.out.println("Enter the name of the item");
			String item= sc.next();
			System.out.println("Enter the quantity");
			int qt = sc.nextInt();
			System.out.println("Enter the price of the item");
			float price = sc.nextFloat();
			a[n] = new purchase(item,qt,price);
			n++;
			System.out.println("Enter 1 to exit or anything else to continue");
			choice1 = sc.nextInt();
			if(choice1 == 1)
				break;
		}
            total = a[0].total(a,n);
            System.out.println("Enter 1 to proceed for payment or enter 2 to exit");
            int choice4 = sc.nextInt();
            if(choice4 == 2)
			break;
			case 2:
				System.out.println("Enter the way you want to proceed \n1.COD\n2.NetBanking\n3.Creditcard");
				choice3 = sc.nextInt();
				switch(choice3){
					case 1:
						a[0].Display(a,n);
                        a[0].payment();
                        break;
                    case 2:
                        a[0].Display(a, n);
                        double totaled = total/100;
                        totaled = total +totaled;
                        System.out.println("Total amt with charges is(1%): "+ totaled);
                        System.out.println("Enter Bank name");
                        String Bname = sc.next();
                        System.out.println("Enter Acc number(6 digit number)");
                        long accno = sc.nextLong();
                        a[0].payment(Bname, accno);
						break;
                    case 3:
                        a[0].Display(a, n);
                        double totaled1 = total*2;
                        totaled1 /=100;
                        totaled1 += total;
                        System.out.println("Total amt is with charges(2%): "+ totaled1);
                        System.out.println("Enter credit card number (8digit only): ");
                        long cc = sc.nextLong();
                        a[0].payment(cc);
                        break;

				}
                break;
            default:
                System.out.println("Wrong choice ");
                break;
		}
        System.out.println("Thank you for using our services :)");
	}
}