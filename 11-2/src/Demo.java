//11-2
//eclipse中会报错  找不到或无法加载主类 Demo$Inner
//命令行中会出现两个.class文件  一个是Demo  一个是Demo$InnerClass
//java Demo 会报错找不到主类
//java Demo$InnerClass 能正常运行
public class Demo {
	static class InnerClass{
		public static void main(String args[]){
			System.out.println("内部类方法");
		}
	}
}
