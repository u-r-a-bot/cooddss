import java.util.Scanner;
class oddeven{
    int upperLim,lowerLim;
    void set(int upperLim, int lowerLim){
        this.upperLim = upperLim;
        this.lowerLim = lowerLim;
    }
    void evenprinter(){
        System.out.println("Even numbers are");
        for(int i= lowerLim;i<=upperLim;i++){
            if(i%2==0){
                System.out.print(i + " ");
            }
        }
    }
    void oddprinter(){
        System.out.println("\nOdd numbers are");
        for(int i= lowerLim;i<=upperLim;i++){
            if(i%2!=0){
                System.out.print(i + " ");
            }
        }
    }
}
class inp{
    public static void main(String args[]){
        int up,low;
        oddeven a = new oddeven();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter upper limit");
        up = sc.nextInt();
        System.out.println("Enter lower limit");
        low = sc.nextInt();
        a.set(up,low);
        a.evenprinter();
        a.oddprinter();
    }
}