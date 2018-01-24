import java.util.*;

public class TodayTest
{
	public static void main(String[] args) 
	{
		// time now
		Date now = new Date();
		System.out.println("now : " + now);

		String today = String.format("%tF, %tT", now, now);
		System.out.println("now : " + today);

		/*
			
			<참고>
			날짜 타입 format			설명
			-------------------------------------------------------
			%tF						날짜를 yyyy-mm-dd 형식으로 포맷
			%tT						시간을 HH:MM:SS 형식으로 포맷
			%tp						오전/오후를 출력
			%tA						요일명 출력
			%tY						yyyy를 출력
			%tB						월명(영어)을 출력
			%tm						mm를 출력
			%td/%te					dd로 출력
			%tk						hh(0~23)로 출력
			%tl						hh(1~12)로 출력
			%tM						mm(분)로 출력
			%tS						ss로 출력
			%tZ						time zone 출력
		*/
	}
}