package day05;

class ClassDemo{
	public static void main(String[] args){
		//new 必须跟构造函数
		Car01 c1 = new Car01();
		c1.run();
		Car01 c2 = new Car01("white");
		c2.run();
		//c1.Car01();

		System.out.println(Benz01.getBrand());
	}
}
class Car01{
	String color = "black" ;
	int tires ;
	public Car01(){
		System.out.println("new Car01()");
	}

	public Car01(String color){
		this();//必须作为第一行
		this.color = color ;
		System.out.println("kkk");
	}
	
	/*
	public Car01 Car01(String color){
		this.color = color ;
		Car01 c = new Car01();
		return c;
	}
	*/
	void run(){
		System.out.println(color + " , run....");
	}
}

//public -- private
class Benz01 extends Car01{
	private static String BRAND = "Benz01" ;

	public static String getBrand(){
		return BRAND ;
	}
}
