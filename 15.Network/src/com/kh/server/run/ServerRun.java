package com.kh.server.run;

import com.kh.server.tcp.Server;

public class ServerRun {

	/*
	 * TCP(Transmission control Protocol)
	 * -서버와 클라이언트간의 1:1 소켓 통신
	 * -데이터를 교환하기에 앞서서 서버, 클라이언트가 서로 연결되어 있어야 함
	 *  (서버가 먼저 실행되어서 클라이언트의 요청을 대기하고 잇어야함)
	 *  -신뢰성 있는 데이터 전달가능
	 *  
	 *  *ServerSocket
	 *  -서버에서 클라이언트의 요청을 대기하는 클래스
	 *  -사용법 : ServerSockey==new ServerSoket(int portNumber)
	 *  -메소드
	 *  >Socket client = server.accept() 메소드를 통해 클라이언트의 연결을 기다리고, 연결이 오면 클라이트의
	 *  	Socket객체 반환
	 *  
	 *  -Socket
	 *  -클라이언트에서 서버에 요청을하거나, 서버에서 클라이언트의 요청을 받았을 때 사용하는 클래스
	 *  사용법 : Socket socket = new Socket(String IPAddress, int portNumber
	 *  
	 *  >client.getOutputStream() 데이터를 출력할 수 있는 OutputStream 객체생성
	 *  >client.getIntputStream() 데이터를 입력받을 수 있는 IntputStream 객체생성
	 */
	public static void main(String[] args) {
		
		new Server().serverStart();
		
	}
}
