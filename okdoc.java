import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

 class Person{
     String name;
     Date date;
 }
 class Doctor extends Person{
     String Speciality;
     Date date;
     float fees,income;
     void setDoc(String Speciality,float fees,String name,Date date){
         this.Speciality = Speciality;
         this.fees = fees;
         this.name = name;
         this.date = date;
     }
     public String toString(){
        return "Name: "+name+" Fees: "+fees+" Date of joining: "+date +" Speciality "+ Speciality;
     }

    //  Doctor(Doctor temp){
    //      this.Speciality = temp.Speciality;
    //      this.fees = temp.fees;
    //      this.income = temp.income;
    //  }

 }
 class Patient extends Person{
     Doctor doc;
     void setPatient(Doctor doc,String name,Date date) {
         this.doc = doc;
         this.name = name;
         this.date = date;
     }
     boolean equals(Doctor a){
        if(doc == a){
            return true;
        }
        else{
            return false;
        }
     }

 }
 class Billing {
    Patient pat[];
    Doctor doc[];
    float total[];
    float sumTotal = 0;
    int jDoc=0;
    LocalDate today = LocalDate.now();
    int year = today.getYear();
    int month = today.getMonthValue();
    int day = today.getDayOfMonth();
    Date dToday = new Date(year-1900, month, day);
     Billing(Patient pat[],Doctor doc[]){
        this.pat = pat;
        this.doc=doc;
        total = new float[pat.length];
    }
    long daysDiff(Date dToday, Date passDate){
        long date1 = dToday.getTime();
        long date2 = passDate.getTime();
        long timeDiff= Math.abs(date1-date2);
        long daysDiff = TimeUnit.DAYS.convert(timeDiff,TimeUnit.MILLISECONDS);
        return daysDiff;
    }
    void biller(){
        for (int i = 0; i < pat.length; i++) {
            for (int j = 0; j < doc.length; j++) {
                if(pat[i].equals(doc[j])){
                    jDoc = j;
                break;
                }
            }
            long daydifference =daysDiff(dToday, pat[i].date);
            System.out.println("Record "+(i+1)+" Patient: "+ pat[i].name+" "+doc[i].Speciality+": "+doc[jDoc].name+" fee: "+doc[jDoc].fees*daydifference);
            total[i] = (doc[jDoc].fees+2000)*daydifference;
        }
        for (int i = 0; i < total.length; i++) {
            sumTotal += total[i];
        }
        System.out.println("Total payable amount is: "+sumTotal);
    }
    
 }


class okdoc{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat  dmy = new SimpleDateFormat("dd/MM/yyyy");
        Doctor doc[] = new Doctor[2];
        Patient pat[] = new Patient[2];
        for (int i = 0; i < doc.length; i++) {
            System.out.println("Enter name of the Doctor: "+(i+1));
            String name = sc.next();
            System.out.println("Enter the Speciality of the Doctor: "+(i+1));
            String speciality = sc.next();
            System.out.println("Enter the fees of the doctor");
            float fees = sc.nextFloat();
            System.out.println("Enter the date of joining of the Doctor in form DD-MM-YYYY");
            String date = sc.next();
            String[] values = date.split("-");
            int day = Integer.parseInt(values[0]);
            int month = Integer.parseInt(values[1]);
            int year = Integer.parseInt(values[2]);
            Date temp = new Date(year-1900, month, day);
            doc[i] = new Doctor();
            doc[i].setDoc(speciality, fees, name, temp);
        }
        for (int index = 0; index < pat.length; index++) {
            System.out.println("Enter the name of the Patient ");
            String name = sc.next();
            System.out.println("Enter the date of Admission of Patient in DD-MM-YYYY");
            String date = sc.next();
            String[] values = date.split("-");
            int day = Integer.parseInt(values[0]);
            int month = Integer.parseInt(values[1]);
            int year = Integer.parseInt(values[2]);
            Date temp = new Date(year-1900, month, day);
            System.out.println("Enter which doctor diagnosed you:-");
            for (int i = 0; i < doc.length; i++) {
                System.out.println((i+1)+". "+doc[i].name);
            }
            int choiceDoc = sc.nextInt();
            pat[index] = new Patient();
            pat[index].setPatient(doc[choiceDoc-1], name, temp);
        }
        Billing first = new Billing(pat, doc);
        first.biller();
    }
}