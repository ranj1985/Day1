package Practice;

public class ForLoop {

	public static void main(String[] args) {


		
//		
//		for(int i=0;i<=10;i++) {
//			
//			System.out.println(i);
//		}
//
//		for(int i=5;i>0;i--) {
//			
//			System.out.println(i);
//			
//		}
//		
		
		int []age= {11,22,33,44,55,66,77};
		
		for(int i=0;i<age.length;i++) {
			
			System.out.println(age[i]);
		}
		
		String [] name= {"Ram","Sita","Gita"};
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i]);
		}
		
		int lengthofarray=name.length;
		
		for(int i=0;i<lengthofarray;i++) {
			System.out.println(name[i]);
		}
	}

}
