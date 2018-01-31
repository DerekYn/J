package my.day7;

import java.util.Random;

import my.Util.MyUtil;

public class RandomTest {
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		System.out.print("1부터 10까지 중 랜덤한 수 : ");
		int rndnum = rnd.nextInt(10)+1;
					// rnd.nextInt(10);
					// 0 부터 9(10 - 1)까지 10개를 출력
		System.out.print(rndnum);
		
		System.out.print("\n13부터 18까지 중 랜덤한 수 : ");
		// min 부터 max 사이의 랜덤한 정수를 얻으려면, 
		// int rndnum = rnd.nextInt(max - min + 1) + min;
		// int rndnum = rnd.nextInt(18 - 13 + 1) + 13;
		// int rndnum = rnd.nextInt(6) + 13;
		
		System.out.println(MyUtil.random(13, 18));
		char ch = (char)MyUtil.random('a', 'z');
		System.out.print("a 부터 z 까지 중 랜덤하게 발생한 소문자: " + ch);
		
	}

}
