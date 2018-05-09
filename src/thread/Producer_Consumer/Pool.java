package thread.Producer_Consumer;

import java.util.LinkedList;
import java.util.List;

class Pool {
    //    private int MAX = 100;
    private List<Integer> pool = new LinkedList<Integer>();

    synchronized void add(Integer i) {
        int MAX = 100;
        try {
            while (pool.size() >= MAX) {
                wait();
            }
            pool.add(i);
            this.notify();
            Thread.sleep(300);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    synchronized Integer removeFirst() {
        try {
            while (pool.isEmpty()) {
                wait();
            }
            int i = pool.remove(0);
            this.notify();
            return i;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
