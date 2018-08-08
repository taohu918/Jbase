package day02;

/**
 * 这是我的类，演示版。
 */
class CalcDemo {

    public static void main(String[] args) {
        int a = +5;
        int b = -5;
        System.out.println("a=" + a + ",b=" + b);

        System.out.println("a=" + (+a) + ",b=" + (-b));

        // + - * /
        System.out.println(5 + 5);
        System.out.println(5 - 5);
        System.out.println(5 * 5);
        System.out.println("===" + ((float) 5 / 3 * 3));

        //取模
        System.out.println(5 % 3);        //求余

        //++ --
        int a1 = 5, a2 = 5;
        System.out.println("a1=" + (a1++));        //
        System.out.println("a2=" + (++a2));        //

        //+操作符重载。
        System.out.println("hello " + " world");//
        System.out.println("5 + 5 = " + (5 + 5));//

        //赋值= += -= *= /+ %=
        int a3 = 5;
        System.out.println("a3 += " + (a3 += 3));//

        //
        short s = 2;
        s = (short) (s + 2);
        s += 2;
        System.out.println(s);//

        //比较运算符 == <> >< !=
        boolean res = 5 <= 5;
        System.out.println(res);        //
        System.out.println(5 != 5);        //

        Object o = "hello";
        //instanceof 判断对象是否是指定的类型,后面跟的使用引用类型
        //Dog
        //System.out.println(o instanceof Class);		//

        //逻辑运算符
        //&& ||存在短路操作的。
        int c1 = 1, c2 = 3;
        if (c1 > 5 && c2 > 5) {
            System.out.println("ok");
        } else {
            System.out.println("no ok");
        }

        // & | ! ^
        if ((c1 > 5) & (c2 > 5)) {
            System.out.println("ok");
        } else {
            System.out.println("no ok");
        }

        //
        System.out.println(true && false);
        //5 0000 0101
        //6 0000 0110
        //-------------
        //  0000 0100
        System.out.println(5 & 6);
        System.out.println(5 | 6);

        boolean b0 = 3 > 4;
        //!对boolean类型值取反
        System.out.println(!b0);

        //按位取反 ~
        //0000 0000 0000 0000 0000 0000 0000 0101
        //1111 1111 1111 1111 1111 1111 1111 1010
        //0000000000000000000000000000000000 0110
        System.out.println(~5);

        //异或 ^
        // 0..0 0101 = 5
        //^0..0 1100 = 12
        //--------
        // 0..0 1001 = 9
        System.out.println(5 ^ 12);

        //移位运算
        //<<	左移动
        //>>	右移动
        System.out.println("6<<2 = " + (6 << 2));

        //+6		: 0..0 110
        //-6		: 1..1 010
        //-6 << 2	: 1..1 01000
        //-6 << 2	: 0..0 11000
        System.out.println("-6<<2 = " + (-6 << 2));
        // 110 --> 2 000001
        //>>有符号右移
        System.out.println("-6>>2 = " + (-6 >> 2));
        //>>>无符号右移 空出的为用0填充
        //-6		: 1..1 010
        //-6 >>>2	: 001..1 0
        System.out.println("-6>>>2 = " + (-6 >>> 2));
        //有符号 >>
        System.out.println("-1 >>3 = " + (-1 >> 3));
        System.out.println("-1 >>>3 = " + (-1 >>> 3));

        //三元运算符 ? : ;
        int i1 = 10;
        if (i1 < 5) {
            System.out.println("<5");
        } else {
            System.out.println(">=5");
        }
        System.out.println(i1 < 5 ? "<5" : ">=5");

        int x = 5, y = 6, z = 7;
        //三元运算符嵌套
        System.out.println(x > y ? (x > z ? x : z) : (y > z ? y : z));

        //
    }
}