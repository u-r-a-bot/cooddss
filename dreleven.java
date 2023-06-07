import java.util.Scanner;

class myexception extends Exception{


    @Override
    public String getMessage() {
        return " Error:- Team avg less than 20 ";
    }
}


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
        if(innings_count==0)
            throw new ArithmeticException();
        batting_avg = (float)runs_hit/(float)innings_count;
    }
    float get_avg(Cricketer[] dr11){
        float sum =0 ;
        for (int i = 0; i < dr11.length; i++) {
            sum+= dr11[i].batting_avg;
        }
        return sum/dr11.length;
    }
    void sortPrinter(Cricketer[] dr11){
        for (int i = 0; i < dr11.length ; i++) {
            for(int j=1;j<dr11.length-i;j++){
                if(dr11[j-1].batting_avg>dr11[j].batting_avg){
                    Cricketer temp = dr11[j];
                    dr11[j] = dr11[j-1];
                    dr11[j-1] = temp;
                }
            }
        }
        for (int i = 0; i < dr11.length; i++) {
            System.out.println(dr11[i]);
        }
    }
    public String toString(){
        return "name: "+player_name+" Runs hit "+ runs_hit+ " Total inning played "+ innings_count + " Max runs not out: " + not_out_count + " Average batting score: "+ batting_avg;
    }
}
class dreleven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float team_avg =0;
        System.out.println("Enter the number of players");
        int noc = sc.nextInt();
        Cricketer[] dream11 = new Cricketer[noc];
        try{
            for(int i=0; i<dream11.length;i++){
                System.out.println("Enter name of player "+ (i+1));
                String player_name = sc.next();
                System.out.println("Enter total runs hit by player ");
                int runs_hit = sc.nextInt();
                System.out.println("Enter the innings count ");
                int innings_count = sc.nextInt();
                System.out.println("Enter the not out count ");
                int not_out_count = sc.nextInt();
                dream11[i] = new Cricketer(player_name, runs_hit, innings_count, not_out_count);
            }
            System.out.println("Average values are being calculated....");
            for (int i = 0; i < dream11.length; i++) {
                dream11[i].set_batting_avg();
            }
            System.out.println("Done");
            team_avg = dream11[0].get_avg(dream11);
            if(team_avg<20.0){
                throw new myexception();
            }
            else{

                dream11[0].sortPrinter(dream11);
                System.out.println("TEAM batting avergae is: " + team_avg);
            }

        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error:  Array out of bounds");

        }
        catch(ArrayStoreException ase){
            System.out.println("Error: Information could not be stored");
        }
        catch (ArithmeticException ar) {
            System.out.println("Error: Divided by zero as innings are set to zero");
        }
        catch(Exception e ){
            System.out.println(e.getMessage());
        }
    }
}