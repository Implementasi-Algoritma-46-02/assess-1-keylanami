
import java.util.Scanner;

public class Soal04 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner hi = new Scanner(System.in);

		String kode = hi.next();
		int jamSebulan = hi.nextInt();

		int honorJam = 30000;
		int formula = jamSebulan * honorJam;
		int tunjangan = 0;
		int paid = 0;
		double bonusLima = honorJam * 95 / 100;
		double total = formula + bonusLima;
		double bonusTujuh = honorJam * 93 / 100;
		double total2 = formula + bonusTujuh;
		double noBonus = formula;


		switch (kode) {
			case "DES":
			tunjangan = 600000;
			if (jamSebulan >= 160) {
	

			} else if (jamSebulan >= 170) {
			

			} else {
			
			}
			break;
			
			case "PRG":
				tunjangan = 1200;
				
				break;

			case "WRT":
				tunjangan = 400;
				break;
			
			case "MKT":
				tunjangan = 500;
		}
	}
}
