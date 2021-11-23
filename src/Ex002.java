
public class Ex002 {

	public static void main(String[] args) {
		
		char ch1 = 'A'; //단일문자, 유니코드, 정수(2바이트)
		
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		char ch2 = 'a';
		System.out.println((int)ch2);
		char ch3 = '0';
		System.out.println((int)ch3);
		
		double num1;
		int num2 = 3;
		num1 = 100 / (double)num2;
		
		System.out.println(num1);
	}
}