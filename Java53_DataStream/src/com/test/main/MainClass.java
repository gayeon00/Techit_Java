package com.test.main;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DataStream
		//기본 자료형 값을 byte배열 형태로 변환해주는 역할을 하는
		//필터 스트림이다.
		//saveData();
		readData();
		
	}
	
	public static void saveData() {
		try {
			//기본 스트림 생성
			FileOutputStream fos = new FileOutputStream("test3.txt");
			//필터 스트림
			//DataStream 생성
			DataOutputStream dos = new DataOutputStream(fos);
			
			//쓴다
			dos.writeInt(100);
			dos.writeDouble(11.11);
			dos.writeBoolean(true);
			dos.writeUTF("안녕하세요");
			
			dos.flush();
			dos.close();
			fos.close();
			
			System.out.println("쓰기 완료");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void readData() {
		try {
			FileInputStream fis = new FileInputStream("test3.txt");
			DataInputStream dis = new DataInputStream(fis);
			
			int a1 = dis.readInt();
			double a2 = dis.readDouble();
			boolean a3 = dis.readBoolean();
			String a4 = dis.readUTF();
			
			dis.close();
			fis.close();
			
			System.out.println(a1);
			System.out.println(a2);
			System.out.println(a3);
			System.out.println(a4);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
			
		}
	}

}
