package Practice;

public class operator {

	public static void main(String[] args) {
		
		int a= 4;
		int b=2;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a<b);
		System.out.println(b>a);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		System.out.println(a/b);

		
		if(a>b) {
			System.out.println("correct");
		}
		 else if(b==a) {
			
			System.out.println("run one more time");
			
		}
		
		 else {
			 System.out.println("wrong");
		 }
	}

}
