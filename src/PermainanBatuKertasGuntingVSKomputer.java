import java.util.Random;
import java.util.Scanner;

public class PermainanBatuKertasGuntingVSKomputer {
	// Mendifinisikan tipe data buatan sendiri
	enum Move { 
		BATU,
		KERTAS,
		GUNTING
	}
	// Membuat fungsi untuk mendapatkan pilihan gerakan komputer
	public static String getGerakanKomputer()
	{
		String computerChoice;
		Random random = new Random();
		int input = random.nextInt(3)+1;
		if (input == 1) {
			computerChoice = Move.BATU.name();
		}
		else if (input == 2) {
			computerChoice = Move.KERTAS.name();
		}
		else {
            computerChoice = Move.GUNTING.name();
        }
        return computerChoice;
	}
	
	public static void main (String[]args) {

		char pilih;

		//INPUT NAMA
		
		System.out.println ("Memulai Permainan Batu Kertas Gunting!");
		System.out.println ();

		Scanner input = new Scanner(System.in);
		String nama;
		System.out.print("Masukan nama anda : ");
		nama = input.nextLine();

		//INPUT PILIHAN BATU - KERTAS - GUNTING
		
		System.out.print( "Pilih Tangan: (0 = BATU, 1 = KERTAS, 2 = GUNTING ");
		System.out.println ();
		Scanner input2 = new Scanner(System.in);
		System.out.print( "Masukan nomor (0-2) : ");
		pilih = input2.next().charAt(0);
		
		String gerakanKomputer = getGerakanKomputer(); // Buat variabel baru mengambil nilai dari fungsi getGerakanKomputer()
		switch (pilih) { // Eksekusi kasus sesuai dengan pilihan tangan pemain
		case '0': // Eksekusi jika pemain memilih Pilihan Batu
			System.out.println (nama+" memilih : BATU");
			System.out.println("Komputer memilih : "+gerakanKomputer); 
			if(gerakanKomputer.equals(Move.KERTAS.name())) {
                System.out.println("Hasil : Kalah");
            }else if (gerakanKomputer.equals(Move.BATU.name())){
                System.out.println("Hasil : Seri");
            }else {
            	System.out.println("Hasil : Menang");
            }
			break;
			case '1': // Eksekusi jika pemain memilih Pilihan Kertas
				System.out.println (nama+" memilih : KERTAS");
				System.out.println("Komputer memilih : "+gerakanKomputer);
				if(gerakanKomputer.equals(Move.GUNTING.name())) {
	                System.out.println("Hasil : Kalah");
	            }else if (gerakanKomputer.equals(Move.KERTAS.name())){
	                System.out.println("Hasil : Seri");
	            }else {
	            	System.out.println("Hasil : Menang");
	            }
				break;
			case '2': // Eksekusi jika pemain memilih Pilihan Gunting
				System.out.println (nama+" memilih : GUNTING");
				System.out.println("Komputer memilih : "+gerakanKomputer);
				if(gerakanKomputer.equals(Move.BATU.name())) {
	                System.out.println("Hasil : Kalah");
	            }else if (gerakanKomputer.equals(Move.GUNTING.name())){
	                System.out.println("Hasil : Seri");
	            }else {
	            	System.out.println("Hasil : Menang");
	            }
				break;
		default :
			System.out.println (nama+" Pilihan Tidak Tersedia!");
		}

	}
}

