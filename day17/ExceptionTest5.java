/*
 	try { } 블럭하나에 catch 절은 여러개가 올 수 있다.
 	그런데 이때 주의해야 할 점은, catch 순서를 신경써야 한다.
 	자식 Exception 을 먼저 catch 하고 부모 Exception 은 나중에 catch 해야 한다.
 	
 */

package my.day17;

public class ExceptionTest5 {

	public static void main(String[] args) {
		
		String[] subjectArr = {"Java", "Oracle", "JSP"};
		
		for(int i=0; i<subjectArr.length+1; i++) {
			
			try {
				System.out.println("i => " + i + " " + subjectArr[i]);
				
				if(i==1) {
					int point = Integer.parseInt("구십오");
					System.out.println(point);
				}
				else if(i==2) {
					System.out.println("50/(2-2) = " + (50/(i-2)));
				}
				
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배열의 인덱스 범위가 초과되었습니다.");	
			} catch (NumberFormatException e) {
				System.out.println("숫자로 변경이 불가한 문자열입니다.");	
			} catch (Exception e) {
				System.out.println(">>>> 기타 오류 발생!!!");
			}
			
		}
		

	}

}
