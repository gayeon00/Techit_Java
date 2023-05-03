package com.test.zoo;

public class ElephantClass extends AnimalClass{
	
	public ElephantClass(String name) {
		this.type = "코끼리";
		this.name = name;
		this.numberLegs = 4;
		this.lengthNose = "길다";
		this.bodySize = "크다";
	}

	@Override
	public void howEat() {
		System.out.println("코를 이용해 먹습니다");
	}
}
