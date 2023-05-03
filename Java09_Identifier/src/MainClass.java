
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 식별자는 길이의 제한이 없다.
		int a1111111111111111111111111111111111111111111 = 100;
		System.out.println(a1111111111111111111111111111111111111111111);
		
		// 첫 글자는 문자, _, $로 시작해야 하며 그 이후는
		// 문자, _, $, 숫자가 가능하다.
		int abc_$100 = 200;
		System.out.println(abc_$100);
		
		// 첫 글자가 숫자이므로 오류 발생
		// int 9abc = 300;
		
		// 한글 등도 가능하다.
		int 정수형변수 = 300;
		System.out.println(정수형변수);
		
		// 파스칼 표기 기법
		int student_korean_point = 400;
		// 카멜 표기 기법
		int studentKoreanPoint = 500;
		
		System.out.println(student_korean_point);
		System.out.println(studentKoreanPoint);
	}
}






