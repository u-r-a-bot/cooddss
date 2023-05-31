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
    tofq(tofq a,boolean ans){
        super(a.qText);
        this.ans = ans;
    }
    tofq(String qText,boolean ans){
        super(qText);
        this.ans = ans;
    }
    boolean verifyAnswer(boolean anns){
         if(anns==this.ans)
            return true;
        else 
            return false;

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
    mcq(mcq a, int realAnswer){
        super(a.qText);
        this.realAnswer = realAnswer;
    }
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
    boolean traversal(int[] a, int j){
        for (int i = 0; i < a.length; i++) {
            if(a[i]==j) 
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        quizzer quized = new quizzer();
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
        int noqcheck =1;
        int tfcount=0;
        int  mccount=0;
        int[] mcshuff = new int[m.length];
        int [] tofshuff = new int[t.length];
        int l =0;
        while(true){
            if(l<m.length){
                int temp = ran.nextInt(m.length)+1;
                //System.out.println("val of temp is: "+ temp+ " val of bool is: "+quized.traversal(mcshuff,temp));
                if(quized.traversal(mcshuff,temp)){
                    mcshuff[l] = temp;
                    l++;
                    //System.out.println("ENtered nested if");
                }
            }
            else
                break;
        }
        l=0;
        while(true){
            if(l<t.length){
                int temp = ran.nextInt(t.length)+1;
                //System.out.println("val of temp is: "+ temp+ " val of bool is: "+quized.traversal(tofshuff,temp));
                if(quized.traversal(tofshuff,temp)){
                    tofshuff[l] = temp;
                    l++;
                    //System.out.println("ENtered nested if");
                }
            }
            else
                break;
        }
        for (int index = 0; index < mcshuff.length; index++) {
            mcshuff[index]--;
        }
        for (int index = 0; index < tofshuff.length; index++) {
            tofshuff[index]--;
        }
        tofq[] tfans = new tofq[t.length];
        mcq[] mqans = new mcq[m.length];


        while(play){
            if(noqcheck>noq) break;
            int chooser = ran.nextInt(100);
            if(chooser<=50 && tfcount<t.length){
                noqcheck++;
                System.out.println("The question is of True or False type");
                System.out.println(t[tofshuff[tfcount]].getQuestion());
                System.out.println("Enter the answer 1 for true ans any other number(int) for false");
                int temp = sc.nextInt();
                boolean ans = false;
                if(temp == 1){ans = true;}
                tfans[tfcount] = new tofq(t[tofshuff[tfcount]],ans);
                tfcount++;
            }
            else if(mccount<m.length){
                noqcheck++;
                System.out.println(m[mcshuff[mccount]].getQuestion());
                System.out.println("Enter the option number");
                int anns = sc.nextInt();
                mqans[mccount] = new mcq(m[mcshuff[mccount]], anns);
                mccount++;
            }
        }
        for (int index = 0; index < m.length; index++) {
            System.out.println("Question: "+t[tofshuff[index]].qText);
            if(t[tofshuff[index]].verifyAnswer(tfans[index].ans)){
                System.out.println("Marked answer: "+(tfans[index].ans)+" is correct");
            }
            else{
                System.out.println("Wrong answer submitted");
                t[tofshuff[index]].getSolution();
            }
        }
        for (int index = 0; index < m.length; index++) {
            System.out.println("Question: "+m[mcshuff[index]].qText);
            if(m[mcshuff[index]].verifyAnswer(mqans[index].realAnswer)){
                System.out.println("Marked answer: "+(mqans[index].realAnswer)+" is correct");
            }
            else{
                System.out.println("Wrong answer submitted");
                m[mcshuff[index]].getSolution();
            }
        }

    }
}
