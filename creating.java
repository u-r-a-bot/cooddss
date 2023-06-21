import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
class creating{
    public static void main(String[] args) {
        File a = new File("Bs.txt");
        try {
            a.createNewFile();
            System.out.println("Created file Bs");
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            FileWriter b = new FileWriter("Bs.txt");
            String str = "The text to be written\nShould be written\nHasbeen Written\nCant be Written.\nYou wont be able to \n";
            
            Integer bi = 23;
            b.write(str);
            b.write(bi+"");
            b.close();
            System.out.println("Written sucessfukk");
        } catch (Exception e) {
            System.out.println(e);
        }
        String Storer[] = new String[10];
        int i=0;
          try {
            Scanner fileScan = new Scanner(a);
            while(fileScan.hasNextLine()){
                Storer[i] = fileScan.nextLine();
                i++;
            }
            fileScan.close();
          } catch (Exception e) {
                System.out.println(e);
          }
          for (int j = 0; j <i; j++) {
            //System.out.println("Val of i is: " + i+ " Val of j is :"+ j);
            System.out.println(Storer[j]);
          }
    }
}