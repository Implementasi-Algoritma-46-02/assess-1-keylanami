import java.util.Scanner;

public class Soal02 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner i = new Scanner(System.in);

		double masaStudi = i.nextDouble();
		double ipk = i.nextDouble();
		int eprt = i.nextInt();
		String hki = i.next();
		String lombaInter = i.next();

		if (masaStudi < 3.0 && ipk < 3.5 && eprt <= 449 && hki != "ada" && lombaInter != "ada"){
			System.out.println("Tidak Cumlaude");
		} else {
			System.out.println("Cumlaude");
		}
	}
}
