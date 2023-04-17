import java.util.*;

class date1{
	
	int year, month, date,  hrs, min,sec,counter=0;
	date1(){
		year =2023;
		month =4;
		min =0;
		sec =0;
		hrs =0;
		date =17;
	}
	void ete(date1 def){
		int expy = year - def.year;
		int expm = month - def.month;
		int expd = date - def.date;
		int exphr = hrs -def.hrs;
		int expmin = min - def.min;
		int expsec = sec - def.sec;
		if(exphr <0) 	exphr=-exphr;
		if(expmin <0) 	expmin=-expmin;
		if(expsec <0) 	exphr=-expsec;
		if(expy<0)
			expy = -expy;
		if(expm<0)
			expm =-expm;
		if(expd<0)
			expd =-expd;
		System.out.println("Time remaining for explosion: "+expy+" Years "+expm+" Months "+ expd+" days "+exphr+" hrs "+expmin +" mins "+expsec+" sec ");
		
			
	}
	void Month(){
		switch(month){
			case 1:
				System.out.print("January ");
				break;
			case 2:
				System.out.print("February ");
				break;
			case 3:
				System.out.print("March ");
				break;
			case 4:
				System.out.print("April ");
				break;
			case 5:
				System.out.print("May ");
				break;
			case 6:
				System.out.print("June ");
				break;
			case 7:
				System.out.print("July ");
				break;
			case 8:
				System.out.print("August ");
				break;
			case 9:
				System.out.print("September ");
				break;
			case 10:
				System.out.print("October ");
				break;
			case 11:
				System.out.print("November ");
				break;
			case 12:
				System.out.print("December ");
				break;
		}
	}
	void setDate(int year,int month,int date){
	this.year = year;
	this.month = month;
	this.date = date;
	counter =0;
	}
	void setDate(int year,int month,int date, int hrs, int min){
	this.year = year;
	this.month = month;
	this.date = date;
	this.hrs = hrs;
	this.min = min;
	counter =1;
	}
	void setDate(int year, int month,int date,int hrs, int min, int sec){
	this.year = year;
	this.month = month;
	this.date = date;
	this.hrs = hrs;
	this.min = min;
	this.sec = sec;
	counter =2;
	}
	void displayDate(){
	Month();
	switch(counter){
	
	case 0:
		System.out.print(" "+date+", "+year+"\n");
		break;
	case 1:
		System.out.print(" "+date+", "+year+", "+ hrs+"::"+min+"\n");
		break;
	case 2:
		System.out.print(" "+date+", "+year+", "+ hrs+"::"+min+"::"+sec+"\n");
		break;
	}
	}
}


class bomb{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int year, month, date, hrs, min,sec,choice;
	date1 a = new date1();
	date1 def = new date1();
	System.out.println("Enter Choice \n1.MM/DD/YYYY\n2.MM/DD/YYYY h::m \n3.MM/DD/YYYY h::m::s");
	choice = sc.nextInt();
	switch(choice){
		case 1:
			System.out.println("Enter value of the year");
			year = sc.nextInt();
			System.out.println("Enter value of the month");
			month = sc.nextInt();
			System.out.println("Enter value of the date");
			date = sc.nextInt();
			a.setDate(year,month,date);
			break;
		case 2:
			System.out.println("Enter value of the year");
			year = sc.nextInt();
			System.out.println("Enter value of the month");
			month = sc.nextInt();
			System.out.println("Enter value of the date");
			date = sc.nextInt();
			System.out.println("Enter value of the Hrs");
			hrs = sc.nextInt();
			System.out.println("Enter value of the min");
			min = sc.nextInt();
			a.setDate(year,month,date,hrs,min);
			break;
		case 3:
			System.out.println("Enter value of the year");
			year = sc.nextInt();
			System.out.println("Enter value of the month");
			month = sc.nextInt();
			System.out.println("Enter value of the date");
			date = sc.nextInt();
			System.out.println("Enter value of the Hrs");
			hrs = sc.nextInt();
			System.out.println("Enter value of the min");
			min = sc.nextInt();
			System.out.println("Enter value of the Sec");
			sec = sc.nextInt();
			a.setDate(year,month,date,hrs,min,sec);
			break;
		default:
			System.out.println("Wrong Input");
			
		
	}
	a.displayDate();
	a.ete(def);
}}
