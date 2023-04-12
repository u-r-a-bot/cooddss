import java.util.Scanner;

class time{
    int sec,hr,min;
    void setsec(int sec){
        this.sec = sec;
    }
    void set(int sec,int min, int hr){
        this.sec= sec;
        this.hr = hr;
        this.min = min;
    }
    void conversion1(){
        hr = sec/3600;
        sec %=3600;
        min =sec/60;
        sec%=60;
        System.out.println("Value of hrs is: "+ hr+"\nvalue of mins is: "+min+"\nValue of sec is: "+sec);
    }
    void coversion2(){
        hr *=3600;
        min*=60;
        int totseconds = hr + min +sec;
        System.out.println("total seconds is: "+ totseconds);
    }
}
class converter{
    public static void main(String[] args){
        int totseconds,hr,sec,min,choice;
        Scanner sc = new Scanner(System.in);
        time a = new time();
        System.out.println("Enter 1 if you want to convet totsec to hr min and sec\nEnter 2 if you want totsec from hr, min and sec");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter Totseconds");
                totseconds = sc.nextInt();
                 a.setsec(totseconds);
                 a.conversion1();
                break;
            case 2:
                System.out.println("Enter seconds: ");
                sec =sc.nextInt();
                System.out.println("Enter min: ");
                min =sc.nextInt();
                System.out.println("Enter hr: ");
                hr =sc.nextInt();
                a.set(sec,min,hr);
                a.coversion2();
                break;
            default:
                break;
        }
        
        

    }
}