package my.day9;

import java.util.Scanner;

import my.Util.MyUtil;

public class HouseTrade {
	
	BDSApp real;
	
	public void homeTrade() {
		
		int flag = 0;
		
		for(; true;) {
			real.menu();
			
			try {
				Scanner sc = new Scanner(System.in);
				int menuNum = Integer.parseInt(sc.nextLine());
				int memulSuperNum = 0;
				
				if(menuNum == 1) {
					for(int i=0; i<real.list().length; i++) {
						if("매매".equals(real.list()[i].how)) {
							System.out.println("houseno" + real.list()[i].listNum + "  " + MyUtil.getNowTime() + 
									real.list()[i].address +"  " + real.list()[i].price);	
						}
					}
					System.out.print(" >> 조회하고자하는 매물번호를 선택하세요 => ");	
					memulSuperNum = Integer.parseInt(sc.nextLine());
					for(; true;) {
						for(int i=0; i<real.list().length; i++) {
							if((1 <= memulSuperNum && memulSuperNum <=5) &&
								(real.list()[i].how.equals("매매") && real.list()[i].listNum == memulSuperNum)) {
								real.list()[memulSuperNum-1].showInfo();
								flag = 1;
								break;
							}
						}
						if(flag == 0) {
							System.out.print(">> 올바른 값을 입력해주세요. => ");
							memulSuperNum = Integer.parseInt(sc.nextLine());
							continue;
						}
					flag = 0;	
					break;
					}
				}
				
				else if(menuNum == 2) {
					for(int i=0; i<real.list().length; i++) {
						if("전세".equals(real.list()[i].how)) {
							System.out.println("houseno" + real.list()[i].listNum + "  " + MyUtil.getNowTime() + 
									real.list()[i].address +"  " + real.list()[i].price);
						}
					}
					System.out.print(" >> 조회하고자하는 매물번호를 선택하세요 => ");	
					memulSuperNum = Integer.parseInt(sc.nextLine());
					for(; true;) {
						for(int i=0; i<real.list().length; i++) {
							if((1 <= memulSuperNum && memulSuperNum <=5) &&
								(real.list()[i].how.equals("전세") && real.list()[i].listNum == memulSuperNum)) {
								real.list()[memulSuperNum-1].showInfo();
								flag = 1;
								break;
							}
						}
						if(flag == 0) {
							System.out.print(">> 올바른 값을 입력해주세요. => ");
							memulSuperNum = Integer.parseInt(sc.nextLine());
							continue;
						}
					flag = 0;	
					break;
					}
				}
				else if(menuNum == 3) {
					for(int i=0; i<real.list().length; i++) {
						if("월세".equals(real.list()[i].how)) {
							System.out.println("houseno" + real.list()[i].listNum + "  " + MyUtil.getNowTime() + 
									real.list()[i].address +"  " + real.list()[i].price);
						}
					}
					System.out.print(" >> 조회하고자하는 매물번호를 선택하세요 => ");	
					memulSuperNum = Integer.parseInt(sc.nextLine());
					for(; true;) {
						for(int i=0; i<real.list().length; i++) {
							if((1 <= memulSuperNum && memulSuperNum <=5) &&
								(real.list()[i].how.equals("월세") && real.list()[i].listNum == memulSuperNum)) {
								real.list()[memulSuperNum-1].showInfo();
								flag = 1;
								break;
							}
						}
						if(flag == 0) {
							System.out.print(">> 올바른 값을 입력해주세요. => ");
							memulSuperNum = Integer.parseInt(sc.nextLine());
							continue;
						}
					flag = 0;	
					break;
					}
				}
				else if(menuNum == 4){
					System.out.println("안녕히 가세요.");
					sc.close();
					System.out.println("프로그램 종료 시간");
					System.out.println(MyUtil.getNowTime());
					return;		
				}
				else {
					System.out.println("올바른 번호를 입력하세요.");
					continue;
				}
							
				
			} catch (NumberFormatException e) {
				System.out.println("올바른 번호를 선택해 주세요");
				continue;
			}
		}
		
	}
	
	
}
	