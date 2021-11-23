
public class Ex1116_doWhile {

	public static void main(String[] args) {

		int num = 1;
		int sum = 0;
		
		do {
			sum += num;
			num++;
		} while (num <= 10);
		
		System.out.println(num + " " + sum);

	}
}