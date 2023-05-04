package com.test.main;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 편한거 쓰면 됨! */
		
		// 기본 자료형 값을 문자열로 변환
		// Wrapper 객체의 toString 메서드를 이용해 변환할 수 있다.
		Integer int1 = 100;
		String str1 = int1.toString();
		System.out.println(str1);

		Double double1 = 11.11;
		String str2 = double1.toString();
		System.out.println(str2);

		// Wrapper 클래스의 static 메서드 사용 - static: 객체 안만들고 클래스.메서드로 바로 사용 가능
		String str3 = Integer.toString(100);
		String str4 = Double.toString(11.11);
		System.out.println(str3);
		System.out.println(str4);
		
		// + 연산자 사용
        // 문자열과 문자열 아닌 것을 + 연산을 하면 문자열이 아닌 것이
        // 문자열로 변환되고 두 문자열을 합친 새로운 문자열을 만들어준다.
        String str5 = 100 + "";
        String str6 = 11.11 + "";
        System.out.println(str5);
        System.out.println(str6);
        
        //문자열 값을 기본 자료형 값으로 변환
        //Wrapper 클래스의 static method활용
        String str7 = "100";
        String str8 = "11.11";
        
        int a100 = Integer.parseInt(str7);
        double d100 = Double.parseDouble(str8);
        System.out.println(a100);
        System.out.println(d100);

	}

}
