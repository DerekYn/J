package my.day7;

import java.util.Scanner;

import my.Util.MyUtil;

public class RockScissorPaper {
	
	public static void gameResult(String userNo, int pcNo) {
		
		String userStr = "", pcStr = "";
		
		if(userNo.equals("1"))
			userStr = "가위";
		else if(userNo.equals("2"))
			userStr = "바위";
		else
			userStr = "보";
		if(userNo.equals("1"))
			userStr = "가위";
		else if(userNo.equals("2"))
			userStr = "바위";
		else if(userNo.equals("3"))
			userStr = "보";
		
		if(pcNo==1)
			pcStr = "가위";
		else if(pcNo==2)
			pcStr = "바위";
		else if(pcNo==3)
			pcStr = "보";
		
		String gameResult = "";

		if(  (userNo.equals("1") && pcNo==3) || 
			 (userNo.equals("2") && pcNo==1) || 
			 (userNo.equals("3") && pcNo==2) )
			  gameResult = "사용자가 이겼습니다.";
		else if( (userNo.equals("1") && pcNo==3) || 
				 (userNo.equals("2") && pcNo==1) || 
				 (userNo.equals("3") && pcNo==2) )
				  gameResult = "Pc가 이겼습니다.";
		else
			gameResult = ">> 비겼습니다.";
		
		System.out.println(">> 사용자 : " + userStr + ", 컴퓨터 : " + pcStr);
		System.out.println(">> " + gameResult);
		
	}// end of gameResult(String userNo, int pcNo)----------------------

	public static void menu() {
		System.out.println("=== *** RockScissorPaper GAME!! *** ===");
		System.out.println("\n1.가위	2.바위	3.보	   9.게임종료");
		System.out.println("\n=======================================");
		System.out.print(">> 선택하세요(1,2,3,9) => ");
		
	}// end of menu()---------------------------------------------------
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		RockScissorPaper obj = new RockScissorPaper();
		
		String userNo = "";
		
		do {
			RockScissorPaper.menu();
			
			userNo = sc.nextLine();
			
			int pcNo = MyUtil.random(1, 3);
			
			switch( userNo ) {
			case "1":
			case "2":
			case "3":
				obj.gameResult(userNo, pcNo);
				break;
			case "9":
				System.out.println(">> 게임을 종료합니다.");
				break;
			default :
				System.out.println(">> 메뉴에 없는 번호 입니다. 다시 선택하세요");
				break;
			}// end of switch---------------------------------------
			
			/*if("9".equals(userNo))
				break;
			else
				continue;*/
			
		} while (!("9".equals(userNo))); // end of do ~ while()----------------------
		
		System.out.println(">> 종료시각 : " + MyUtil.getNowTime());
		
		sc.close();
	}// end of main() ----------------------------------------------


}// end of RockScissorPaper-----------------------------------------
