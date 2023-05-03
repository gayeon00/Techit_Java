
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제1
		// 다음 변수에 저장되어 있는 값이 짝수면 "짝수"를
		// 홀수면 "홀수"를 결과하는 3항 연산 식을 작성하세요.
		int a1 = 123;
		
		String r1 = a1 % 2 == 0 ? "짝수" : "홀수";
		System.out.printf("a1 은 %s입니다\n", r1);
		
		
		// 문제2
		// 다음 변수에 저장되어 있는 값을 십의 자리 이하를 버리는
		// 코드를 작성하여 출력한다.
		// 예) 421 -> 400
		int a2 = 421;
		
		// a2를 100으로 나눈 몫을 구한다음 100을 곱한다.
		int r2 = a2 / 100 * 100;
		System.out.printf("r2 : %d\n", r2);
		
		// a2를 100으로 나눈 나머지를 구한다음 빼준다.
		int r3 = a2 - (a2 % 100);
		System.out.printf("r3 : %d\n", r3);
		
		
		// 문제3
		// 다음 변수에 저장되어 있는 값을 각 자리별로 뜯어내어 출력한다.
		// 예) 123
		// 1
		// 2
		// 3
		int a3 = 123;
		
		int r4 = a3 / 100;
		a3 = a3 % 100;
		
		int r5 = a3 / 10;
		
		int r6 = a3 % 10;
		
		System.out.printf("%d, %d, %d\n", r4, r5, r6);
		
		
		// 문제4)
		// 주어진 화씨 온도를 섭씨 온도로 계산한다.
		// 섭씨온도 = 5 / 9 x (회씨온도 - 32)
		int a4 = 100;
		
		double a100 = (double)a4;
		
		double r7 = 5.0 / 9.0 * (a100 - 32.0);
		System.out.printf("섭씨온도 : %f\n", r7);
		
		
		// 문제5)
		// 다음에 주어진 대문자 알파벳을 소문자로 바꿔서 출력한다.
		// 대문자 A는 65이고, 소문자 a는 정수로 97이다.
		char a5 = 'C';
		
		// 소문자 a를 대문자 A로 빼준다.
		char r8 = 'a' - 'A';
		char r9 = (char) (a5 + r8);
		System.out.printf("r9 : %c\n", r9);
	}
}






