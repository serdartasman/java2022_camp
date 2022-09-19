package introo;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello world!");
        
		//değişken isimlendirilmeleri java'da camelCase yazılır
		String ortaMetin ="İlginizi çekebilir";
		String altMetin = "Vade süresi";
		
		System.out.println(ortaMetin);
		
		//integger tam sayı 
		int vade = 12;
		
		double dolarDun = 18.25;
		double dolarBugun = 18.30;
		
		Boolean dolarDustuMu = false;
		
		String okYonu = "";
        
		if (dolarBugun<dolarDun) { //false ,  if eğer, else haricinde 
			okYonu = "down.svg";
			System.out.println(okYonu);
		} else if(dolarBugun>dolarDun) {
			okYonu = "up.svg";
			System.out.println(okYonu);
		}
		else {
			okYonu = "equal.svg";
			System.out.println(okYonu);
		}
		
		//array
		
		String[] krediler = {"Hızlı Kredi","Maaşını Halkbanktan","Mutlu Emekli"};
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
	
		
	}

}
