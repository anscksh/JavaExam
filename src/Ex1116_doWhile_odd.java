
public class Ex1116_doWhile_odd {

	public static void main(String[] args) {

		int num = 1;
		int sum = 0;
		
		while(num <= 10) {
			sum += num;
			System.out.println("���� �� = " + num + ", ���� �� = " + sum);
			num += 2;
		}
		
		System.out.println("1���� 10���� �� Ȧ���� ���� " + sum);

	}
}
