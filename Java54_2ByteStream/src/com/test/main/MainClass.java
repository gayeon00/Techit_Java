package com.test.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2 byte stream
		// 자바는 글자 하나를 2 byte를 사용하기 때문에
		// 문자열 입출력 전용으로 사용하는 스트림들을 2byte stream으로 부른다.
		// 라인 단위 입출력이 가능하고 문자열 인코딩 설정이 가능하다.
//		saveData();
//		loadData();
		keyboardInput();
	}

	public static void saveData() {
		try {
			// 기본 스트림 생성
			FileOutputStream fos = new FileOutputStream("test4.txt");
			// OutputStreamWriter
			// 문자열 인코딩을 설정하는 필터 스트림
			OutputStreamWriter writer = new OutputStreamWriter(fos, "UTF-8");
			// 출력 버퍼를 사용하는 필터 스트림 - 출력 버퍼에다가 쌓아두기
			BufferedWriter bw = new BufferedWriter(writer);
			// println, print, printf를 사용할 수 있는 필터스트림
			// 여기서 위로 역방향으로 처리됨
			PrintWriter pw = new PrintWriter(bw);
			
			pw.print("안녕하쇼");
			pw.println("반갑소");
			pw.printf("이름은 %s, 나이는 %d살\n", "홍길동",30);
			
			pw.flush();
			pw.close();
			bw.close();
			writer.close();
			fos.close();
			
			System.out.println("쓰기 완료");
			

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();

		}
	}
	
	public static void printData() {
		try {
			OutputStreamWriter writer = new OutputStreamWriter(System.out, "UTF-8");
			BufferedWriter bw = new BufferedWriter(writer);
			PrintWriter pw = new PrintWriter(bw);
			
			pw.print("안녕");
			pw.println("반갑소");
			pw.printf("이름은 %s이고 나이는 %d입니다.");
			
			pw.flush();
			pw.close();
			bw.close();
			writer.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void loadData() {
        try {
        	FileInputStream fis = new FileInputStream("test4.txt");
            // 인코딩 설정
            InputStreamReader irs = new InputStreamReader(fis, "UTF-8");
            // 입력 버퍼 사용
            BufferedReader br = new BufferedReader(irs);
            
            // 읽어온다.
            String str1 = null;
            StringBuffer buffer = new StringBuffer();
            
            do {
                // 한 줄을 읽어온다.
                str1 = br.readLine();
                if(str1 != null) {
                    buffer.append(str1);
                }
            } while(str1 != null);
            
            br.close();
            irs.close();
            fis.close();
            
            String esult = buffer.toString();
            System.out.println(esult);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
	
	public static void keyboardInput() {
		try {
			InputStreamReader isr = new InputStreamReader(System.in, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			System.out.print("입력 1 : ");
			String str1 = br.readLine();
			System.out.print("입력 2 : ");
			String str2 = br.readLine();
			
			br.close();
			isr.close();
			
			System.out.println(str1);
			System.out.println(str2);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}


