/*
     ==== TCP 통신방식을 이용한 예제 ====
      - 서버단 (TCP 통신에서 연결을 받아주는 쪽)   ==> ServerSocket 및 Socket 이 필요함. 
      - 클라이언트단  (TCP 통신에서 연결을 하는 쪽) ==> Socket 만 필요함.
 */

package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MyNetClient {

	public static void main(String[] args) 
			throws UnknownHostException, IOException {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("▷ 연결할 서버의 IP 주소 입력 => ");
		String serverip = sc.next();  // 192.168.50.42       엔터
		
		Socket socket = new Socket(serverip, 7777);
		
		// socket 이 올바르게 생성되면 서버와 연결이 된 것이고, 
		// 서버와 연결이 안되면 예외가 발생된다.
		System.out.println(">>> 서버 " + serverip + " 와 연결이 성공됨."); 
		
		System.out.println("\n\n");
		
		// 서버쪽에 스트림을 통해 보내어온 메시지를 읽어들이자.
		// 읽어들인 메시지를 출력하도록 한다.
		// 클라이언트 단에서도 socket 객체를 사용하여 입력스트림 객체를 생성한다.
		
		InputStream instream = socket.getInputStream();
		// socket 객체를 사용하여 1byte 기반의 기본 입력 스트림(InputStream) 객체를 생성함. 
		
		DataInputStream dinstream = new DataInputStream(instream);
		// 기본 입력 스트림(InputStream)에 필터스트림(보조스트림) 장착.
		
		String serverMsg = dinstream.readUTF();
		/*
		   dinstream.readUTF(); 은
		     데이터 입력 스트림(DataInputStream)에서 모든 byte 를 UTF-8 형식으로 모두 읽어들인후 
		     문자열로 리턴시켜준다.    
		*/
		
		System.out.println(">>> 서버로 부터 받은 메시지 : " + serverMsg);
		
		// 클라이언트에서 서버쪽으로 메시지를 보내어 본다.
		// 이렇게 하기 위해서는 데이터 출력 스트림(DataOutputStream)을 생성해서
		// 메시지를 보내면 된다.
		String msg = "네, 반갑습니다.~~ 응답함!!";
		OutputStream outstream = socket.getOutputStream();
		// 1byte 기반 기본 출력 스트림 객체 생성함.
		DataOutputStream doutstream = new DataOutputStream(outstream); 
		// 필터스트림(보조스트림) 장착.
		
		doutstream.writeUTF(msg);
		// 문자열 msg를 UTF-8 형태로 인코딩(== msg를 UTF-8 타입으로 변경)하여 
	    // 그 내용물을 데이터 출력 스트림(DataOutputStream)에 기록한다.
		
		doutstream.flush();
		// 데이터 출력 스트림(DataOutputStream)에 기록된 내용을 내보는 작업을 한다.
		// 즉, 서버 컴퓨터에 "네, 반갑습니다.~~ 응답함!!" 내용을 내본다.
		
		if(dinstream != null)  dinstream.close();
		if(instream != null)   instream.close();
		if(doutstream != null) doutstream.close();
		if(outstream != null)  outstream.close();
		if(socket != null)     socket.close();
		
		sc.close();
	}// end of main()----------------------------

}






