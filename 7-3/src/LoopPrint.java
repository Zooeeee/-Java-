//7-3   
//从命令行启动时附带两个参数      格式为  循环次数  循环值
public class LoopPrint {
	public static int count ;
	public static int i ;
	
	
	
	public static void main(String[] args) {

		LoopPrint.count = Integer.valueOf(args[0]);
		LoopPrint.i =  Integer.valueOf(args[1]);
		for(int a = 0 ; a < LoopPrint.count  ; a ++)
		{
			System.out.println(i);
		}
		
		
	}

}
