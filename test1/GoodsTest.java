package nsc.test1;

import java.util.Scanner;

public class GoodsTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("다음 항목의 값을 입력하시오.");
		System.out.print("상품명 : ");
		String n = sc.nextLine();
		System.out.print("가격 : ");
		int p = Integer.parseInt(sc.nextLine());
		System.out.print("수량 : ");
		int q = Integer.parseInt(sc.nextLine());
		
		Goods gs = new Goods(n, p, q);
		
		System.out.println(gs.toString());
		
		System.out.println("총 구매 가격 : " + gs.getPrice() * gs.getQuantity() + "원");
	}	

}
