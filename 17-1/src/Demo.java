enum SEASONS{
	SPRING,SUMMER,FALL,WINTER
}


public class Demo {
	
	public void print(SEASONS season) {
		switch (season) {
		case SPRING:
			System.out.println("������"+season);
			break;
		case SUMMER:
			System.out.println("������"+season);
			break;
		case FALL:
			System.out.println("������"+season);
			break;
		case WINTER:
			System.out.println("������"+season);
			break;
		default:
			break;
		}
		
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Demo demo = new Demo();
		demo.print(SEASONS.SPRING);
		demo.print(SEASONS.SUMMER);
		demo.print(SEASONS.FALL);
		demo.print(SEASONS.WINTER);
		
	}
}
