
public class Ex1116_while {

	public static void main(String[] args) {
		
		int num = 1;	//제어변수
		int sum = 0;
		
		while(num <= 10) {
			sum += num;
			System.out.println("현재 수 = " + num + ", 현재 합 = " + sum);
			num++;		//++num, num = num + 1, num += 1
		}
		
		System.out.println("총계 = " + sum + "(현재 수:" + num + ")");
		
	}
}