import java.util.Scanner;

abstract class Payment{
    double amount = 25000;
    abstract void paymentdetails(int accessories, int clothes);
}
class cashPayment extends Payment{
    @Override
    void paymentdetails(int accessories, int clothes) {
        if(amount >= (accessories+clothes)*westSide.amount){
        System.out.println("The number of clothes bought: "+ clothes+" Number of accessories bought: "+ accessories);
        amount = amount -(accessories+clothes)*westSide.amount;
        westSide.accessories -=accessories;
        westSide.clothes -=clothes;
        System.out.println("The number of clothes remaining");
    }
        else{
            System.out.println("Insufficient money");
        }
}
}
class creditCardPayment{
    String name;int year;int month;long creditcard;
    @Override
    void paymentdetails(int accessories, int clothes) {
        System.out.println("Payment selected is is Credit Card"); 
        System.out.println("The number of clothes bought: "+ clothes+" Number of accessories bought: "+ accessories);
        amount = amount -(accessories+clothes)*westSide.amount;
    }
    void creditDetailsSet(String name,int year,int month,long creditcard){
        this.name = name;
        this.year = year;
        this.month = month;
        this.creditcard = creditcard;
    }
}
class westSide{
    static int clothes = 10;
    static int accessories =10;
    static float eachcloacc =5000; 
}
class Person{
    String p_name;
    long p_phone;
    public Person(String p_name, long p_phone) {
        this.p_name = p_name;
        this.p_phone = p_phone;
    }
}
class payer{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        westSide west = new westSide();
        Person people[] = new Person[5];
        boolean b = false;
        cashPayment cashpay = new CashPayment();
        creditCardPayment creditcard[] = new CreditCardPayment[5];
        for(int i=0; i<people.length;i++){
            System.out.println("Enter the name of the person");
            String name = sc.next();
            System.out.println("Enter the phone number");
            long phonenum = sc.nextLong();
            people[i] = new Person(name, phonenum);
            System.out.println("Enter the amount of clothes you want to buy");
            int clothes = sc.nextInt();
            System.out.println("Enter the amount of accessories you want to buy");
            int accessories = sc.nextInt();
            if(westSide.clothes >= clothes&&westSide.accessories >= accessories){
                b=true;
            }
            else{
                b = false;
            }
            if(b){
                System.out.println("Choose the way you want to pay \n1.Cash\n2.Credit Card");
                int choice = sc.nextInt();
                switch(choice){
                    case 1: 
                        cashpay.paymentdetails(accessories, clothes);
                        break;
                    case 2:
                        creditcard[i] = new CreditCardPayment();
                        System.out.println("Enter the Name on the creditcard(single name)");
                        String CredName = sc.next();
                        System.out.println("Enter the Number on the credit card");
                        long CredNumber = sc.nextLong();
                        System.out.println("Enter the year of expiration on the credit card");
                        int year = sc.nextInt();
                        System.out.println("Enter the month of expiration on the credit card");
                        int month = sc.nextInt();
                        creditcard[i].creditDetailsSet(CredName, year, month, CredName);
                        creditcard[i].paymentdetails(accessories, clothes);
                        break;
                }
            }
            else{
                System.out.println("Required items unavailable in Stock");
            }
        }

    }
}