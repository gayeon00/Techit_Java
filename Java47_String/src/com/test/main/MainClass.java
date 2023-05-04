package com.test.main;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String : 자바에서 문자열을 관리하기 위해 제공되는 클래스
		// " "로 묶어준 문자열도 String 객체이다.
		String str1 = new String("하염");
		String str2 = "하염하염";

		System.out.printf("str1 : %s\n", str1);
		System.out.printf("str2 : %s\n", str2);

		// 객체 == 객체의 연산은 두 객체가 같은 객체인지를 확인하는
		// 작업이다.
		if ("안녕하세요" == "안녕하세요") {
			System.out.println("안녕하세요와 안녕하세요는 같은 객체이다");
		} else {
			System.out.println("안녕하세요와 안녕하세요는 같은 객체가 아니다");
		}

		String str3 = new String("안녕하세요");
		String str4 = new String("안녕하세요");
		if (str3 == str4) {
			System.out.println("str3과 str4는 같은 객체이다.");
		} else {
			System.out.println("str3과 str4는 같은 객체가 아니다");
		}

		// == 는 두 객체가 같은 객체인지를 비교하는 것이고
		// equals 두 객체가 관리하는 값이 같은지를 비교하는 것이다.
		if ("안녕하세요".equals("안녕하세요")) {
			System.out.println("두 문자열 객체가 관리하는 문자열이 같다");
		}
		if (str3.equals(str4)) {
			System.out.println("str3과 str4가 관리하는 문자열이 같다");
		}

		// toUpperCase : 소문자를 대문자로 하는 문자열 생성
		// toLowerCase : 대문자를 소문자로 변경
		String str5 = "ABcdEF";
		String str6 = str5.toUpperCase();
		String str7 = str5.toLowerCase();
		System.out.printf("str6 : %s\n", str6);
		System.out.printf("str7 : %s\n", str7);

		// startsWith : ~로 시작하는지
		// endsWith : ~로 끝나는지
		String str8 = "abcdefg";
		boolean b1 = str8.startsWith("abc");
		boolean b2 = str8.startsWith("kkk");
		boolean b3 = str8.endsWith("efg");
		boolean b4 = str8.endsWith("kkk");
		System.out.printf("b1 : %s\n", b1);
		System.out.printf("b2 : %s\n", b2);
		System.out.printf("b3 : %s\n", b3);
		System.out.printf("b4 : %s\n", b4);

		// indexOf : 특정 문자열의 위치를 반환한다. -> 없으면 -1!
		String str9 = "abcdefg";
		int idx1 = str9.indexOf("cde");
		int idx2 = str9.indexOf("kkk");
		System.out.printf("idx1 : %d\n", idx1);
		System.out.printf("idx2 : %d\n", idx2);

		// length : 글자 수를 반환
		String str10 = "abcdefg";
		String str11 = "안녕하세요";
		int a1 = str10.length();
		int a2 = str11.length();
		System.out.printf("a1 : %d\n", a1);
		System.out.printf("a2 : %d\n", a2);
		
		//substring: 문자열의 일부를 가져온다.
		String str12 = "abcdefg";
		String str13 = str12.substring(2); //2포함~
		String str14 = str12.substring(2,5); //2포함~5미만
		System.out.printf("str13 : %s\n", str13);
        System.out.printf("str14 : %s\n", str14);
        
        //trim : 문자열의 좌우 공백을 제거한다.
        String str15 = "      aaa     ";
        System.out.printf("[%s]\n", str15);
        System.out.printf("[%s]\n", str15.trim());

	}

}
