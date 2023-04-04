import java.util.*;
class details{
   private String name;
    long accnum;
    String type;
    private float balance;
    void set(String name,long accnum,String type,float balance){
        this.name = name;
        this.accnum = accnum;
        this.type = type;
        this.balance = balance;
    }
    void detailsprinter(){
        System.out.println("Name of the person is: "+ name);
        System.out.println("Balance of the person is: "+ balance);
    }
    void depositer(int amt){

    }
}
class bankacc{
    public static void main(String args[]){
        details per1 = new details();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Acc name");
        String name = sc.nextLine();
        System.out.println("Enter acc number");
        long accnum = sc.nextLong();
        System.out.println("Enter acc type");
        String type = sc.nextLine();
        System.out.println("Enter Balance of the account");
        float bal = sc.nextFloat();
        per1.set(name,accnum,type,bal);
        System.out.println("Enter choice");
    }
}