package com.test.main;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수형 기억장소 10개를 관리하는 배열
		int [] array1 = new int[10];
		
		// 값을 담는다.
		array1[0] = 100;
		array1[1] = 200;
		array1[2] = 300;
		
		// 사용한다.
		System.out.printf("array1[0] : %d\n", array1[0]);
		System.out.printf("array1[1] : %d\n", array1[1]);
		System.out.printf("array1[2] : %d\n", array1[2]);
		
		// 배열 생성시 관리할 값을 넣어준다.
		int [] array2 = {1, 2, 3};
		System.out.printf("array2[0] : %d\n", array2[0]);
		System.out.printf("array2[1] : %d\n", array2[1]);
		System.out.printf("array2[2] : %d\n", array2[2]);
		
		// for in 구문
		// 배열 등과 같이 순서를 가지고 데이터를 관리하는 요소에 대해
		// 반복문을 돌리고자 할 때 사용한다.
		// 매 반복 횟차때 마다 그 번째에 해당하는 값이 변수에 들어간다.
		for(int value : array2) {
			System.out.printf("value : %d\n", value);
		}
		
		// 객체의 ID를 담을 배열을 생성한다.
		TestClass1 [] array3 = new TestClass1[3];
		// 위의 배열은 객체의 ID를 담을 수 있는 참조 변수 3개를
		// 가진 배열을 생성한 것이다.
		// 이에 배열 생성 후 객체를 생성하여 담아줘야 한다.
		array3[0] = new TestClass1();
		array3[1] = new TestClass1();
		array3[2] = new TestClass1();
		
		for(TestClass1 t1 : array3) {
			System.out.printf("t1 : %s\n", t1);
		}
		
		// 객체가 관리하는 기억장소의 개수
		System.out.printf("array3 length : %d\n", array3.length);
	}
}

class TestClass1{
	int memberA;
}











