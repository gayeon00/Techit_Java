package com.test.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ServerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 기능 1
		// - 사용자 접속 대기를 한다
		// - 사용자 접속에 성공하면 닉네임을 입력받는다.
		// - 입력받은 닉네임과 생성된 소켓을 객체에 담고 해당 객체를 arraylist에 담는다.
		// - 다시 사용자 접속 대기를 한다.

		// 기능 2
		// - 사용자로부터 메세지를 수신대기한다.
		// - 메시지를 전달받음
		// - arraylist에 있는 모든 사용자에게 메시지 전달
		new ChattingServer();

	}

}

//채팅 서버
class ChattingServer {

	private ServerSocket server;
	final int SERVER_PORT = 40000;
	private ArrayList<UserClass> userList;

	public ChattingServer() {
		try {
			// 서버 가동
			server = new ServerSocket(SERVER_PORT);
			// 사용자 접속 처리 쓰레드 가동
			AccessUserClass accessUserClass = new AccessUserClass();
			accessUserClass.start();
			userList = new ArrayList<UserClass>();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	// 브로드캐스팅 메서드 -> 여러 클라이언트(여러 스레드)가 갖다쓸거니까 sync 붙여줘야!!
	public synchronized void broadCastingMethod(String userNickName, String msg) {
		try {
			String sendMsg = userNickName + " : " + msg;

			// Arraylist의 객체만큼 반복
			for (UserClass user : userList) {
				// 현재 번째의 사용자의 닉넴 가져옴
				String targetUserNickName = user.getUserNickName();

				// 메세지를 보낸 사람과 같으면 보내지 않음
				if (userNickName == targetUserNickName)
					continue;

				// 메시지 보냄
				user.sendMessage(sendMsg);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	// 사용자 접속 처리
	// 채팅 서버의 접근에 자유롭게 하기 위해!!! and 각각 별개의 스레드로 운영을 해야해서!!
	class AccessUserClass extends Thread {
		public void run() {
			try {
				while (true) {
					System.out.println("사용자 접속 대기");
					Socket socket = server.accept();
//					System.out.println(socket);

					// 사용자가 접속하면 사용자 정보 객체를 생성하고 스레드를 가동
					UserClass userClass = new UserClass(socket);
					userClass.start();

					// 사용자 객체를 arraylist에 담는다.
					userList.add(userClass);
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	// 사용자 관련 클래스
	class UserClass extends Thread {
		private String userNickName;

		public String getUserNickName() {
			return userNickName;
		}

		private Socket socket;
		private InputStream is;
		private OutputStream os;
		private DataInputStream dis;
		private DataOutputStream dos;

		public UserClass(Socket socket) {
			try {
				this.socket = socket;
				is = socket.getInputStream();
				os = socket.getOutputStream();
				dis = new DataInputStream(is);
				dos = new DataOutputStream(os);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public void run() {
			try {
				// 닉네임 입력 받는다.
				userNickName = dis.readUTF();
				System.out.printf("%s 접속\n", userNickName);
				// 클라이언트에게 환영 메세지를 보낸다.
				dos.writeUTF(userNickName + "님 환영합니다.");
				// 다른 클라이언트들에게는 조인 메세지 보냄
				broadCastingMethod("서버", userNickName + "님이 접속했습니다.");
				// 사용자가 보내는 메세지를 수신대기
				while (true) {
					// 사용자가 보내는 메시지를 받는다.
					String msg = dis.readUTF();
					// 다른 사용자들에게 보낸다.
					broadCastingMethod(userNickName, msg);
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

		public void sendMessage(String msg) {
			try {

				// 클라이언트에게 보내기
				dos.writeUTF(msg);

			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}
