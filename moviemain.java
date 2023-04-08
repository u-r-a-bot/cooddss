import java.util.*;
class User{
    Scanner inp = new Scanner(System.in);
    int age;
    String name;
    float accBal;
    boolean lowage,lowmoney;
    boolean can(Movie m){
    if(m.ageRestriction >= age)
     lowage = true;
    if(m.cost >= accBal)
    	lowmoney = true;
    if(lowage||lowmoney){
      	  if(lowage){
        	System.out.println("You Cant watch movie :(");
        	return false;
        	}
          else if(lowmoney){
          	System.out.println("Insufficient funds ");
          	return false;
          	}
          else if(lowage && lowmoney){
          	System.out.println("Movie not appropriate for you and Insufficient funds ");
          	return false;
          	}
        }
        return true;
    }
    void WatchMovie(Movie a){
        int ab =0;
    	if(can(a)){
    		System.out.println("You can watch the movie after transanction is completed\nEnter 1 or 2\n1.Proceed \n2.exit");
    		ab = inp.nextInt();
    		switch(ab){
    			case 1:{
    				accBal = accBal - a.cost;
    				System.out.println("Thank you  you can watch the movie your current balance is: \n"+accBal);
    				break;
    			}
    			case 2:{
    			 	break;
    			}
    			default:
    				System.out.println("wrong choice ");
    		}
    		
    	}
    }
}
class Movie{
    String title;
    int ageRestriction;
    float cost;
    void setCost(float cost){
    this.cost = cost;
    }
    void setAgeRestriction(int ageRestriction){
        this.ageRestriction = ageRestriction;
    }
}
class moviemain{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	User[] a = new User[2];
	for(int i=0;i<2;i++){
		a[i] = new User();
	}
	Movie[] m = new Movie[2];
		for(int i=0;i<2;i++){
			m[i] = new Movie();
		}
	for(int i=0;i<2;i++){
	System.out.println("Enter name of the user "+i);
	a[i].name = sc.next();
	System.out.println("Age "+i);
	a[i].age = sc.nextInt();
	System.out.println("Enter balance of the user "+i);
	a[i].accBal = sc.nextFloat();
	}
	for(int i=0;i<2;i++){
		System.out.println("Enter title of the movie "+i);
		m[i].title = sc.next();
		System.out.println("Enter cost of the movie "+i);
		float x = sc.nextFloat();
		m[i].setCost(x);
		System.out.println("Enter age restriction "+i);
		int y = sc.nextInt();
		m[i].setAgeRestriction(y);
		
	}
	int exit =0
	while(exit == 3){
	int usrch;
	System.out.println("which user is booking:" );
	for(int i=0;i<2;i++){
		System.out.println("\n"+i +". "+a[i].name);
	}
	usrch = sc.nextInt();
	User doe = a[usrch];
	int choice =0;
		System.out.println("which movie do u want to watch: " );
	for(int i=0;i<2;i++){
		System.out.println("\n"+i+". "+m[i].title);
	}
	choice = sc.nextInt();
	Movie j = m[choice];
	doe.WatchMovie(j);
	System.out.println("Enter 3 to exit or anything else to contiue " );
	exit = sc.nextInt();
	}
	}
}
