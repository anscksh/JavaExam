
public class Ex1116_while {

	public static void main(String[] args) {
		
		int num = 1;	//�����
		int sum = 0;
		
		while(num <= 10) {
			sum += num;
			System.out.println("���� �� = " + num + ", ���� �� = " + sum);
			num++;		//++num, num = num + 1, num += 1
		}
		
		System.out.println("�Ѱ� = " + sum + "(���� ��:" + num + ")");
		
	}
}