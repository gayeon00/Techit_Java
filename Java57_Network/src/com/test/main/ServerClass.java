package com.test.main;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//ServerSocket 객체 생성
			//프로그램이 사용할 포트 번호를 지정한다.
			ServerSocket server = new ServerSocket(30000);
			System.out.println("서버 가동");
			
			//사용자 접속을 대기한다.
			//사용자가 접속할 때까지 대기하며 접속에 성공하면
			//접속한 클라와 1:1로 연결된 socket이 생성된다.
			Socket socket = server.accept();
			System.out.println(socket);
			
			//데이터를 보낸다.
			OutputStream os = socket.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			
			dos.writeInt(100);
			dos.writeDouble(11.11);
			dos.writeBoolean(true);
			dos.writeUTF("서버가 보낸 문자열");

			//클라이언트가 보낸 데이터 받기
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
			
			//클라이언트와의 연결을 해제한다.
			socket.close();
			
			//서버 종료
			server.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
