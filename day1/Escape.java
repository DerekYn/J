/*
	Escape 문자 ==> 제어 문자
	-- 인쇄할 수 없거나 키보드로 표현할 수 없는 특별한 문자를 가리키며,
		역 슬래쉬(\)와 한개의 문자를 결합하여 작성한다.

		\n	==> 개행. 스크린 커서의 위치를 다음 줄의 처음으로 옮긴다.
		\t	==> 수평탭. 스크린 커서를 다음 탭으로 옮긴다.
		\r	==> 캐리지 리턴. 스크린 커서의 위치를 현재 줄의 처음으로 옮긴다.
				개행하지는 않는다. 이 기호 다음에 오는 문자를 덮어 씌운다.
		\\	==> 역 슬래쉬를 출력할 때 사용한다.
		\"	==> 큰 따음표를 출력할 때 사용한다.(작은 따음표 동일)
*/

public class Escape
{
	public static void main(String[] args) 
	{
		System.out.println("국어\t수학\t영어");
		System.out.println("100\t105\t186");

		System.out.println("동해물과 백두산이");
		System.out.println("동해물과 백두산이 \r마");

		System.out.print("가나다라마바사");
		System.out.print("아자차카타파하\r\n");		// \r\n은 엔터다 그냥 다음줄에 쓰고 싶을때 사용!
		System.out.print("ABCDEFGH");

		System.out.println("");
		System.out.println("");
		System.out.println("");

		System.out.println("김소월 님의 \'진달래\'\r\n\"\t\t나보기가 역겨워 가실 때에는 \"\r\nc:\\진달래.hwp");
		/*
			김소월 님의 '진달래'
			"		나보기가 역겨워 가실 때에는

		*/

	}
}
