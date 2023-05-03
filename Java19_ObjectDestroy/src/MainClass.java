
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체를 생성한다.
		TestClass1 t1 = new TestClass1();
		System.out.printf("t1 : %s\n", t1);
		
		// 객체의 ID를 가지고 있는 변수를 통해 메서드를 호출한다.
		t1.testMethod1();
		
		// 자바에서의 객체 소멸 시점
		// 객체를 접근하기 위해 사용하는 객체의 ID값을 가지고 있는 
		// 변수가 하나도 없다면 소멸의 대상이 된다.
		// 메모리가 청소 작업이 수행되면 소멸의 대상이 되는 객체는 모두 메모리에서
		// 사라진다.
		// 메모리 청소 시점
		// JVM이 메모리가 부족하다고 판단되는 경우
		// OS가 메모리가 부족하다고 판단하는 경우
		// 프로그램이 종료되면(JVM이 종료되면) OS에 의해 청소 된다.
		// 개발자가 코드를 통해 명시적으로 메모리 청소 명령을 날릴 경우.
		
		// 객체를 소멸 대상으로 만드는 방법.
		// 객체를 생성할 때 객체의 ID를 변수에 담지 않는다.
		// 객체의 ID를 가지고 있는 변수에 null 값을 넣어준다.
		
		// 객체 참조 변수에 null을 넣어준다.
		t1 = null;
		// 객체의 ID를 가지고 있던 변수에 null을 덮어씌운다음 메서드를 호출한다.
		// t1.testMethod1();
		
		// 가비지 컬렉션 : 쓰래기들을 모아 버린다는 의미를 가지고 있다.
		// 프로그래밍 언어에서 더이상 사용하지 않는지만 메모리를 차지하고 있는 것들을
		// 모아 제거하는 작업을 의미한다.
		// 가비지 컬렉터 : 가비지 컬렉션을 해주는 소프트웨어
		
		// 가비지 컬렉션은 매우 부담되는 작업이기 때문에 너무 많이 발생하지 않는 것이
		// 중요하다.
		for(int i = 0 ; i < 100 ; i++) {
			System.out.println(i);
			// 가지비 컬렉터 가동
			System.gc();
			System.gc();
			System.gc();
			System.gc();
			System.gc();
		}
	}
}

class TestClass1 {
	
	public void testMethod1() {
		System.out.println("testMethod1이 호출되었습니다");
	}
}






