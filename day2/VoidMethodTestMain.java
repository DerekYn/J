public class VoidMethodTestMain 
{
	public static void main(String[] args) 
	{
		Member member1 = new Member("bitcoin", "1234", "gzua", 32, 183.4);
		Member member2 = new Member("stock", "5678", "skinhead", 25, 157.4);
		
		member1.infoPrint();
		System.out.println("===============================");
		member2.infoPrint();
	}
}
