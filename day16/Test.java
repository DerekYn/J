package my.day16;

public class Test {

	public static void main(String[] args) {
		
		String str1 = "동해물과 백두산이";
			   str1 += "마르고 닳도록 하느님이";
			   str1 += "보우하사 우리나라 만세";
			   
		System.out.println(str1);
		
		System.out.println("====================================================");
		
		StringBuilder sb = new StringBuilder();		// append 할게 많으면 StringBuilder!!
		sb.append("동해물과 백두산이");
		sb.append("마르고 닳도록 하느님이");
		sb.append("보우하사 우리나라 만세");
				
		System.out.println(sb.toString());
		
		System.out.println("====================================================");
		
		StringBuffer sbu = new StringBuffer();		// append 할게 얼마 없으면 StringBuilder!!
		sbu.append("동해물과 백두산이");
		sbu.append("마르고 닳도록 하느님이");
		sbu.append("보우하사 우리나라 만세");
				
		System.out.println(sbu.toString());
		

	}

}
