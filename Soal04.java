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

		double bonusLima = honorJam * 95 / 100;
		double total = formula + bonusLima;

		double bonusTujuh = honorJam * 93 / 100;
		double total2 = formula + bonusTujuh;

		double noBonus = formula;


		switch (kode) {
			case "DES":
			tunjangan = 600000;
			if (jamSebulan >= 160) {
				double rumus = tunjangan + bonusLima;

			} else if (jamSebulan >= 170) {
				double rumus1 = tunjangan + bonusTujuh;

			} else {
				double rumus2 = tunjangan + formula;
				System.out.println(rumus2);
			}
			break;
			
			case "PRG":
				tunjangan = 1200000;
				if (jamSebulan >= 160) {
					double rumus = tunjangan + bonusLima;
					System.out.println(rumus);
	
				} else if (jamSebulan >= 170) {
					double rumus1 = tunjangan + bonusTujuh;
					System.out.println(rumus1);
	
				} else {
					double rumus2 = tunjangan + formula;
					System.out.println(rumus2);
				}
				
				break;

			case "WRT":
				tunjangan = 400000;
				if (jamSebulan >= 160) {
					double rumus = tunjangan + bonusLima;
					System.out.println(rumus);
	
				} else if (jamSebulan >= 170) {
					double rumus1 = tunjangan + bonusTujuh;
					System.out.println(rumus1);
	
				} else {
					double rumus2 = tunjangan + formula;
					System.out.println(rumus2);
				}
				break;
			
			case "MKT":
				tunjangan = 500000;
				if (jamSebulan >= 160) {
					double rumus = tunjangan + bonusLima;
					System.out.println(rumus);
	
				} else if (jamSebulan >= 170) {
					double rumus1 = tunjangan + bonusTujuh;
					System.out.println(rumus1);
	
				} else {
					double rumus2 = tunjangan + formula;
					System.out.println(rumus2);
				}
		}
	}
}
