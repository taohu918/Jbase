//99表格
class NinexNine{
	public static void main(String[] args){
		int line = 9 ;
		int row = 1 ;
		//行循环
		while(row <= 9){
			//列循环
			int col = 1 ;
			while(col <= row){
				System.out.print(col + "x" + row + "=" + (col * row) + "\t");
				col ++ ;
			}
			row ++ ;
			System.out.println();
		}
	}
}