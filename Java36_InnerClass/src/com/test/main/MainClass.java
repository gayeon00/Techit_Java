package com.test.main;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 일반 중첩 클래스의 객체를 생성한다. */
		// 외부 클래스의 객체를 생성한다.
		OuterClass1 out1 = new OuterClass1();
		// 이를 통해 내부 클래스의 객체를 생성한다.
		OuterClass1.InnerClass1 in1 = out1.new InnerClass1();
		System.out.printf("in1 : %s\n", in1);

		/* static 중첩 클래스는 외부클래스의 객체 없이 바로 생성이 가능하다. */
		OuterClass2.InnerClass2 in2 = new OuterClass2.InnerClass2();
		System.out.printf("in2 : %s\n", in2);

		/* 익명중첩클래스 */
		// Super100을 상속받은 이름이 없는 크래스를 작성하고
		// 필요한 메서드를 overriding한다.
		// 그리고 자식클래스의 객체를 생성해준다.
		Super100 s100 = new Super100() {

			public void superMethod100() {
				// TODO Auto-generated method stub
				System.out.println("overriding된 메서드");
			}
		};

		// 익명중첩클래스로 오버라이딩한 메소드를 사용하는거임
		s100.superMethod100();
		

	}

}

/* 일반 중첩 클래스 */
//클래스 안에 클래스를 만든 개념
//클래스 내부의 클래스는 외부 클래스의 객체를 통해서 생성할 수 있다.

//특정 클래스에 정의된 멤버를 자주 사용하는 경우 사용
//장점: 내부 클래스에서 외부 클래스의 멤버를 사용하는 것이 자유롭다.
//단점: 내부 클래스의 객체를 생성하려면 반드시 외부 클래스의 객체를 생성해야 한다. 
class OuterClass1 {
	int outerMemberA = 100;

	public void outerMethodA() {
		System.out.println("outerMethod!");
		// 내부 클래스의 멤버를 사용 -> 에러남!
		System.out.printf("innerMemberA : %d\n", innerMemberA);
		innerMethodA();
	}

	class InnerClass1 {

		int innerMemberA = 200;

		public void innerMethodA() {
			System.out.println("innerMethod!");
		}

		public void innerMethodB() {
			// 외부 클래스에 정의된 멤버를 사용
			// 내부 클래스가 생성됐다는 건 외부 클래스가 생성이 됐다는 말임!!
			System.out.printf("outerMemberA : %d\n", outerMemberA);
			outerMethodA();
		}
	}
}

/* static 중첩 클래스 */
//장점 : 모르겠습니다..ㅠㅠ
//단점 : 내부 클래스가 외부 클래스의 멤버를 자유롭게 사용할 수 있다는 특징이
//사라져버린다. 오로지 외부 클래스에 정의된 static 변수나 메서드만 사용이 가능하다.
class OuterClass2 {

	static int outerMemberA = 200;
	int outerMemberB = 300;

	// 물론 static은 이미 만들어져있는거니까 inner의 static멤버변수 사용 가능
	public void outerMethod1() {
		System.out.println(InnerClass2.innerMemberA);
		// 얘는 static이 아니라 안됨 -> inner클래스를 static으로 만들어도 변수가 static이 아니라 안됨!
		System.out.println(InnerClass2.innerMemberB);

	}

	static class InnerClass2 {
		// 내부 클래스에 정의된 static 변수
		static int innerMemberA = 100;
		int innerMemberB = 300;

		public void innerMethod1() {
			// 물론 사용 가능
			System.out.println(outerMemberA);
			// 내부 클래스가 static이라면 외부 클래스가 생성돼있다는 것을 보장받을 수 없어 에러뜸
			System.out.println(outerMemberB);
		}
	}
}

/* 지역 중첩 클래스 */
//메서드 내부에 클래스를 작성하여 사용하는 클래스
//메서드의 수행이 끝나면 클래스가 메모리에서 사라지기 때문에
//메서드 외부에서는 클래스를 사용할 수 없다.
//장점 : 메서드에서 사용하는 클래스를 작성할 때 다른 곳에 작성하지 않고
//바로 작성해 사용할 수 있다.
//단점 : 메서드 내부에서만 사용이 가능하다.
class OuterClass3 {

	// 지역 중첩클래스 타입의 멤버변수 선언 -> 안됨! 있다는 것 조차도 모름
	InnerClass3 in30;

	public void outerMethod3() {
		// 지역 중첩 클래스 -> 클래스 파일로 만들어 지지도 않음!
		class InnerClass3 {

		}
		// 지역 중첩 클래스 객체 생성
		InnerClass3 in3 = new InnerClass3();
		System.out.println(in3);
	}

	// 다른 메서드에서 사용 -> 얘도 사용 안됨!!
	public void outerMethod30(InnerClass3 in34) {
		InnerClass3 in33;
	}
}

/* 익명 중첩 클래스 */
// 클래스의 이름이 없음
// 익명 중첩 클래스는 상속 관계의 클래스를 만드는 것
// 자식 클래스를 만듦과 동시에 객체를 생성할 때 사용
// 메서드 overriding 때문에 사용!
// 자식 클래스의 객체를 딱 하나만 만들어서 사용할 때
class Super100 {
	public void superMethod100() {
		System.out.println("superMethod100");
	}

}

class Sub100 extends OuterClass1 {
	
}