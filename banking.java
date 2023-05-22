import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
class Bank{
    float roi = 0.02;
    float getroi(){
        return roi;
    }
}
class SBI_BANK extends Bank{
    void setRoi(float roi){
        this.roi = roi;
    }

    long daysDiff(Date dToday, Date passDate){
        long date1 = dToday.getTime();
        long date2 = passDate.getTime();
        long timeDiff= Math.abs(date1-date2);
        long daysDiff = TimeUnit.DAYS.convert(timeDiff,TimeUnit.MILLISECONDS);
        return daysDiff;
}
    float getRoi(){
        return roi;
    }
    void calc(int daysDiff,float amt){
        
    }
    void bankroi(int daysDiff){
        if(daysDiff>=7&&daysDiff<=14){
            setRoi(0.03);
        }
        else if(daysDiff>=15&&daysDiff<=30){
            setroi(0.03);
        }
        else if(daysDiff>=31&&daysDiff<=45){
            setroi(0.03);
        }
        else if(daysDiff>=46&&daysDiff<=90){
            setroi(0.0405);
        }
        else if(daysDiff>=91&&daysDiff<=120){
            setroi(0.0410);
        }
        else if(daysDiff>=121&&daysDiff<=180){
            setroi(0.0410);
        }

    }
}
class AXIS_BANK extends Bank{
    void setRoi(float roi){
        this.roi = roi;
    }
    long daysDiff(Date dToday, Date passDate){
        long date1 = dToday.getTime();
        long date2 = passDate.getTime();
        long timeDiff= Math.abs(date1-date2);
        long daysDiff = TimeUnit.DAYS.convert(timeDiff,TimeUnit.MILLISECONDS);
        return daysDiff;
}
    float getRoi(){
        return roi;
    }
    void calc(int daysDiff,float amt){
        
    }
    void bankroi(int daysDiff){
        if(daysDiff>=7&&daysDiff<=14){
            setRoi(0.0310);
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
    void setRoi(float roi){
        this.roi = roi;
    }
    long daysDiff(Date dToday, Date passDate){
        long date1 = dToday.getTime();
        long date2 = passDate.getTime();
        long timeDiff= Math.abs(date1-date2);
        long daysDiff = TimeUnit.DAYS.convert(timeDiff,TimeUnit.MILLISECONDS);
        return daysDiff;
}
    float getRoi(){
        return roi;
    }
    void calc(int daysDiff,float amt){
        
    }
    void bankroi(int daysDiff){
        if(daysDiff>=7&&daysDiff<=14){
            setRoi(0.0315);
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
        switch(bankChoice){
            case 1:
                SBI_BANK sbi = new SBI_BANK();
                System.out.println("Enter the amount you want to deposit");
                float amt = sc.nextFloat();
                System.out.println("ENter the date you deposited in DD-MM-YYYY");
                String  dateSbi = sc.next();
        }
    }
}
