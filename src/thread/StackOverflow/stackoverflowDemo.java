package thread.StackOverflow;

public class stackoverflowDemo {
    public static void main(String[] args) {
        sayHello(1);
    }

    static void sayHello(int i) {
        System.out.println(i);
        i++;
        sayHello(i);
    }
}
