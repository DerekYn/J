import java.text.*;
public class NumberCommaTest 
{
	public static void main(String[] args) 
	{
		long money = 874654894565L;

		System.out.println("money : " + money + "won");

		// ���ڷ� �Ǿ��� �����͸� ���ڸ� ���� comma(,) ����ִ� ��ü
		DecimalFormat df = new DecimalFormat("#,###");
		String strMoney = df.format(money);
		System.out.println("strmoney : " + strMoney + "won");

	}
}
