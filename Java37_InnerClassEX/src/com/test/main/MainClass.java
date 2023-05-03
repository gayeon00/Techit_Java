package com.test.main;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal elephant = new Animal() {
			public void howEat() {
				System.out.println("코를 이용해 먹음");
			}
		};
		elephant.type = "코끼리";
		elephant.name = "강아지";
		elephant.cnt_legs = 4;
		
		Animal dog = new Animal() {
			public void howEat() {
				System.out.println("사료를 먹음");
			}
		};
		dog.type = "강아지";
		dog.name = "냥이";
		dog.cnt_legs = 4;
		
		System.out.println(elephant.type);
		System.out.println(elephant.name);
		System.out.println(elephant.cnt_legs);
		elephant.howEat();
		
		System.out.println(dog.type);
		System.out.println(dog.name);
		System.out.println(dog.cnt_legs);
		dog.howEat();
	}

}

class Animal {
	String type;
	String name;
	int cnt_legs;
	
	public void howEat() {
		
	}
}