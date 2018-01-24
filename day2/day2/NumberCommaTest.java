import java.text.*;
public class NumberCommaTest 
{
	public static void main(String[] args) 
	{
		long money = 874654894565L;

		System.out.println("money : " + money + "won");

		// 숫자로 되어진 데이터를 세자리 마다 comma(,) 찍어주는 객체
		DecimalFormat df = new DecimalFormat("#,###");
		String strMoney = df.format(money);
		System.out.println("strmoney : " + strMoney + "won");

	}
}
