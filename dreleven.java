import java.util.Scanner;

class Cricketer{
    String player_name;
    int runs_hit;
    int innings_count;
    int not_out_count;
    float batting_avg;
    public Cricketer(String player_name, int runs_hit, int innings_count, int not_out_count) {
        this.player_name = player_name;
        this.runs_hit = runs_hit;
        this.innings_count = innings_count;
        this.not_out_count = not_out_count;
    }
    void  set_batting_avg(){
        batting_avg = (float)runs_hit/(float)innings_count;
    }
    float get_avg(Cricketer dr11[]){
        float sum =0 ;
        for (int i = 0; i < dr11.length; i++) {
            sum+= dr11[i].batting_avg;
        }
        return sum;
    }
    public String toString(){
        return "name: "+player_name+" Runs hit "+ runs_hit+ " Total inning played "+ innings_count + " Max runs not out: " + not_out_count + " Average batting score: "+ batting_avg;
    }
}
class dreleven{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Cricketer[] dream11 = new Cricketer[11];
    try{
        for(int i=0; i<dream11.length;i++){
            System.out.println("Enter name");
            String player_name = sc.next();
            System.out.println("Enter total runs hit by player ");
            int runs_hit = sc.nextInt();
            System.out.println("Enter the innings count");
            int innings_count = sc.nextInt();
            System.out.println("Enter the not out count");
            int not_out_count = sc.nextInt();
            dream11[i] = new Cricketer(player_name, runs_hit, innings_count, not_out_count);
        }
    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Error:  Array out of bounds");
    }
    catch(ArrayStoreException ase){
        System.out.println("Error: Information could not be stored");
    }
    try {
        System.out.println("Average values are being calculated....");
        for (int i = 0; i < dream11.length; i++) {
            dream11[i].set_batting_avg();
        }
        System.out.println("Done");
    } catch (ArithmeticException ar) {
        System.out.println("Error: Divided by zero as innings are set to zero");
    }
    Exception myException = new Exception("Team avg runs less than 20");
    try{
        System.out.println("Calculating Team avergage");
        float team_avg  = a[0].get_avg(dream11);
        if(team_avg<20.0){
            throw myException;
        }
        else{
            System.out.println("Done");
            for (int i = 0; i < dream11.length; i++) {
                System.out.println(dream11[i]);
            }
            System.out.println("TEAM batting avergae is: " + team_avg);
        }
    }catch(myException abcd ){
        System.out.println();
    }
    
}
}