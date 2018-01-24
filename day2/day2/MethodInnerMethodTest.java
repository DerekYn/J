public class MethodInnerMethodTest
{
	public void showResult(int a, int b, int c){
		System.out.println(calc(a, b, c));
	}

	public String calc(int a, int b, int c){
		
		return "Æò±ÕÄ¡ : " + avg(a, b, c);
	}

	public double avg(int a, int b, int c){
		int result = sum(a, b, c);
		double result2 = (double)result / 3; // casting ¿¬»ê
		return result2;
	}

	public int sum(int a, int b, int c){
		int result = a + b + c;
		return result;
	}
}
