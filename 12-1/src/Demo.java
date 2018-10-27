//12-1
class  MyException extends Exception{
	public MyException(String ErrorMessage) {
		super(ErrorMessage);
	}
}

class Student{
	public void speak(int m ) throws MyException {
		if(m > 1000) {
			throw new MyException("ÉùÒôÌ«´óÁË");
		}
	}
}

public class Demo {
	public static void main(String[] args) {
	try {
		new Student().speak(1001);
		} 
	catch (MyException e) {
		System.out.println(e);
		}
	}

}
