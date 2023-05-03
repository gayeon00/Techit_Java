package com.test.main;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 추상 메서드 */
        // 코드 부분이 없는 미완성 메서드
		/* 추상 클래스 */
        // 추상 메서드를 가지고 있는 클래스
		
        // 추상 클래스는 구현되지 않은 메서드를 가지고 있기때문에
        // 객체 생성이 불가능하다.
        // 따라서, 추상 클래스를 상속받은 자식 클래스를 만들어
        // 추상 메서드를 overriding하여 사용한다.
		
		/* 추상 클래스 객체 생성 */
		//추상 클래스는 완벽한 클래스가 아니기 때문에
		//직접 객체를 생성하는 것이 불가능하다.
		
		TestClass2 t2 = new TestClass2();
		t2.testMethod1();
		t2.testMethod2();
		
		TestClass1 t1 = new TestClass2();
		t1.testMethod2();
		
		TestClass1 t10 = new TestClass1() {

            @Override
            public void testMethod2() {
                // TODO Auto-generated method stub
                System.out.println("익명 중첩 클래스 사용");
            }
        };
        t10.testMethod2();
		
	}

}

/* 추상 클래스 */
// 추상 메서드를 가지고 있는 클래스
//클래스앞에 abstract를 붙여준다.
abstract class TestClass1 {
	public void testMethod1() {
		System.out.println("일반메서드");
	}
	
	/* 추상메서드 */
	// 코드를 작성하는 몸체 부분이 없는 메서드
	// 메서드 앞에 abstract 키워드를 붙여준다. 
	public abstract void testMethod2();
}

/* 추상 클래스를 상속받아 구현한 클래스 */
class TestClass2 extends TestClass1 {
	@Override
	public void testMethod2() {
		// TODO Auto-generated method stub
		System.out.println("TestClass2에서 구한현 testMethod2");
	}
}