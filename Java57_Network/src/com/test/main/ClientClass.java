package com.test.main;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//서버에 접속
			//이때, IP주소와 port번호 설정해야함
			//127.0.0.1 : 자기 자신 컴퓨터를 가르키는 IP
			//서버랑 클라를 같은 컴에서 개발할 때 사용하는
			//테스트용 IP주소
			Socket socket = new Socket("127.0.0.1", 30000);
			System.out.println(socket);
		
			//서버에서 데이터를 받는다
			InputStream is = socket.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			
			int data1 = dis.readInt();
			double data2 = dis.readDouble();
			boolean data3 = dis.readBoolean();
			String data4 = dis.readUTF();
			
			System.out.println(data1);
			System.out.println(data2);
			System.out.println(data3);
			System.out.println(data4);
			
			//서버로 데이터를 보낸다.
			OutputStream os = socket.getOutputStream();
			//필터스트림을 통해 OutputStream에 데이터 쓰기
			DataOutputStream dos = new DataOutputStream(os);
			
			dos.writeInt(200);
			dos.writeDouble(22.22);
			dos.writeBoolean(false);
			dos.writeUTF("클라가 보낸 문자열");
			
			socket.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
