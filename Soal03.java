import java.util.Scanner;

public class Soal03 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini

		Scanner j = new Scanner(System.in);

		int h = j.nextInt();
		int m = j.nextInt();
		int addV = j.nextInt();

		int operating = 0;
		int rumusJam = 0;
		int rumusMenit = (m + addV);
		if (rumusMenit >= 60){
			int jam = h + 1;
			int menit = (rumusMenit - 60);
			if (jam < 10){
				String jamm = "0" + jam;
				System.out.println(jamm + ":" + menit);
			} else {
			System.out.println(jam + ":" + menit);
			}
		} else {
			System.out.println(h + ":" + rumusMenit);
		}

	}
}
