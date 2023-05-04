package com.test.main;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 동기화처리
		// 쓰래드는 비동기처리를 수행한다.
		// 이에, 다수의 쓰래드가 같은 메서드를 호출했을 경우
		// 메서드의 코드가 비동기적으로 처리된다.
		// 만약 쓰래드에서 호출하는 메서드가 동기적으로 처리되기를 원한다면
		// 메서드를 동기화 처리하면 된다.
		// 메서드를 동기화 처리하면 메서드를 호출한 쓰래드 순서대로 메서드의
		// 코드가 수행되며 메서드의 코드가 처리되는 동안 다른 쓰래드는 대기하고 있다.
	
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		Thread3 t3 = new Thread3();
		
		t1.start();
		t2.start();
		t3.start();
	}

}

class Thread1 extends Thread {
	@Override
	public void run() {
		TestClass.testMethod("Thread1");
	}
}

class Thread2 extends Thread {
	@Override
	public void run() {
		TestClass.testMethod("Thread2");
	}
}

class Thread3 extends Thread {
	@Override
	public void run() {
		TestClass.testMethod("Thread3");
	}
}

//synchronized 키워드 메서드에 붙이기!!
class TestClass {
	public synchronized static void testMethod(String name) {
		for (int i = 0; i < 100; i++) {
			System.out.printf("%s : %d\n", name, i);
		}
	}
}