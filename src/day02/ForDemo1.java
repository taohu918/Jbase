package day02;

class ForDemo1 {
    public static void main(String[] args) {
        //
        //for(int i = 0 ;false ; i ++){
        //	System.out.println(i);
        //}

        int i = 1;
        for (; ; ) {
            i++;
            if (i % 5 == 0) {
                continue;
                //System.out.println(i) ;
            }
            System.out.println(i);
            break;
        }

        //前n项和
        int sum = 0;
        for (i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

    }
}