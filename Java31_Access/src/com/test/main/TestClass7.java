package com.test.main;

public class TestClass7 {

	//멤버변수
	public int memberA = 100;
	int memberB = 200;
	protected int memberC = 300;
	private int memberD = 400;
	
	// 멤버 메서드
    public void method1() {
        System.out.println("public method");
    }
    void method2() {
        System.out.println("default method");
    }
    protected void method3() {
        System.out.println("protected method");
    }
    private void method4() {
        System.out.println("private method");
    }
}
