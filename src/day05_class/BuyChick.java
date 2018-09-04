package day05_class;

/**
 * 百钱买百鸡
 * 公鸡 : 5/只
 * 母鸡 : 3/只
 * 小鸡 : 1/3只
 * 100 买100只鸡?
 */
class BuyChick{
	public static void main(String[] args){
		//公鸡
		for(int i = 0 ; i < 100 / 5 ; i ++){
			for(int j = 0 ; j < 100 / 3 ; j ++){
				for(int k = 0 ; k < 100 ; k = k + 3){
					int money = i * 5 + j * 3 + (k / 3) ;
					int count = i + j + k ;
					if(money == 100 && count == 100){
						System.out.println("公鸡:" + i + " ,母鸡:" + j + " ,小鸡:" + k);
					}
				}
			}
		}
	}
}