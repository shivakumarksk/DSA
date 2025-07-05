import java.util.Date;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //System.out.println("Running in main thread");
        MultiTh multiTh = new MultiTh();
        MultiTh multiTh1 = new MultiTh();
        multiTh.start();
        multiTh1.start();
    }

}

class MultiTh extends Thread {
    @Override
    public void run() {
        System.out.println("From custom thread");
    }
}