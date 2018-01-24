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

	// --- 숫자를 입력받아 세자리마다 comma(,)를 찍어주는 method ---
	public static String getMoney(long money) {
		DecimalFormat df = new DecimalFormat("#,###");
		String strMoney = df.format(money);
		return strMoney;
	}
}
