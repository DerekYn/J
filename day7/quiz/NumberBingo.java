package my.day7.quiz;

import java.util.Scanner;

import my.Util.MyUtil;

public class NumberBingo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int pc = MyUtil.random(1, 100);
		System.out.println(pc);
		int user = 0, cnt = 1;
		
		do {
			try {
				System.out.print("1부터 100 사이의 정수를 입력하세요 => ");
				user = Integer.parseInt(sc.nextLine());
			if(user>100) {
				System.out.println("※100보다 작은 값은 입력해주세요.");
				cnt++;
				continue;
			}
			if(pc==user) {
				System.out.println(">> B.I.N.G.O!! " + cnt + "번만에 맞추었습니다.");
				break;
			}
			else if(pc<user) {
				System.out.println(">> " + user + "보다 작습니다.");
			}
			else {
				System.out.println(">> " + user + "보다 큽니다.");
			}
			cnt++;
		} catch (NumberFormatException e) {
			System.out.print("1부터 100 사이의 정수를 입력하세요 => ");
		}
		} while (true);
		sc.close();
	}

}

/*
	컴퓨터가 1 ~ 100 사이의 랜덤한 숫자를 가진다.
	예> 59
	
	1부터 100 사이의 정수를 입력하세요 => 80
	>> 80보다 작습니다.
	1부터 100 사이의 정수를 입력하세요 => 70
	>> 70보다 작습니다.
	1부터 100 사이의 정수를 입력하세요 => 60
	>> 60보다 작습니다.
	1부터 100 사이의 정수를 입력하세요 => 40
	>> 40보다 작습니다.
	1부터 100 사이의 정수를 입력하세요 => 20
	>> 20보다 작습니다.
	1부터 100 사이의 정수를 입력하세요 => 10
	>> B.I.N.G.O!! 6번만에 맞추었습니다.
*/