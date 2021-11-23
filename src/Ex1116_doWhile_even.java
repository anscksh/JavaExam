
public class Ex1116_doWhile_even {

	public static void main(String[] args) {

		int num = 2;
		int sum = 0;
		
		while (num <= 10) {
			sum += num;
			num += 2;
		}
		
		System.out.println("1부터 10까지 중 짝수의 합은 " + sum);
		
	}
}