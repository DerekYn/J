package my.day19.test;

public class Book {

	private String category;
	private String bookName;
	private double bookPrice;
	private double bookDiscountRate;
	
	public Book() { }
	
	public Book(String category, String bookName, double bookPrice, double bookDiscountRate) {
		this.category = category;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookDiscountRate = bookDiscountRate;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public double getBookDiscountRate() {
		return bookDiscountRate;
	}

	public void setBookDiscountRate(double bookDiscountRate) {
		this.bookDiscountRate = bookDiscountRate;
	}
	
	@Override    // @ 를 애노테이션기법, 어노테이션기법
	public String toString() {
		return category+" "+bookName+" "+bookPrice+"원 "+bookDiscountRate+" %"; 
	}
	
	public String showInfo() {
		
		String result = " ▷ 카테고리 : " + category
				   + "\n ▷ 책이름 : " + bookName
				   + "\n ▷ 가격 : " + bookPrice
				   + "\n ▷ 할인률 : " + bookDiscountRate;
	
		return result;
	}
	
}
