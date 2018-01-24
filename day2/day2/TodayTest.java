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
			
			<����>
			��¥ Ÿ�� format			����
			-------------------------------------------------------
			%tF						��¥�� yyyy-mm-dd �������� ����
			%tT						�ð��� HH:MM:SS �������� ����
			%tp						����/���ĸ� ���
			%tA						���ϸ� ���
			%tY						yyyy�� ���
			%tB						����(����)�� ���
			%tm						mm�� ���
			%td/%te					dd�� ���
			%tk						hh(0~23)�� ���
			%tl						hh(1~12)�� ���
			%tM						mm(��)�� ���
			%tS						ss�� ���
			%tZ						time zone ���
		*/
	}
}