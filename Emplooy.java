import java.util.Scanner;

class Employee{
    String name, id; 
    int age;
    public Employee(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }
    
}
class SalariedEmployee extends Employee{
    private double empSalary;
    public double getEmpSalary() {
        return empSalary;
    }
    String Type;
    void setter(String Type, double empSalary){
        this.Type = Type;
        if(Type =="permanent"||Type=="Permanent")
        this.empSalary = empSalary +2000;
        else
        this.empSalary = empSalary;
    }
    SalariedEmployee(String name, String id, int age, double empSalary, String Type){
        super(name, id, age);
        setter(Type, empSalary);
    }
    void highestSal(SalariedEmployee a[] ){
        double max = a[0].getEmpSalary();
        int emp=0;
        for (int i = 0; i < a.length; i++) {
            if(max<a[i].getEmpSalary()){
                max = a[i].getEmpSalary();
                emp = i;
            }
        }
        System.out.println("Employee with highest salary is: "+a[emp].name);
    }
}
class Emplooy{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SalariedEmployee a[] = new SalariedEmployee[5];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter name of the employee "+ (i+1));
            String name = sc.next();
            System.out.println("Enter id of the employee "+ (i+1));
            String id = sc.next();
            System.out.println("Enter age of the employee "+ (i+1));
            int age = sc.nextInt();
            System.out.println("Enter employee salary of the employee "+ (i+1));
            double empSalary = sc.nextDouble();
            System.out.println("Enter type of  employee "+ (i+1));
            String type = sc.next();
            a[i] = new SalariedEmployee(name, id, age, empSalary, type);
        }
        a[0].highestSal(a);

    }
}