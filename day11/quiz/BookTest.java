package my.day11.quiz;

public class BookTest {

	public static void main(String[] args) {
		
		Book[] bookArr = new Book[5];
		
		bookArr[0] = new Book("IT", "SQL PLUS", 50000, 5);
		bookArr[1] = new Book("IT", "JAVA 2.0", 40000, 3);
		bookArr[2] = new Book("IT", "JSP Servlet", 60000, 6);
		bookArr[3] = new Book("Novel", "davinci code", 30000, 10);
		bookArr[4] = new Book("Novel", "coloven hoof", 50000, 5);
		
		double total = 0;
		
		for(int i=0; i<bookArr.length; i++) {
			
			System.out.println(bookArr[i].getCategory() + "\t" +
								bookArr[i].getBookName() + "\t" +
								bookArr[i].getBookPrice() + "원\t" +
								bookArr[i].getBookDiscountRate() + "%\t");
			
			total += bookArr[i].getBookPrice();
			
		}
		
		System.out.println("\n책 가격의 합 : " + total);
		

	}

}
