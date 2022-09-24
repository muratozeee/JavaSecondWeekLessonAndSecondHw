package methods2Lesson2;

public class methods2Lesson2 {
	public static void main(String[] args) {
		
		
		//String message="the weather is quiete good today";
		
		// String newMessage=message.substring(0,2);
		

		String newMessage=givecity();
		//System.out.println(sum());

		System.out.println("it was deleted");

		

		System.out.println(newMessage);
//		System.out.println(sum());
		
	//	int number=sum(5,7);
		
	//	System.out.println(number);
		
		int sum =sum2(2,3,4,5,6,10);
		
		System.out.println(sum);
		
		
		
	}

	public static void add() {
		
		System.out.println("it was Added");
		
	}
	
	public static void delete() {
	
		System.out.println("it was deleted");
	}
	
	public static void update() {
		
		System.out.println("it was updated");

	}
	
	public static int sum(int num1,int num2) {
		
		return num1+num2;
		
	}
	
	public static String givecity() {
		 
		return "Ankara";
	}
		
	
	public static int sum2(int... numbers) {
		
		
		int toplam=0;
		for(int i:numbers) {
			
			toplam=toplam+i;
		}
		return toplam;
	
	}
	
		
	
	
}
	
	


