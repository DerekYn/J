package my.day15;

import java.util.BitSet;
import java.util.Calendar;

public abstract class AbstractAnimal implements InterAnimal{

	protected String name;		// 이름
	protected String birthday;	// 출생일자
	private String level;		// 등급레벨
	

	@Override
	public int getAge() {
		Calendar currentdate = Calendar.getInstance();		// 현재 날짜와 시간을 불러온다.
		int currentYear = currentdate.get(Calendar.YEAR);
		
		String birthYear = birthday.substring(0, 4);
		
		int currentAge = currentYear - Integer.parseInt(birthYear) + 1;
		
		return currentAge;
		
		// 나이 = 현재 년도 - 태어난 년도 + 1
	}
	
	public String getLevel() {
		return level;
	}
		
	public void setLevel(int levelNo) {
		
		if ( 1 <= levelNo && levelNo <= 3 ) {
			level = "D";
		}
		else if( 4 <= levelNo && levelNo <= 6 ) {
			level = "C";
		}
		else if( 7 <= levelNo && levelNo <= 9 ) {
			level = "B";
		}
		else if( 10 <= levelNo ) {
			level = "A";
		}

	}
	
}
