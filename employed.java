import java.util.*;
import java.lang.*;
class posting{
	int courseWork,AptTest,TechTest,interview,prof=0;

 	posting(int courseWork, int AptTest, int TechTest,int interview){
		this.courseWork = courseWork;
		this.AptTest = AptTest;
		this.TechTest = TechTest;
		this.interview = interview; 	
		prof =1;
 }

	posting(int TechTest,int interview){
		this.TechTest = TechTest;
		this.interview = interview; 	
		prof =2;
	}

	posting(int interview){
		this.interview = interview; 	
		prof = 3;
	}
	void eligible(){
		switch(prof){
			case 1:
				int total = courseWork+AptTest+TechTest+interview;
				if(total > 80){
					System.out.println("You are eligible for Progamer :)");	
				}
				else
					System.out.println("You are not eligible for Progamer :(");
				break;
			case 2:
				int total1 =TechTest+interview;
				if(total1 >85)
					System.out.println("You are eligible for Team Leader :)");
				else
					System.out.println("You are not eligible for Team Leader :(");
				break;
			case 3:
				int total2 =interview;
				if(total2 >80)
					System.out.println("You are eligible for Project Manager :)");
				else
					System.out.println("You are not eligible for Project Manager :(");
				break;
		}
	}
	
}
class employed{
	public static void main(String args[]){
	posting a;
	int courseWork,AptTest,TechTest,interview;
	Scanner sc = new Scanner(System.in);
	int choice;
	System.out.println("Enter the the postiton you want to apply\n1.Progamer \n2.Team Leader \n3.Project Manager");
	choice = sc.nextInt();
	switch(choice){
		case 1:
			System.out.println("Enter the marks of Course work: ");
			courseWork = sc.nextInt();
			System.out.println("Enter the marks of AptTest: ");
			AptTest = sc.nextInt();
			System.out.println("Enter the marks of TechTest: ");
			TechTest = sc.nextInt();
			System.out.println("Enter the marks of Interview: ");
			interview = sc.nextInt();
			a = new posting(courseWork,AptTest,TechTest,interview);
			a.eligible();
			break;
		case 2:
			System.out.println("Enter the marks of TechTest: ");
			TechTest = sc.nextInt();
			System.out.println("Enter the marks of Interview: ");
			interview = sc.nextInt();
			a = new posting(TechTest,interview);
			a.eligible();
			break;
		case 3:
			System.out.println("Enter the marks of Interview: ");
			interview = sc.nextInt();
			a = new posting(interview);
			a.eligible();
			break;
		default:
			System.out.println("Wrong choice :(");
			
			
	}
	
}}
