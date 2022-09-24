package MethodsLesson2;

public class MethodsLesson2 {

	public static void main(String[] args) {
		
		sayiBulmaca();

		
	}

	public static void sayiBulmaca() {
		
		int[] sayilar = new int[] { 1, 2, 2, 7, 9, 0 };

		int aranacak = 5;

		boolean VarMi=false;
		
		 for(int sayi:sayilar) {
			 
			 if(sayi==aranacak) {
				 VarMi=true;
				 break;
			 }
		 }
		 
		 if(VarMi) {
			 
			mesajVer("Sayi Mevcuttur : "+aranacak);
		 }else {
			 mesajVer("Sayi Mevcut Deðildir: "+aranacak);
			 
		 }
	}
	
	public static void mesajVer(String mesaj) {
		
		 System.out.println(mesaj);
		
	}
}
