package com.test.main;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 예외처리
		// 프로그램 수행중에 오류(예외)가 발생하거나 발생할 가능성이 있다면 JVM은
		// 오류가 JVM이나 OS에 전파되는 것을 막기위해 프로그램을 강제 종료시킨다.
		// 이때, 강제 종류가 되지 않게 하고 개발자가 준비한 오류 발생시 수행되어야
		// 하는 코드가 수행될 수 있도록 하여 오류를 대비하게 해주는 것이
		// 예외 처리
		// try : 원하는 처리의 코드
		// catch : 오류가 발생했거나 발생할 가능성이 있을때 동작하는 코드

		// 원하는 처리를 수행할 수 있는 코드 중에
		// 예외가 발생할 가능성이 있는 부분을 try로 묶어준다.
		try {
			/* 0으로 나눔 */
//			int a1 = 10 / 0;

			/* 객체아이디를 갖고있지 않는 변수를 통해 객체 접근을 시도 */
//			 TestClass1 t1 = null;
//			 t1.testMethod1();

			/* bound밖의 범위 참조 */
			int[] array1 = new int[10];
			array1[20] = 200;
			// 실행되지 않음
			System.out.println("오류 발생 시점 이후의 try 코드");
		} catch (ArithmeticException e) {
			System.out.println("수학연산 오류가 발생했습니다.");
		} catch (NullPointerException e) {
			System.out.println("객체 참조 오류가 발생했습니다.");
			// 예상하지 못할 오류가 발생했을 가능성을 위해 꼭 필요함
		} catch (Exception e) {
			System.out.println("오류가 발생했습니다.");
			System.out.println(e);
			e.printStackTrace();
		}

		System.out.println("이 부분이 실행할까요?");

		try {
			TestClass1 t100 = new TestClass1();
			t100.testMethod2(100);
			t100.testMethod2(-100);
		} catch (Exception e) {
			System.out.println("오류발생");
		}
		
		
		TestClass1 t200 = new TestClass1();
		try {
			t200.testMethod3(100);
			t200.testMethod3(0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class TestClass1 {
	public void testMethod1() {
		System.out.println("TestClass1의 testMethod1");
	}

	public void testMethod2(int a1) {
		// a1에 양수가 아닌 값이 들어오면 오류 발생시키기 - 내가만든 오류 상황
		if (a1 <= 0) {
			// 예외처리를 강제 시킬 수 없음!
			throw new ArithmeticException("양수만 넣으쇼");
		}
		System.out.println("a1은 양수입니다");
	}

	// throws : 이 메서드를 수행할 때 지정한 예외가 발생할 가능성이 있다고 알려줌
	// 이 메서드를 호출할 때 무조건 해당 예외처리 해줘야함 try catch로 감싸줘야함(강제성!)
	//RuntimeException을 상속받은 Exception은 try catch안묶어도 됨;;; -> 강제성 위해 Exception도 던지기
	public void testMethod3(int a1) throws Exception, ArithmeticException {
		// a1에 양수가 아닌 값이 들어오면 오류 발생시키기 - 내가만든 오류 상황
		if (a1 <= 0) {
			// 예외처리를 강제 시킬 수 없음! -> 메서드에 throws~~ 해주기
			throw new ArithmeticException("양수만 넣으쇼");
		}
		System.out.println("a1은 양수입니다");
	}
}