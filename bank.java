import java.util.*;
class acc{
	Scanner inp = new Scanner(System.in);
	float bal;
	float roi;
	float ci =0;
	acc(float bal,float roi){
		this.bal = bal;
		this.roi=roi;
	
	}
	void dep(float amt){
		System.out.println("Your balance currently is: " + bal);
		bal = bal + amt;
		System.out.println("Your balance now is: " + bal);
	}
	void with(float amt){
		if(bal>amt){
		System.out.println("Your balance currently is: " + bal);
		bal-=amt;
		System.out.println("Your balance now is: " + bal);}
		else
			System.out.println("Insufficient balance ");
	}
	void compint(float years,float n){
		 for(float i=0;i<=(n*years);i++){
		 ci =(1+(roi/n));
		 }
		 ci*=bal;
		 System.out.println("Your compound interest on balance is: " + ci);
		 bal+=ci;
		 System.out.println("Total balance after "+years+" will be: "+ci);
	}
	void display(){
		System.out.println("Your balance currently is: " + bal);
	}
	boolean menu(){
		System.out.println("Enter choice for the menu\n1.Deposit\n2.withdraw\n3.Coumpound interest\n4.Check Your balance\n5.show this menu\n6.Exit");
		int choice = inp.nextInt();
		switch(choice){
			case 1:
				System.out.println("Enter the amount you want to deposit");
				float amt = inp.nextFloat();
				dep(amt);
				break;
			case 2: 
				System.out.println("Enter the amount you want to withdraw ");
				float amt1 = inp.nextFloat();
				with(amt1);
				break;
			case 3:
				System.out.println("Enter amount of years you want to keep in ");
				float years = inp.nextFloat();
				System.out.println("Enter frequency of compound");
				float n = inp.nextInt();
				compint(years,n);
				break;
			case 4:
				display();
				break;
			case 5:
				menu();
				break;
			case 6:
				return false;
			default:
				System.out.println("wrong choice entereed ");
				
		}
		return true;
		
		
	}
	
}

class bank{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		float bal,roi;
		System.out.println("Enter the balance of the user: ");
		bal = sc.nextFloat();
		System.out.println("Enter the rate of interest: ");
		roi = sc.nextFloat();
		acc a = new acc(bal,roi);
		while(true){
			if(a.menu());
			else
				break;
		}
		
		
	}
}
