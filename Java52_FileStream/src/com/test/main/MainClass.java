package com.test.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// stream : 데이터를 외부와 읽고 쓸 수 있도록 제공되는
		// 자바 클래스들
		// 기본스트림
		// 데이터를 직접 읽고 쓸 수 있는 스트림들
		// InputStream과 OutputStream을 상속받고 있다.
		// 필터스트림
		// 기본 스트림들의 보조 역할을 하며 주 목적이 데이터를 가공하는 것이다.
		// saveData1();
        //saveData2();
		readData();
	}

	// 데이터 저장
	public static void saveData1() {
		try {
			// 파일을 쓰기 위한 스트림을 생성한다.
			// 이미 파일이 있다면 파일의 내용을 모두 지우고 새로 쓴다.
			// 파일이 없다면 파일을 생성해준다.
			FileOutputStream fos = new FileOutputStream("test.txt");

			// 쓰기할 데이터를 준비한다.
			String value1 = "안녕하세요";

			// 데이터를 바이트 형태로 가공한다.
			byte[] data1 = value1.getBytes();

			// 데이터를 쓴다.
			fos.write(data1);
			// 출력버퍼에 데이터가 남아 있을 수도 있기 때문에
			fos.flush();
			// 닫아준다.
			fos.close();

			System.out.println("쓰기 완료");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public static void saveData2() {
        try {
            // 파일을 쓰기 위한 스트림을 생성한다.
            // 이미 파일이 있다면 기존 내용에 이어서 작성한다.
            // 파일이 없다면 파일을 생성해준다.
            FileOutputStream fos = new FileOutputStream("test2.txt", true);
            
            // 쓰기할 데이터를 준비한다.
            String value1 = "안녕하세요";
            
            // 데이터를 바이트 형태로 가공한다.
            byte [] data1 = value1.getBytes();
            
            // 데이터를 쓴다.
            fos.write(data1);
            // 출력버퍼에 데이터가 남아 있을 수도 있기 때문에 
            fos.flush();
            // 닫아준다.
            fos.close();
            System.out.println("쓰기 완료");
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
	
	// 읽어오기
    public static void readData() {
        try {
            //FileInputStream 생성
        	FileInputStream fis = new FileInputStream("text2.txt");
        	int byteSize =fis.available();
//        	System.out.println(byteSize);
        	
        	byte[] bytes = new byte[byteSize];
        	
        	
        	fis.read(bytes);
        	fis.close();
        	
        	String str1 = new String(bytes);
        	System.out.println(str1);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
