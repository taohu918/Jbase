package thread.C05_KnowDeamon;

import java.util.Date;

public class Waitress extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println(new Date());
                Thread.sleep(1000);
//                return;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
