package thread.C02_Ticketing02;

/*
* 定义一个售票器
*/
class TicketPool {
    private static int ticketNo = 10;

    synchronized int getTick() {
        int tmp = ticketNo;
        ticketNo--;
        if (tmp > 0) {
            return tmp;
        } else {
            return 0;
        }
    }
}
