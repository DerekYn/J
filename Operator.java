package my.day4;

public class Operator {

	public static void main(String[] args) {
		System.out.println("------ 1. 산술 연산자 : + - * / << >> >>> ------");
		/*
		 	+ - * / %
		 	x << n	x*(2의 n승)의 결과값과 같다. x는 오직 정수만 가능하다.
		 	x >> n	x/(2의 n승)의 결과값과 같다. x는 오직 정수만 가능하다. 
		 	x >>> n 정수 x를 32bit 형태의 2진수로 나타낸후 오른쪽으로 n번 이동시키고 빈자리를 0으로 채운다.
		 */
		
		int n = 10;
		System.out.println("n+3 = " + (n+3));
		System.out.println("n-3 = " + (n-3));
		System.out.println("n*3 = " + (n*3));
		System.out.println("n/3 = " + (n/3));
		System.out.println("n%3 = " + (n%3));
		System.out.println("n<<3 = " + (n<<3));
		System.out.println("n>>3 = " + (n>>3));
		System.out.println("n>>>3 = " + (n>>>3));
		
		System.out.println("------ 2. 부호 연산자 : + - ------");
		byte a = 5;
		short b = -9;
		System.out.println(-b);
		System.out.println(+a);
		
		System.out.println("------ 3. 증감 연산자 : ++ -- ------");
		int c = 7;
		long d = 3L;
		c++;	// c = c+1와 같은뜻
		d--;	// d = d-1와 같은뜻
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		
		++c;	// c = c+1와 같은뜻
		--d;	// d = d-1와 같은뜻
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		
		// 후위 증감 연산자(c++, d--)는 다른 연산을 다 마친이후에 1을 증감한다.
		// 전위 증감 연산자(++c, --d)는 다른 연산을 하기 이전에 1을 증감한다.
		
		System.out.println("c = " + c++);
		System.out.println("c = " + ++c);
		
		System.out.println("c = " + c--);
		System.out.println("c = " + --c);
		
		System.out.println("------ Quiz ------");
		int x = 10;
		int y = 10;
		
		int z = ++x;
		System.out.println("z : " + z);
		System.out.println("x : " + x);
		
		z = y++;
		System.out.println("z : " + z);
		System.out.println("y : " + y);
		
		x = 20;
		z = x++;
		System.out.println("z : " + z);
		System.out.println("x : " + x);
		
		System.out.println("------ 4. bit별 not  연산자 : ~ ------");
		//주어진 정수값을 32bit(2진수)로 바꾸어 0 -> 1로, 1 -> 0으로 바꾸어주는 것
		
		int m = 42;		// int가 4byte 이므로 32bit 이다.
		System.out.println("~m : " + ~m);
		
		//00000000 00000000 00000000 00101010	<= 42
		//11111111 11111111 11111111 11010101	<= -43
		
		/*
		 	첫번째 bit는 부호비트로 사용되어지는데
		 	0은 +임(양수)을 의미하고, 1은 -임(음수)을 의미한다.
			첫번째 bit가 1인 경우, 즉 음수를 뜻 할 경우에는 아래와 같이 구한다.
			똑같은 1이 나오는 것 중에서 마지막 1부터 끝까지 취한다.
			1010101
			첫번째 값만 -를 붙이고 나머지 값은 +로 연산을 하면된다.
				-1 * 2의 6승 + 0 * 2의 5승 + .......
				    -64    +     0      .......		=> -43			
		*/
		
		System.out.println("------ 5. 논리 부정  연산자 : ! ------");
		boolean bool = false;
		System.out.println("bool : " + bool);
		System.out.println("bool : " + !bool);

		System.out.println("------ 6. bit 연산자 : & | ^ ------");
		/*
		 	& (and 연산자)	==> 2개 bit 모두 1일때만 1, 나머지는 0
		 	| (or 연산자)		==> 2개 bit 중에서 적어도 1개가 1이면 1, 아니면 0
		 	^ (xor 연산자)	==> 2개 bit 중에서 서로 달라야만 1, 같으면 0
		 	& | ^ 연산되어지는 대상이 정수일 때만 가능.
		 */
		int x1 = 3;
		int y1 = 5;
		
		System.out.println("x1 & y1 = " + (x1 & y1));
		
		System.out.println("------ 7. 논리 연산자 : & | && || ------");
		
		int a1 = 50, b1 = 60;
		
		if( (a1 > b1) && (a1 > 0)) {
			System.out.println("Hello");
		}
		else if ( (b1 > a1) || (b1 < 0)) {
			System.out.println("Bye");
		}
		else {
			System.out.println("made by Derek");
		}
		
		System.out.println("------ Quiz 1. ------");
		int i = 1, j = i++;
		
		if((i > ++j) & (i++ == j)) {
			i = i + j;
		}
		System.out.println("i = " + i);
		
		System.out.println("------ Quiz 2. ------");
		int m1 = 0, n1 = 1;
		
		if((m1++ == 0) | (n1++ == 2)) {
			m1 = 42;
		}
		System.out.println("m1 = " + m1 + ", n1 = " + n1);
		
		System.out.println("------ Quiz 3. ------");
		boolean k1 = false;
		boolean k2 = false;
		boolean k3 = ((k1 = true) | (k2 = true));
		
		System.out.println(k1 + ", " + k2 + ", " + k3);
		
		System.out.println("------ 8. 비교 연산자 : == != > < >= <= ------");
		
		System.out.println("------ 9. 할당 연산자(연산 후 대입연산자) ------");
		i = 1;
		i += 3;
		System.out.println("i = " + i);
		
		j = 10;
		j -= 3;
		System.out.println("j = " + j);
		
		j *= 3;
		System.out.println("j = " + j);
		
		j %= 2;
		System.out.println("j = " + j);
		
		j ^= 5;	//	xor 연산 같아야만 0
		System.out.println("j = " + j);
		
		j <<= 3;	// j = j*2의 3승
		System.out.println("j = " + j);
		
		System.out.println("------ 10. 삼항 연산자(= if ~ else) ------");
		/*
		 	변수 선언 = (조건식)? 값1(진실값):값2(거짓값) => 조건에 맞게 변수에 값1 또는 값2가 대입됨
		 */
		
		a = 50;
		b = 60;
		
		int result = (a>b)? a:b;
		System.out.println(result);
		
		if(a<b) {
			System.out.println(b + "이 " + a + "보다 큽니다.");
		}
		else {
			System.out.println(a + "이" + b + "보다 같거나 큽니다.");
		}
		
		String str = (a < b)? b + "이 " + a + "보다 큽니다." : a + "이 " + b + "보다 같거나 큽니다.";
		System.out.println(str);
		
		System.out.println("------ Semi Test ------");
		/*
		 	연산자 우선순위
		 	
		 	단항 연산자		+  -  ~  ()  ++  --						HIGH
		 	산술 연산자 		*  /  %  +  -  >>  <<  >>>
		 	비교 연산자		<  >  >=  <=  ==  !=
		 	논리 연산자		&  |  ^ &&  ||
		 	대입 연산자		=  +=  -=  /=  %=  >>=  <<=   >>>=       LOW
		 */
		
		int su = 10;
		String strResult = (su >>> 3 >= 2) && (1 > 0)?"참입니다." : "거짓입니다.";
		System.out.println(strResult);
	}

}
