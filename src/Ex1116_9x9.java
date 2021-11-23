
public class Ex1116_9x9 {

	public static void main(String[] args) {

		int dan;
		int times;
		
		for (dan=1; dan<=9; dan++) {
			for (times=1; times<=9; times++) {
				System.out.print(times + "X" + dan + "=" + (dan*times) + "\t");
			}
			System.out.println();
		}
		
	}
}