import java.util.*;
class details{
   private String name;
    int accnum;
    String type;
    private float balance;
    void set(String name,int accnum,String type,float balance){
        this.name = name;
        this.accnum = accnum;
        this.type = type;
        this.balance = balance;
    }
    void detailsprinter(){
        System.out.println("Name of the person is: "+ name);
        System.out.println("Balance of the person is: "+ balance);
    }
    void depositer(float amt){
        System.out.println("Balance before deposit: "+  balance);
        balance = balance + amt;
        System.out.println("Balance after deposit: "+  balance);
    }
    float getBalance(){
        return balance;
    }
    void withdraw(float amt){
        balance = balance - amt;
        System.out.println("Amt of "+ amt + "has been withdrawn. \nNow your current balance is: "+balance);
    }
}
class bankacc{
    public static void main(String args[]){
        details per1 = new details();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Acc name");
        String name = sc.nextLine();
        System.out.println("Enter acc number");
        int accnum = sc.nextInt();
        System.out.println("Enter acc type");
        String type = sc.next();
        System.out.println("Enter Balance of the account");
        float bal = sc.nextFloat();
        per1.set(name,accnum,type,bal);
        System.out.println("Enter choice \n1.Deposit \n2.Withdraw amt after checking ballance\n3.Display name and balance");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Enter amt to be deposited");
                float deposit = sc.nextFloat();
                per1.depositer(deposit);
                break;
            case 2:
                System.out.println("Your current balance is: " +  per1.getBalance());
                System.out.println("Enter amt to be withdrawn");
                float withdraw = sc.nextFloat();
                if(withdraw > per1.getBalance()){
                    System.out.println("Insufficient funds");
                    break;
                }
                else{
                    per1.withdraw(withdraw);
                    break;
                }
            case 3:
                per1.detailsprinter();
                break;
            default:
                System.out.println("Wrong Choice entered :(");
        }
    }
}