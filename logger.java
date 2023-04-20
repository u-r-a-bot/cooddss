import java.lang.*;
import java.util.*;
class test{
	double base;
	int power,logBase,argument;
	test(){
		base =2;
		logBase =2;
		power =2;
		argument =2;	
	}
	double calculate(double base, int power){
		double result=0;
		result = Math.pow(base,power);
		return result;
	}
	double calculate(int logBase ,int argument){
		double res =0,res1=0;
		res =Math.log(argument);
		res1 = Math.log(logBase);
		return res/res1;
	}

}
class logger{
	public static void main(String args[]){
		test a = new test();
		int x=0,choice;
		double base;
		int power,logBase,argument;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter choice \n1.Exponential \n2.Log");
		choice = sc.nextInt();
		switch(choice){
			case 1:
				System.out.println("Enter the value of base for exponent");
				base = sc.nextDouble();
				System.out.println("Enter the value of power for exponential");
				power = sc.nextInt();
				System.out.println(" "+base+" ^ "+power+" = "+ a.calculate(base,power));
				break;
			case 2:
				System.out.println("Enter the value of base of log");
				logBase = sc.nextInt();
				System.out.println("Enter the value of argument of the log ");
				argument = sc.nextInt();
				System.out.println("Log("+argument+")"+"when base is: "+logBase+" = "+ a.calculate(logBase,argument));
				break;
			default:
				System.out.println("Wrong choice :(");
				
		}
	}
}
