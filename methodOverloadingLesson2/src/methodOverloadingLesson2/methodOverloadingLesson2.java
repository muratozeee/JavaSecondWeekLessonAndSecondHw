package methodOverloadingLesson2;

public class methodOverloadingLesson2 {
	public static void main(String[] args) {
		
		DortIslem dortIslem= new DortIslem();
		

		
		System.out.println("2+3= "+dortIslem.sum(2, 3));
		//istersek 3 de çýkarabiliriz...
		

		System.out.println("2+3+4= "+dortIslem.sum(2, 3, 4));
	}

}
