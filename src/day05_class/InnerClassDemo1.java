package day05_class;

class InnerClassDemo1{
	public static void main(String[] args){
		Benz benz = new Benz();
		benz.run();
	}
}

class Benz{
	String color ;
	int tires ;

	public void run(){
		Engine e = new Engine();
		e.fire("Key0001");
		System.out.println("run....");
	}
	
	//内部类
	class Engine{
		public void fire(String key){
			System.out.println("key ready : " + key);
			System.out.println("fire..");
		}
	}
}