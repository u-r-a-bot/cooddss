class Welc extends Thread {
    Cde obj;

    Welc(Cde obj) {
        this.obj = obj;
    }

    @Override
    public void run() {
        try {
            while (true) {
                synchronized (obj) {
                    obj.notify();
                    obj.wait();
                }
                System.out.println("Welcome to SPIT");
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class Cde extends Thread {
    @Override
    public void run() {
        try {
            while (true) {
                synchronized (this) {
                    this.notify();
                    this.wait();
                }
                System.out.println("Computer Engineering Department");
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class twotread {
    public static void main(String[] args) {
        Cde b = new Cde();
        Welc a = new Welc(b);
        a.start();
        b.start();
    }
}
