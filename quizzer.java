import java.util.Random;
import java.util.Scanner;

abstract class Questions{
    String qText;
    Questions(String qText){
        this.qText = qText;
    }
    abstract String getQuestion();
    abstract void getSolution();
}
class tofq extends Questions{
    boolean ans;
    String qTag = "True or False type";
    tofq(String qText,boolean ans){
        super(qText);
        this.ans = ans;
    }
    String verifyAnswer(boolean anns){
         if(anns==this.ans)
            return "Correct";
        else 
            return "Wrong";

    }
    String getQuestion(){
        return qText;
    }
    void getSolution(){
        System.out.println("The solution of the question is: "+ans);
    }
    
}
class mcq extends Questions{
    String qTag = "Multiple choice question With three options";
    int realAnswer;
    mcq(String qText,int ans){
        super(qText);
        this.realAnswer = ans;

    }
    boolean verifyAnswer(int ansed){
        return ansed==this.realAnswer;
    }
    String getQuestion(){
        return qText;
    }
    void getSolution(){
        System.out.println("The answer for the question is: "+ realAnswer);
    }
}

class quizzer{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of true or false type questions");
        int tf = sc.nextInt();
        System.out.println("Enter the number of MCQ questions");
        int mc = sc.nextInt();
        tofq[] t = new tofq[tf];
        mcq[] m = new mcq[mc];
        System.out.println("Enter the true or false type question ");
        for (int i = 0; i < t.length; i++) {
            System.out.println("Enter the question text");
            String a = sc.nextLine();
            String qtext = sc.nextLine();
            System.out.println("Enter the answer 1 for true ans any other number(int) for false");
            int temp = sc.nextInt();
            boolean ans = false;
            if(temp == 1){ans = true;}
            t[i] = new tofq(qtext, ans);
        }
        System.out.println("Enter the MCQ type Questions");
        for(int i =0; i<m.length;i++){
            System.out.println("Enter the question text");
            String a = sc.nextLine();
            String qtext = sc.nextLine();
            System.out.println("Enter the answer ");
            int ans = sc.nextInt();
            m[i] = new mcq(qtext, ans);
        }
        System.out.println("Player's turn");
        Random ran = new Random();
        boolean play = true;
        int noq = tf +mc;
        int noqcheck =0;
        int tfcount=0, mccount=0;
        while(play){
            noqcheck++;
            if(noqcheck>noq) break;
            int chooser = ran.nextInt(100);
            if(chooser<=50){
                System.out.println("The question is of True or False type");
                t[tfcount].getQuestion();
                System.out.println("Enter the answer 1 for true ans any other number(int) for false");
                int temp = sc.nextInt();
                boolean ans = false;
                if(temp == 1){ans = true;}
                System.out.println("The ans is:"+t[tfcount].verifyAnswer(ans));
                tfcount++;
            }
            else{
                m[mccount].getQuestion();
                System.out.println("Enter the option number");
                int annns = sc.nextInt();
                System.out.println("The ans is:"+m[mccount].verifyAnswer(annns));
                mccount ++;
            }
        }
    }
}
