package com.test.main;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 동기 : 작업을 순차적으로처리
		// 비동기 : 여러 작업을 동시에 처리
		// 동기적인 작업 다수를 비동기적으로 처리함
		// Thread : 자바에서 비동기 처리를 지원하기위해 제공하는 !클래스!

		// 오류가 발생할 가능성이높은 작업의 경우 별도의 스레드로 운영하면
		// 안정적으로 운영할 수 있다. 메인 프로그램이 종료될 우려가 없음!!

		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		Thread3 t3 = new Thread3();

		// 쓰래드 우선순위 확인
		int p1 = t1.getPriority();
		int p2 = t2.getPriority();
		int p3 = t3.getPriority();
		System.out.printf("p1 : %d\n", p1);
		System.out.printf("p2 : %d\n", p2);
		System.out.printf("p3 : %d\n", p3);
		
		//쓰래드 우선순위.
		// 여러 쓰래드를 가동 시켰을 때 우선적으로 처리될 쓰래드를 지정할 수 있다
		 // 우선순위 설정 숫자가 !높을 수록 많이 가동될 가능성이 높아짐!
        t1.setPriority(10);
        t2.setPriority(1);
        t3.setPriority(1);
		
		// 쓰래드 가동
        t1.start();
        t2.start();
        t3.start();
	}

}

//Thread를 상속받은 클래스
class TestClass1 extends Thread {
	// 쓰래드를 발생시켜 처리할 메서드
	public void run() {

		for (int i = 0; i < 100; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}

			System.out.println("TestClass1");
			if (i > 10)
				i /= 10;
		}

	}

}

//runnable 인터페이스를 구한한 클래스
class TestClass2 implements Runnable {
	@Override
	public void run() {
		try {
			for (int i = 0; i < 100; i++) {
				Thread.sleep(300);
				System.out.println("TestClass2");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


class Thread1 extends Thread {
	@Override
	public void run() {
		System.out.println("Thread1");
	}
}

class Thread2 extends Thread {
	@Override
	public void run() {
		System.out.println("Thread2");
	}
}

class Thread3 extends Thread {
	@Override
	public void run() {
		System.out.println("Thread3");
	}
}
