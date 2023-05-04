package com.test.main;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// java.lang 패키지
        // 자바에서 유일하게 import 하지 않고 사용할 수 있는 패키지이다.
        // java.lang 패키지에는 자바 프로그램을 작성할 때 많이 사용하는 것들이
        // 모여 있다.
		
		Test4 t4 = new Test4();
		Test3 t3 = t4;
		Test2 t2 = t4;
		Test1 t1 = t4;
		Object obj = t4;
	}

}

class Test1{
	
}

class Test2 extends Test1 {
	
}

class Test3 extends Test2 {
	
}

class Test4 extends Test3 {
	
}
