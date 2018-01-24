import java.util.*;
import java.text.*;

public class MyUtil
{
	// --- Show realtime ---
	public static String getNowTime() {
		Date now = new Date();
		String today = String.format("%tF %tT", now, now);
		return today;
	}

	// --- ���ڸ� �Է¹޾� ���ڸ����� comma(,)�� ����ִ� method ---
	public static String getMoney(long money) {
		DecimalFormat df = new DecimalFormat("#,###");
		String strMoney = df.format(money);
		return strMoney;
	}
}
