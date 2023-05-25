import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
class Bank{
    double roi = 0.02;
    double getroi(){
        return roi;
    }
}
class SBI_BANK extends Bank{
    void setroi(double roi){
        this.roi = roi;
    }

    long daysDiff(Date dToday, Date passDate){
        long date1 = dToday.getTime();
        long date2 = passDate.getTime();
        long timeDiff= Math.abs(date1-date2);
        long daysdiff = TimeUnit.DAYS.convert(timeDiff,TimeUnit.MILLISECONDS);
        //System.out.println("Days diff is: "+ daysdiff);
        return daysdiff;
}
    double getroi(){
        return roi;
    }
    void calc(double amt,Date dToday, Date passDate){
        long daysdiff = daysDiff(dToday, passDate);
        double compInt =0;
        double dayer = daysdiff;
        dayer/=365;
        bankroi(daysdiff);
        System.out.println("roi is: "+(1+getroi())+" days diff is: "+ daysdiff);
        double vari = 1+(getroi());
        System.out.println("Vari is "+vari);
        //(double)daysdiff=(double)daysdiff/365;
        System.out.println("vari is: "+vari + " Days diff is: "+daysdiff);
        System.out.println("TEst comp interest is: "+(Math.pow(vari,dayer)));
        // compInt = amt*(Math.pow((1+(getroi()/365)),daysdiff*365));
        // System.out.println(compInt+" roi is: "+ getroi());
        // compInt = amt + compInt;
        // System.out.println("Interest on "+ amt +" is: "+compInt);
    }
    void bankroi(long daysDiff){
        if(daysDiff>=7&&daysDiff<=14){
            setroi(0.03);
            System.out.println("trying to set");
        }
        else if(daysDiff>=15&&daysDiff<=30){
            setroi(0.03);
            System.out.println("trying to set");
        }
        else if(daysDiff>=31&&daysDiff<=45){
            setroi(0.03);
            System.out.println("trying to set");
        }
        else if(daysDiff>=46&&daysDiff<=90){
            setroi(0.0405);
            System.out.println("trying to set");
        }
        else if(daysDiff>=91&&daysDiff<=120){
            setroi(0.0410);
            System.out.println("trying to set");
        }
        else if(daysDiff>=121&&daysDiff<=180){
            setroi(0.0410);
            System.out.println("trying to set");
        }

    }
}
class AXIS_BANK extends Bank{
    void setroi(double roi){
        this.roi = roi;
    }
    long daysDiff(Date dToday, Date passDate){
        long date1 = dToday.getTime();
        long date2 = passDate.getTime();
        long timeDiff= Math.abs(date1-date2);
        long daysDiff = TimeUnit.DAYS.convert(timeDiff,TimeUnit.MILLISECONDS);
        return daysDiff;
}
    double getRoi(){
        return roi;
    }
    void calc(int daysDiff,float amt){
        
    }
    void bankroi(int daysDiff){
        if(daysDiff>=7&&daysDiff<=14){
            setroi(0.0310);
        }
        else if(daysDiff>=15&&daysDiff<=30){
            setroi(0.0320);
        }
        else if(daysDiff>=31&&daysDiff<=45){
            setroi(0.0350);
        }
        else if(daysDiff>=46&&daysDiff<=90){
            setroi(0.0450);
        }
        else if(daysDiff>=91&&daysDiff<=120){
            setroi(0.0470);
        }
        else if(daysDiff>=121&&daysDiff<=180){
            setroi(0.0490);
        }

    }
}
class ICICI_BANK extends Bank{
    void setroi(double roi){
        this.roi = roi;
    }
    long daysDiff(Date dToday, Date passDate){
        long date1 = dToday.getTime();
        long date2 = passDate.getTime();
        long timeDiff= Math.abs(date1-date2);
        long daysDiff = TimeUnit.DAYS.convert(timeDiff,TimeUnit.MILLISECONDS);
        return daysDiff;
}
    double getroi(){
        return roi;
    }
    void calc(int daysDiff,float amt){
        
    }
    void bankroi(int daysDiff){
        if(daysDiff>=7&&daysDiff<=14){
            setroi(0.0315);
        }
        else if(daysDiff>=15&&daysDiff<=30){
            setroi(0.0315);
        }
        else if(daysDiff>=31&&daysDiff<=45){
            setroi(0.0345);
        }
        else if(daysDiff>=46&&daysDiff<=90){
            setroi(0.0405);
        }
        else if(daysDiff>=91&&daysDiff<=120){
            setroi(0.0470);
        }
        else if(daysDiff>=121&&daysDiff<=180){
            setroi(0.0500);
        }

    }
}
class banking{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Choice for Bank:\n1.SBI\n2.AXIS Bank\n3.ICICI Bank");
        int bankChoice =sc.nextInt();
        Date a = new Date(LocalDate.now().getYear()-1900,LocalDate.now().getMonthValue()-1, LocalDate.now().getDayOfMonth());
        switch(bankChoice){
            case 1:
                SBI_BANK sbi = new SBI_BANK();
                System.out.println("Enter the amount you want to deposit");
                double amt = sc.nextFloat();
                System.out.println("Enter the date you want to withdraw in DD-MM-YYYY");
                String  dateSbi = sc.next();
                String[] values = dateSbi.split("-");
                int day = Integer.parseInt(values[0]);
                int month = Integer.parseInt(values[1]);
                int year = Integer.parseInt(values[2]);
                Date temp = new Date(year-1900, month-1, day);
                System.out.println(temp);
                System.out.println(LocalDate.now().getMonthValue());
                sbi.calc(amt,a, temp);
        }
    }
}
