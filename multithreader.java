import java.util.Random;

class RanInt extends Thread{
    int  randomnmber;
    Random ran = new Random();
    RanInt(){
        start();
    }
    public void run() {
        try {while(true){
            randomnmber = ran.nextInt(100);
            System.out.println("The number is: "+ randomnmber);
            RanSquare temp = new RanSquare(randomnmber);
            Thread.sleep(1000);
        }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
class RanSquare extends Thread{
    int random;
    RanSquare(int random){
        this.random = random;
        start();
        
    }
    public void run(){
        System.out.println("Square of Random number is: "+ random*random);
        RanCube temp = new RanCube(random);
    }
}
class RanCube extends Thread{
    int random;
    RanCube(int random){
        this.random = random;
        start();
    }
    public void run(){
        System.out.println("cube of the number is: " + random*random*random);
    }
}




public class multithreader {
    public static void main(String[] args) {

        try{
            RanInt a = new RanInt();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
