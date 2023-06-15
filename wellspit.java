class wellprinter extends Thread{
    cdeprinter cdprint = new cdeprinter();
    public void run(){
        try {
            while(true){
            System.out.println("Welcome to SPIT!!???");
            notify();
            cdprint.start();
            this.wait();
            System.out.println("After wait");
            Thread.sleep(200);
        
        
            }
        }catch (InterruptedException e) {
            System.out.println(e);
        }
        
    }
}
class cdeprinter extends Thread{
    public void run(){
        
        try {
            while(true){
            System.out.println("COmputer Engineering Department");
            notify();
            this.wait();
        }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
class wellspit {
    public static void main(String[] args) {
        wellprinter printnow = new wellprinter();
        try{
            printnow.start();
        
    }catch(Exception e){
        System.out.println(e);
    }

    }
}