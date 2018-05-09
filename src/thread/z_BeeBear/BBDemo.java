package thread.z_BeeBear;

public class BBDemo {
    public static void main(String[] args) {
        Basket basket = new Basket("BigNet", 20);
        Bee bee1 = new Bee("bee1", 300, basket);
        Bee bee2 = new Bee("bee2", 200, basket);
        Bear bear1 = new Bear("bear1", basket);

        bee1.start();
        bee2.start();
        bear1.start();
    }
}
