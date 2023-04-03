import java.util.Scanner;
import java.lang.Math;

class calc{
    int upperLimit ,lowerLim;
    void set(int x, int y){
        upperLimit = y;
        lowerLim = x;

    }
    boolean prime(int n){
        int i;
        for(i =2;i<Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    void primeprinter(){
        int i,counter =0;
        System.out.println("Prime numbers are: ");
        for(i=lowerLim;i<=upperLimit;i++){
            if(prime(i)){
                System.out.print(i+ " ");
                counter ++;
            }
        }
        System.out.println("Total Prime numbers are: " + counter);
    }
    int numberofdigits(int n){
        int i=0;
        while(n>0){
            n%=10;
            i++;
        }
        return i;
    }
    boolean armstrong(int n){
        int dig =0,dupli = n,duplicate =n;
        double r,sum=0;
        while(dupli>0){
            dupli /=10;
            dig++;
        }
        while(duplicate>0){
            r = duplicate%10;
            duplicate/=10;
            sum += Math.pow(r,dig);
        }
        return sum == n;
    }
    void armstrongprinter(){
        int i,counter =0;
        System.out.println("Armstrong numbers are: ");
        for(i=lowerLim;i<=upperLimit;i++){
            if(armstrong(i)){
                System.out.print(i + " ");
                counter ++;
            }
        }
        System.out.println("Total Armstrong numbers are: "+ counter);
    }
}
class amstrong{
    public static void main(String[] args){
     calc a = new calc();
     Scanner sc = new Scanner(System.in);
     int up , low;
     System.out.println("Enter upper limit");
     up = sc.nextInt();
     System.out.println("Enter Lower limit");
     low = sc.nextInt();
     a.set(low,up);
     a.primeprinter();
     a.armstrongprinter();
    }
}