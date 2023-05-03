package com.test.zoo;

public class KangarooClass extends AnimalClass{
	
	public KangarooClass(String name) {
		this.type = "캥거루";
		this.name = name;
		this.numberLegs = 2;
		this.lengthNose = "짧다";
		this.bodySize = "크다";
	}
	
	@Override
	public void howEat() {
		System.out.println("나뭇잎을 뜯어 먹습니다");
	}
}
