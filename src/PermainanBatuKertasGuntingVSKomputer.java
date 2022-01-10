import java.util.Scanner;

public class PermainanBatuKertasGuntingVSKomputer {
	public static void main (String[]args) {


		char nama;

		//INPUT NAMA
		
		System.out.println ("Mulai Permainan Batu Kertas Gunting");

		Scanner input = new Scanner(System.in);
		System.out.print("Masukan nama anda : ");
		nama = input.next().charAt(0);

		char pilih;

		//INPUT PILIHAN BATU - KERTAS - GUNTING
		
		Scanner input2 = new Scanner(System.in);
		System.out.print( "Memilih : ");
		pilih = input2.next().charAt(0);

		switch (pilih) {
		case '0':
			System.out.println ("Memilih Batu");
			break;
		case '1':
			System.out.println ("Memilih Kertas");
			break;
		case '2':
			System.out.println ("Memilih Gunting");
			break;
		default :
			System.out.println ("Anda belum memilih!");
		}

	}
}
