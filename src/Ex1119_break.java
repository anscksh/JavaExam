
public class Ex1119_break {

	public static void main(String[] args) {

		int sum = 0;
		int num;
		
		for (num=1; ; num++) {
			if (num > 5) break;
			sum += num;
			System.out.println("sum :" + sum + "\t num :" + num);
		}

	}
}