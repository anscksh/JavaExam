
public class Ex1116_doWhile_odd {

	public static void main(String[] args) {

		int num = 1;
		int sum = 0;
		
		while(num <= 10) {
			sum += num;
			System.out.println("현재 수 = " + num + ", 현재 합 = " + sum);
			num += 2;
		}
		
		System.out.println("1부터 10까지 중 홀수의 합은 " + sum);

	}
}
