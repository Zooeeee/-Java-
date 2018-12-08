enum SEASONS{
	SPRING,SUMMER,FALL,WINTER
}


public class Demo {
	
	public void print(SEASONS season) {
		switch (season) {
		case SPRING:
			System.out.println("季节有"+season);
			break;
		case SUMMER:
			System.out.println("季节有"+season);
			break;
		case FALL:
			System.out.println("季节有"+season);
			break;
		case WINTER:
			System.out.println("季节有"+season);
			break;
		default:
			break;
		}
		
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Demo demo = new Demo();
		demo.print(SEASONS.SPRING);
		demo.print(SEASONS.SUMMER);
		demo.print(SEASONS.FALL);
		demo.print(SEASONS.WINTER);
		
	}
}
