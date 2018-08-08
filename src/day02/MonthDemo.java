class MonthDemo{
    public static void main(String[] args){
        int m = 100 ;
	if(m >= 1 && m <= 3){
	    System.out.println(m + "是春季");
	}
	else if(m >= 4 && m <= 6){
	    System.out.println(m + "是夏季");
	}
	else if(m >= 7 && m <= 9){
	    System.out.println(m + "是秋季");
	}
	else if(m >= 10 && m <= 12){
	    System.out.println(m + "是冬季");
	}
	else{
	    System.out.println(m + "是无效的月份");
	}
    }
}