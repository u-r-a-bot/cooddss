import java.util.*;
class Rand extends Thread{
    int randomNumber;
    Random ran = new Random();
    public int getRandomNumber() {
        return randomNumber;
    }
    public void run(){
            while(true){try {
                this.randomNumber = ran.nextInt(1000);
                Thread.sleep(1000);
            } catch (Exception e) {
                throw new Exception();
            }
                
            }
    }
    
}
class randSquarer extends Thread{
    int randomNumber;
    public void setRandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }
    
    public void run() {
        System.out.println("Square of the number is: " + randomNumber*randomNumber);
    }
}
class randCuber extends Thread{
    int randomNumber;

    public void setRandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }
    public void run(){
        System.out.println("The cube of the number is: "+ randomNumber*randomNumber*randomNumber);
    }
}
class randinthre{
    public static void main(String[] args) {
           Rand obj = new Rand();
           randSquarer obj1 = new randSquarer();
           randCuber obj2 = new randCuber();
           int randomNumber =0;
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter number of random numbers you want to generate");
           int numberofRandom = sc.nextInt();
           try {
            
           
           for (int i = 0; i < numberofRandom ; i++) {
                obj.start();
                
                randomNumber = obj.getRandomNumber();
                obj1.setRandomNumber(randomNumber);
                obj1.start();
                obj2.setRandomNumber(randomNumber);
                obj2.start();
           }
        }
           catch (Exception e) {
            e.printStackTrace();
           }
    }
}