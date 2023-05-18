import java.util.Scanner;

class employee{
    float salary=10000,bonus=0;
    float getBonus() {
        return bonus;
    }
    float getSalary(){
        return salary;
    }
}
class intern extends employee{
    float bonus=0;
    float getSalary(){
        return (3*salary/4);
    }
    void setBonus(float bonus){
        this.bonus = bonus;
    }
    float getBonus(){
        return bonus;
    }
    float getTotalSalary(){
        return getSalary()+getBonus();
    }
}
class clerk extends employee{
    float bonus=0;
    float getSalary(){
        return (salary/2);
    }
    void setBonus(float bonus){
        this.bonus = bonus;
    }
    float getBonus(){
        return bonus;
    }
    float getTotalSalary(){
        return getSalary()+getBonus();
    }
}
class Manager extends employee{
    float bonus=0;
    float getSalary(){
        return (salary*2);
    }
    void setBonus(float bonus){
        this.bonus = bonus;
    }
    float getBonus(){
        return bonus;
    }
    float getTotalSalary(){
        return getSalary()+getBonus();
    }
}
class ank{
public static void main(String[] args) {
    intern i = new intern();
    Scanner sc = new Scanner(System.in);
    Manager m = new Manager();
    clerk c = new clerk();
    float bonus=0;
    System.out.println("Enter bonus for the intern");
    bonus =sc.nextFloat();
    i.setBonus(bonus);
    System.out.println("Enter bonus for the clerk");
    bonus =sc.nextFloat();
    c.setBonus(bonus);
    System.out.println("Enter bonus for the manager");
    bonus =sc.nextFloat();
    m.setBonus(bonus);
    System.out.println("Base Salary received by the intern "+i.getSalary());
    System.out.println("Total salary received by intern: "+i.getTotalSalary());
    System.out.println("Base Salary received by the clerk "+c.getSalary());
    System.out.println("Total salary received by clerk: "+c.getTotalSalary());
    System.out.println("Base Salary received by the Manager "+m.getSalary());
    System.out.println("Total salary received by Manager: "+m.getTotalSalary());
}
}