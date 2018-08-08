class MonthDemo2{
    public static void main(String[] args){
        int m = -10 ;
		String s = "" ;
		if(m <= 0 || m >= 13){
			s = "非法月份";
		}
		else if(m <= 3){
			s = "第一季度";
		}
		else if(m <= 6){
			s = "第二季度";
		}
		else if(m <= 9){
			s = "第三季度";
		}
		else{
			s = "第四季度";
		}
		System.out.println(s);
    }
}