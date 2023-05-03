
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 변수, 메서드 등의 사용 범위
		// 변수나 메서드를 현재 사용 가능한지에 대한 이야기이다.
		// 객체의 멤버 변수나 멤버 메서드는 객체가 생성되어야지만 사용이 가능하다.
		// 객체가 소멸되면 멤버 변수도 소멸되기 때문에 사용이 불가능하다.
		// 객체가 소멸되면 객체를 통해 메서드를 호출하지 못하므로 사용이 불가능하다.
		// 자바는 기본적으로 블럭 스코프를 가진다.
		// 블럭 스코프 : 변수 등이 선언된 블럭( { } ) 내부에서 사용이 가능하다.
		
		// 객체를 생성한다.
		// 객체를 생성하면 멤버 변수들도 생성되기 때문에 멤버 변수를 사용할 수 있다.
		TestClass1 t1 = new TestClass1();
		System.out.printf("t1.memberA : %d\n", t1.memberA);
		System.out.printf("t1.memberB : %d\n", t1.memberB);
		
		// 클래스에 정의된 메서드들은 클래스를 통해 생성한 객체를 통해 호출 할 수 있다.
		// 따라서, 객체가 생성되었다면 이를 통해 호출할 수 있다.
		t1.testMethod1();
	}
}

class TestClass1 {
	// 멤버 변수 선언
	// 멤버 변수는 객체를 생성해야 지만 메모리에 생성된다.
	int memberA = 100;
	int memberB = 200;
	
	// 멤버 메서드
	public void testMethod1() {
		System.out.println("testMethod1 호출");
		
		// 같은 객체에 있는 멤버 변수의 사용
		// 멤버 메서드는 객체를 생성하고 그 객체를 통해서 호출할 수 있기 때문에
		// 멤버 변수가 생성되어 있다는 것을 보장받을 수 있다. 이에 사용이 자유롭니다.
		System.out.printf("memberA : %d\n", memberA);
		System.out.printf("memberB : %d\n", memberB);
	}
	
	// 지역변수 예제
	// 메서드 내부에 정의한 변수들을 의미한다.
	// 변수가 정의된 블럭이 끝나면 변수는 소멸된다.
	
	// 매개변수. 매개변수는 메서드의 지역변수에 해당한다.
	// 따라서 매개변수가 정의된 메서드 내부에서만 사용이 가능하다.
	public void testMethod2(int a1, int a2) {
		// 매개변수 사용
		// 메서드가 끝나면 소멸된다.
		System.out.printf("a1 : %d\n", a1);
		System.out.printf("a2 : %d\n", a2);
		
		// 메서드 내부에서 선언한 변수
		// 같은 메서드 내부에서만 사용이 가능하다.
		// 메서드가 끝나면 소멸된다.
		int a3 = 100;
		int a4 = 200;
		System.out.printf("a3 : %d\n", a3);
		System.out.printf("a4 : %d\n", a4);
		
		// 제어문 내부
		for(int i = 0 ; i < 3 ; i++) {
			// 제어문 내부에서 선언된 변수는 제어문 내부에서만 사용이
			// 가능하고 제어문 수행이 끝나면 소멸된다.
			int a5 = 300;
			System.out.printf("for - %d\n", a3);
			System.out.printf("i : %d\n", i);
			System.out.printf("a5 : %d\b", a5);
		}
		// 제어문 내부에서 선언된 변수 사용
		System.out.printf("a5 : %d\n", a5);
		System.out.printf("i : %d\n", i);
		
		{
			int a6 = 100;
			System.out.printf("a6 : %d\n", a6);
		}
		System.out.printf("a6 : %d\n", a6);
	}
	
	public void testMethod3() {
		// testMethod2에 정의된 매개변수 사용 시도
		// 다른 메서드 이므로 사용 불가
		System.out.printf("a1 : %d\n", a1);
		System.out.printf("a2 : %d\n", a2);
		// testMethod2의 정의된 지역변수 사용 시도
		// 다른 메서드 이므로 사용 불가
		System.out.printf("a3 : %d\n", a3);
		System.out.printf("a4 : %d\n", a4);
	}
}








