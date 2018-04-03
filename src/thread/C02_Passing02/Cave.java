package thread.C02_Passing02;

class Cave extends Thread {
    private String name;

    Cave(String name) {
        super();
        this.name = name;
    }

    synchronized void pass(Car c) {
        System.out.println(c.getTname() + "正在通过 " + name);
        try {
            Thread.sleep(c.getTime());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(c.getTname() + "已通过!  耗时: " + c.getTime() + "毫秒");
    }
}
