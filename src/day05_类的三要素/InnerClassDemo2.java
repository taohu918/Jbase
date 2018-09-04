package day05_类的三要素;

class InnerClassDemo2{
	public static void main(String[] args){
		Audi b = new Audi();
		b.run();
	}
}

class Audi{
	String color ;
	int tires ;

	public void run(){
		int key = 888 ;
		//内部类
		class Engine{
			public void fire(){
				System.out.println("key ready : " + key);
				System.out.println("fire..");
			}
		}

		Engine e = new Engine();
		e.fire();
		System.out.println("run...");
	}
}