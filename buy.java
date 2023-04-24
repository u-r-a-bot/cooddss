import java.util.Scanner;
import java.lang.Math;
class purchase{
	
	String item;
	int qt;
	float price;
	purchase(String item,int qt,float price){
		this.item = item;
		this.qt = qt;
		this.price = price;
	}
	void Display(purchase a[],int n){
		System.out.println("item\t\tquantity\t\tprice\t\tPrice per unit");
		for(int i=0; i<n; i++){
			System.out.println(a[i].item +"\t\t" + a[i].qt+"\t\t"+(a[i].price*a[i].qt)+"\t\t"+a[i].price);
			
		}
		System.out.println("\nTotal\t\t\t"+a[0].total(a,n));
	
	}
	float total(purchase a[],int n){
		float sum =0;
		for(int i=0;i<n;i++){
			sum+= (a[i].price*a[i].qt);
		}
		return sum;
	}
}

class buy{
	public static void main(String args[]){
	purchase a[] = new purchase[50];
	Scanner sc = new Scanner(System.in);
	int choice1=0, choice2,choice3,n=0;
	float total;
		while(true){
			
			System.out.println("Enter the name of the item");
			String item= sc.next();
			System.out.println("Enter the quantity");
			int qt = sc.nextInt();
			System.out.println("Enter the price of the item");
			float price = sc.nextFloat();
			a[n] = new purchase(item,qt,price);
			n++;
			System.out.println("Enter 1 to exit or anything else to continue in integer");
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
			break;
			case 2:
				System.out.println("Enter the way you want to proceed \n1.COD\n2.NetBanking\n3.Creditcard");
				choice3 = sc.nextInt();
				switch(choice3){
					case 1:
						a[0].Display(a,n);
						System.out.println("Total amt with");
				}
		}
	}
}
