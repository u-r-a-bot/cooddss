import java.util.*;
class cityday{
	String name;
	int[] temp = new int[5];
	int jval=0,ival=0;
	cityday(String name, int temp[]){
		this.name = name;
		for(int i=0;i<5;i++){
			this.temp[i] = temp[i];
		}
	}
	int max(cityday a[],int n){
			int maximum = a[0].temp[0];
			for(int j=0;j<5;j++){
				for(int i=0;i<n;i++){
					if(a[i].temp[j]>maximum){
						jval = j;
						ival =i;
						maximum = a[i].temp[j];
					}
					
				}
				System.out.println("maximum is: "+ maximum);
			}
			return maximum;
	}
}
class tempcity{
	public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			int n=0;
			cityday[] a = new cityday[50];
			while(true){
				System.out.println("Enter the name of the city");
				String name = sc.next();
				int temp[] = new int[5];
				for(int i=0;i<5;i++){
				System.out.println("Enter the temp for day: "+(i+1));
				temp[i] = sc.nextInt();
								}
			a[n] = new cityday(name,temp);
			n++;
			System.out.println("enter 1 to exit or 2 to continue");
			int choice = sc.nextInt();
			if(choice ==1) break;
			}
			 
			System.out.println("\u001B[31m"+"temperature was max : "+a[0].max(a,n)+"incity: "+a[(a[0].jval)].name+"at day"+a[(a[0].jval)].temp[a[0].ival]);
			}
			}

