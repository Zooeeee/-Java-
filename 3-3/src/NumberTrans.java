//编写javc程序，将所有整形数值全部转化为int型，并将转换后的值输出
public class NumberTrans {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		byte a = 127;
		short b = 32767;
		int c = 2147483647;
		long d = 9223372036854775807L;
		System.out.println("定义byte型数据类型为"+a);
		System.out.println("定义型short数据类型为"+b);
		System.out.println("定义型int数据类型为"+c);
		System.out.println("定义型long数据类型为"+d);
		//以下三行皆是从低精度转化为高精度 
		System.out.println("将a显示转换为int型为"+(int)(a));
		System.out.println("将b显示转换为int型为"+(int)(b));
		System.out.println("将c显示转换为int型为"+(int)(c));
		
		//下一行是从高精度转化为低精度 故会数据溢出 造成信息错误
		System.out.println("将d显示转换为int型为"+(int)(d));
	
	
	
	}

}
