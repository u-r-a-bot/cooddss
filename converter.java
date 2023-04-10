import java.util.*;
class time{
	int sec,min=0,hr=0;
	void set(int sec){
		this.sec = sec;
	}
	void conversion1(){
		 while(sec>=3600){
		 	hr = sec/3600;
		 	sec%=3600;
		 	System.out.println("Val of hr "+ hr+ "Sec is "+ sec);
		 }
		 while(sec>=60){
		 	System.out.println("Val of min "+ min+ "Sec is "+ sec);
		 	min = sec/60;
		 	sec%=60;
		 	System.out.println("Val of min is "+ min+ "Sec is "+ sec);
		 }
		 System.out.println("Total hrs:" + hr+"\nTotal min: "+min+ "\nTotal Sec: "+sec);
	}
	
	
}

class converter{
	public static void main(String args[]){
		int totsec;
		System.out.println("Enter seconds");
		Scanner sc = new Scanner(System.in);
		totsec = sc.nextInt();
		time a = new time();
		a.set(totsec);
		a.conversion1();
		
	}
}
