import java.util.Scanner;

public class Soal01 {

	static String running = " valid";
	static String notRunning = " tidak valid";

	static String divisions(int a){

		int ratusan = a / 100;
		int puluhan = (a/10) % 10;
		int satuan = a % 10;

		String format = String.format("%d%d%d", ratusan, puluhan, satuan);
		String hasil = (ratusan != puluhan && ratusan != satuan && puluhan != satuan) ? " valid" : format + " tidak valid";
		return hasil;
	}
	
	static String validasi(int a, int b, int c){
		if (a != b && a != c && b != c){
			System.out.printf"%d%d%d", ratusan, puluhan, satuan, " valid";
			if ( a <= b && b <= c){
				System.out.println(" valid");
				if (c % 2 == 1){
					System.out.println(" valid");
		} else {
		
	}
/* 
	}
	static String validasiB(int a, int b, int c){
			System.out.println();running;
			
		} else {
			return notRunning;
		}
	}
	static String validasiC(int a, int b, int c){
			 return running;
		} else {
			return notRunning;
		}
	} */
	
	public static void main(final String[] args) {
		Scanner k = new Scanner(System.in);
		
		int a = k.nextInt();
		/*int b = k.nextInt();
		int c = k.nextInt();
		int d = k.nextInt();
		int e = k.nextInt();*/
		
		divisions(a);
	
	}
}
