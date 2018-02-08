package my.day11;

import java.util.Scanner;

public class RecordMain {

	public static void main(String[] args) {
		
		Student[] studentArr = new Student[3];
		
		studentArr[0] = new Student();
		studentArr[0].setNumberOfStudent("kh0001");
		studentArr[0].setName("한석규");
		studentArr[0].setMobile("010-111-1111");
		
		studentArr[1] = new Student();
		studentArr[1].setNumberOfStudent("kh0002");
		studentArr[1].setName("두석규");
		studentArr[1].setMobile("010-222-2222");
		
		studentArr[2] = new Student();
		studentArr[2].setNumberOfStudent("kh0003");
		studentArr[2].setName("세석규");
		studentArr[2].setMobile("010-333-3333");
			
		Record[] recordArr = new Record[3];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<studentArr.length; i++) {
			recordArr[i] = new Record();
			
			recordArr[i].setStudent(studentArr[i]); 
			
			try {
			     do {
			    	 System.out.println("== "+recordArr[i].getStudent().getName()+"의 성적입력");
			    	 System.out.print(">> 국어 => ");
					 int kor = Integer.parseInt(sc.nextLine());
					 
					 recordArr[i].setKor(kor);
					 if(recordArr[i].getKor() == -1) 
						 continue;
					 else 
						 break;
				} while (true);
			     
			     do {
			    	 System.out.print(">> 영어 => ");
					 int eng = Integer.parseInt(sc.nextLine());
					 
					 recordArr[i].setEng(eng);
					 if(recordArr[i].getEng() == -1) 
						 continue;
					 else 
						 break;
				} while (true); 
			     
			     do {
			    	 System.out.print(">> 수학 => ");
					 int math = Integer.parseInt(sc.nextLine());
					 
					 recordArr[i].setMat(math);
					 if(recordArr[i].getMat() == -1) 
						 continue;
					 else 
						 break;
				} while (true); 
			     
			} catch (NumberFormatException e) {
				System.out.println(">> 점수는 숫자만 가능합니다.!!");
			}
			
			System.out.println("");	
			
		}// end of for----------------------
		
		System.out.println(">>> 성적입력완료!!\n");
		
		System.out.println("----------------------------------");	
		System.out.println("학생명     국어   영어   수학   총점   평균   학점");
		System.out.println("----------------------------------");
		
		for(int i=0; i<recordArr.length; i++) {
			String name = recordArr[i].getStudent().getName();
			int kor = recordArr[i].getKor();
			int eng = recordArr[i].getEng();
			int math = recordArr[i].getMat();
			int total = recordArr[i].getTotal();
			double avg = recordArr[i].getAvg();
			String grade = recordArr[i].getGrade();
			
			System.out.println(name+"  "+kor+"  "+eng+"  "+math+"  "+total+"  "+avg+"  "+ grade); 
		
		}// end of for--------------------

		sc.close();
		
	}// end of main()---------------------------

}
/*
      학생 3명 입력해서 배열로 저장
      각 학생별로 국어,영어,수학 점수를 입력해서 배열로 저장
   
   <결과물>
   ----------------------------------
      학생명     국어   영어   수학   총점   평균   학점 
   ----------------------------------
      한석규
      두석규
      세석규       

 */
