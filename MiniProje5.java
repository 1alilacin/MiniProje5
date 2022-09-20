package intro;

public class MiniProje5 {

	public static void main(String[] args) {
		// Sayı bulma programı.
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 12;
		boolean varMi = false;
		for (int i = 0; i < sayilar.length; i++) {
			if (aranacak == sayilar[i]) {
				varMi = true;
			} else {
				varMi = false;
			}
		}
		if (varMi == true) {
			System.out.println("Aramak istediğiniz sayı dizi içerisinde mevcuttur.");
		} else {
			System.out.println("Aramak istediğiniz sayı dizi içerisinde bulunmamaktadır.");
		}
	}

}
