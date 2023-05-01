import java.util.*;
class cityday{
	String name;
	int[] temp;
	int jval=0,ival=0;
    int jval1=0,ival1=0;
	cityday(String name, int temp[],int l){
		this.name = name;
		this.temp = temp;
	}
	int max(cityday a[],int n,int l){
			int maximum = a[0].temp[0];
			for(int j=0;j<l;j++){
				for(int i=0;i<n;i++){
					if(a[i].temp[j]>maximum){
						jval = j;
						ival =i;
						maximum = a[i].temp[j];
					}
					
				}
			}
			return maximum;
	}
    int min(cityday a[],int n,int l){
        int minimum = a[0].temp[0];
        for(int j=0;j<l;j++){
            for(int i=0;i<n;i++){
                if(a[i].temp[j]<minimum){
                    jval1 = j;
                    ival1 =i;
                    minimum = a[i].temp[j];
                }
                
            }
        }
        return minimum;
}
    void display(cityday a[], int n,int l){
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print("\t"+ a[i].name);
        }
        System.out.println();
        for (int i = 0; i < l; i++) {
            System.out.print("day"+(i+1));
            for (int j = 0; j < n; j++) {
                if(j==a[0].ival&&i==a[0].jval){
                    System.out.print("\t\u001B[31m"+a[j].temp[i]+"\u001B[0m");
                }
                else if(j==a[0].ival1&&i==a[0].jval1){
                    System.out.print("\t\u001B[36m"+a[j].temp[i]+"\u001B[0m");
                }
                else{
                    System.out.print("\t"+a[j].temp[i]);
                }
            }
            System.out.println();
        }
    }
}
class tempcity{
	public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			int n=0;
			int l=0;
			System.out.println("Enter how many days you want to enter");
			l = sc.nextInt();
			cityday[] a = new cityday[50];
			while(true){
				System.out.println("Enter the name of the city");
				String name = sc.next();
				int temp[] = new int[l];
				for(int i=0;i<l;i++){
				System.out.println("Enter the temp for day: "+(i+1));
				temp[i] = sc.nextInt();
								}
			a[n] = new cityday(name,temp,l);
			n++;
			System.out.println("enter 1 to exit or 2 to continue");
			int choice = sc.nextInt();
			if(choice ==1) break;
			}
            a[0].max(a,n,l);
            a[0].min(a,n,l);
			 int x = a[0].jval;
			 int y = a[0].jval1;
			System.out.println("temperature was max : "+a[0].max(a,n,l)+" incity: "+a[(a[0].ival)].name+" at day"+(x+1));
            System.out.println("temperature was min : "+a[0].min(a,n,l)+" incity: "+a[(a[0].ival1)].name+" at day"+(y+1));
            a[0].display(a, n, l);
			}
			}