package com.test.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Object Stream
		// 객체를 입출력하기ㅇ 위해 사용하는 스트림
		// 자바 프로그램 간에만 가능하다.

		// 객체 직렬화
		// 객체의 효율적인 관리를 위해 객체의 구성요소를
		// 메모리상에 나눠서 관리하는데 이를 한데 모아바이트 배열 형태로
		// 변환해주는 것
		loadObject();
	}
	
	public static void saveObject() {
		try {
			//기본 스트림
			FileOutputStream fos = new FileOutputStream("test100.dat");
			//객체 출력 스트림
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			// 저장할 객체
            TestClass t1 = new TestClass(100, 200);
            TestClass t2 = new TestClass(300, 300);
            
            // 객체를 쓴다.
            oos.writeObject(t1);
            oos.writeObject(t2);
			
			oos.flush();
			oos.close();
			fos.close();
			
			System.out.println("객체 쓰기 완료");
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void loadObject() {
		try {
			//기본 스트림 생성
			FileInputStream fis = new FileInputStream("test100.dat");
			//객체 읽기 스트림
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			// 객체를 복원한다.
			//object type에서 testclass 타입으로 형변환
			TestClass t10 = (TestClass) ois.readObject();
			TestClass t20 = (TestClass) ois.readObject();
			
			ois.close();
			fis.close();
			
			t10.printData();
			t20.printData();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}

// 객체 직렬화를 위해 Serializable 인터페이스를 구현
class TestClass implements Serializable {
	int memberA;
	int memberB;

	public TestClass(int a, int b) {
		memberA = a;
		memberB = b;
	}

	public void printData() {
		System.out.printf("memberA : %d\n", memberA);
		System.out.printf("memberB : %d\n", memberB);
	}
}
