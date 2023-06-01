import java.rmi.server.SocketSecurityException;
import java.util.Scanner;

interface EatItHere{
    void serveOrder(); 
}
interface TakeAway{
    void deliverOrder();

}
class Consumer implements EatItHere,TakeAway{
    float TotalBill;
    float rod = (float)0.05;
    float roe = (float)0.1;
    Consumer(float TotalBill){
        this.TotalBill=TotalBill;
    }
    public void serveOrder(){
        float amt = roe *TotalBill;
        if(amt<500){
            TotalBill+=amt;
        }
        else{
            TotalBill+=500;
        }
        System.out.println("The total bill is (Service charge:-"+amt+") " + TotalBill);
    }
    public void deliverOrder(){
        float amt = rod*TotalBill;
        if(amt>45){
            TotalBill+=amt;
        }
        else{
            TotalBill+=45;
        }
        System.out.println("The total bill is (Delivery charge:-"+amt+") " + TotalBill);
    }
}
class foood{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float burg =250,naan =400,coke = 120, choco = 219;
        int burgqt=0,naanqt=0,cokeqt=0,chocoqt=0;
        for(int i=0;i<4;i++){
        System.out.println("Welcome to Hell's Restraunt. Following is the Menu: ");
        boolean runner = true;
        while(runner){
        System.out.println("\n1.Burgir  Price:- 250 \n2.Naan chhola Price:- 400\n3.Coke (With Extra CO2) Price:- 120\n4.Chocolava(with chocolate) Price:-219\n5.Billing");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Enter the number of burgers");
                burgqt = sc.nextInt();
                break;
            case 2:
                System.out.println("Enter the number of naan chhola ");
                naanqt = sc.nextInt();
                break;
            case 3:
                System.out.println("Enter the number of coke items you want");
                cokeqt = sc.nextInt();
                break;
            case 4:
                System.out.println("Enter the number of chocolate cake you want");
                chocoqt  = sc.nextInt();
                break;
            case 5:
                runner = false;
                break;
        }
    }
    float TotalBill = burg*(float)burgqt +naan * (float)naanqt+ coke*(float)cokeqt+ choco*(float)chocoqt;
    System.out.println("Total bill: " + TotalBill);
    Consumer a = new Consumer(TotalBill);
    //System.out.println(a.rod+"  roe is: "+a.roe);
    System.out.println("Enter 1 if you want dining in restraunt or 2 for food delivery right at your own home");
    int chooser = sc.nextInt();
    if(chooser==1) {a.serveOrder();}
    else if(chooser==2){a.deliverOrder();}
    else System.out.println("wrong choice bud");
}
}}