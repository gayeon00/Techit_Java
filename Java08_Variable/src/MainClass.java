
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 논리형 변수 선언
		// 변수는 선언과 동시에 기억장소가 만들어진다.
		boolean a1;
		// 변수는 사용하기 전에 값을 저장해야 한다.
		// = : 대입 연산자. 오른쪽에 있는 값을 왼쪽의 변수에 저장한다.
		a1 = true;
		// 변수의 사용
		// 변수의 이름만 작성해 주면 기억장소의 값을 가져다 사용할 수 있다.
		System.out.printf("a1 : %s\n", a1);
		
		// 변수의 선언과 동시에 값을 저장한다.
		boolean a2 = false;
		System.out.printf("a2 : %s\n", a2);
		
		// 문자 타입(2byte 정수, 0 ~ 65535)
		char char1 = 65;
		char char2 = 'A';
		
		System.out.printf("char1 : %c\n", char1);
		System.out.printf("char2 : %c\n", char2);
		
		// 정수 타입
		// 1byte
		byte byte1 = 127;
		// 2byte
		short short1 = 32767;
		// 4byte
		int int1 = 2147483647;
		// 8byte
		long long1 = 922337203684775807L;
		
		System.out.printf("byte : %d\n", byte1);
		System.out.printf("short : %d\n", short1);
		System.out.printf("int : %d\n", int1);
		System.out.printf("long : %d\n", long1);
		
		// 실수 타입
		// 4byte
		float float1 = 11.11f;
		// 8byte
		double double1 = 22.22;
		
		System.out.printf("float : %f\n", float1);
		System.out.printf("double : %f\n", double1);
		
		// 문자열
		String str1 = "안녕하세요";
		System.out.printf("String : %s\n", str1);
	}
}





