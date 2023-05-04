package com.test.main;

import java.util.ArrayList;
import java.util.HashMap;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Collection
		// 객체들을 모아 관리요소들
		// List : 순서를 통해 관리한다.
		// Map : 이름을 통해 관리한다.
		// Set : 집합(중복된 객체를 담을 수 없고, 순서와 이름에 대한 개념이 없다)

		// List
		// 객체를 담는거라 자료형 상관없이 섞어 담을 수 있음
		// 암튼 다 객체니까!
		// but!!! 타입이 같은것만 넣는게 일반적임!!
		ArrayList list1 = new ArrayList<>();
		list1.add("문자열1");
		list1.add("문자열2");
		list1.add("문자열3");
		list1.add(100);
		list1.add(11.11);

		// 관리하는 객체의 개수
		System.out.printf("객체 개수 : %d\n", list1.size());

		for (Object obj : list1) {
			System.out.println(obj);
		}

		// 가급적이면 Wrapper클래스 쓰자
		// 객체를 추출하여 변수에 담아준다.
		String str1 = (String) list1.get(0);
		Integer int1 = (Integer) list1.get(3);
		Double double1 = (Double) list1.get(4);
		System.out.println(str1);
		System.out.println(int1);
		System.out.println(double1);

		// Generic type
		// Collection 들은 Generic type을 설정할 수 있음
		// Generic type은 Collection이 관리할 객체의 타입을 지정하는 것으로써
		// 객체를 추출할 때, 형변환을 자동으로 해준다.

		ArrayList<String> list2 = new ArrayList<String>();
		// 이제 string만 담을 수 있음
		list2.add("문자열1");
		list2.add("문자열2");
		list2.add("문자열3");
		list2.add("문자열4");
		list2.add("문자열5");

		String str10 = list2.get(0);
		String str11 = list2.get(1);
		String str12 = list2.get(2);
		System.out.printf("%s, %s, %s\n", str10, str11, str12);
		
		for (String str13 : list2) {
			System.out.println(str13);
		}
		
		//HashMap
		//<이름,객체>
		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("key1", "문자열1");
		map1.put("key2", "문자열2");
		map1.put("key3", "문자열3");
		
		String str100 = map1.get("key1");
		String str200 = map1.get("key2");
		String str300 = map1.get("key3");
		System.out.println(str100);
		System.out.println(str200);
		System.out.println(str300);
		
		//리스트에서 객체 제거
		System.out.println(list1);
		//순서 지정 삭제
		list1.remove(1);
		System.out.println(list1);
		//객체 지정 삭제
		list1.remove("문자열3");
		System.out.println(list1);
		
		//삽입
		list1.add(1, "추가된 문자열");
		System.out.println(list1);
		
		//모두 삭제
		list1.clear();
		System.out.println(list1);
		
		//Hashmap에서 객체 제거
		System.out.println(map1);
		
		map1.remove("key1");
		System.out.println(map1);
		
		//모두 제거
		map1.clear();
		System.out.println(map1);

	}

}
