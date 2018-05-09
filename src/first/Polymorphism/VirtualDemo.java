package first.Polymorphism;

public class VirtualDemo {
    public static void main(String[] args) {
        VirtualSalary s = new VirtualSalary("员工 A", "北京", 3, 3600.00);
        VirtualEmployee e = new VirtualSalary("员工 B", "上海", 2, 2400.00);

        System.out.println("使用 Salary 的引用调用 mailCheck -- ");
        s.mailCheck();
        System.out.println("\n使用 Employee 的引用调用 mailCheck--");
        e.mailCheck();
    }
}
