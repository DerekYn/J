public class CalculatorMain  
{
	public static void main(String[] args) 
	{
		Calculator cal = new Calculator();
		int sum = cal.plus(10,20);
		System.out.println(sum);

		System.out.println("==================================");

		sum = Calculator.hap(20,30);
		System.out.println(sum);

		System.out.println("���� �ð� : " + MyUtil.getNowTime());
	}
}
