package day02;

/**
 * demo
 */
class CommentDemo{

	/*
	 *  程序的入口点。args是参数。
	 */
	public static void main(String[] args){
		//{
		//
		int age = 23 ;
		byte bb = 12 ;
		//}
		//输出hellowrold
		System.out.println("hello world" + age);	
		
		byte b = (byte)age ;

		int age2 = bb ;

		char c = 'a' ;

		int ic = c ;

		c = 98 ;

		c = '\t' ;		//tab制表符 \r return \n

		c = '\uf000' ;	//使用unicode 0x0000 - 0xffff

		System.out.println("ic=" + ic);
		System.out.println("c=" + c);
		System.out.println('d' + 3);

		byte bbb = 12 ;
		bbb = (byte)(bbb + 3) ;
		System.out.println(bbb);
	}
}