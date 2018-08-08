package day02;
/**
 * WhileDemo1
 */
class WhileDemo1{
	public static void main(String[] args){
		int i = 0 ;
		//while循环
		while(i>1){
			System.out.println(i);
			i ++ ;
			if(i >= 10){
				break;
			}
		}
		
		//do while循环
		System.out.println("------------------");
		i = 0 ;
		do{
			System.out.println(i);
			i ++ ;
			if(i >= 10){
				break;
			}
		}while(i>1);

		//直角三角形
		//*
		//**
		//***
		//****
		//*****
		//******
	}
}