
public class Ex1116_swithCase {

	public static void main(String[] args) {

		int score = 70;
		char grade;
		
		switch(score / 10) {
			case 10 :
			case 9 :
				grade = 'A';
				break;
			case 8 :
				grade = 'B';
				break;
			case 7 :
				grade = 'C';
				break;
			case 6 :
				grade = 'D';
				break;
			default :
				grade = 'F';
		}
		
		System.out.println("당신의 점수 " + score + "점은 " + grade + "학점입니다.");
		
	}
}