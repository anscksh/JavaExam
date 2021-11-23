
public class Ex1116_for_triangle {

	public static void main(String[] args) {

		int a;
		int b;
		
		/*
		//정방향
		for (a=0; a<5; a++) {
			for (b=0; b<a+1; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//역방향 1안
		for (a=0; a<5; a++) {
			for (b=0; b<5-a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		*/
		
		//역방향 2안
		for (a=0; a<5; a++) {
			for (b=5; b>a; b--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}