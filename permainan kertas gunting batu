import java.util.Scanner;
public class nyoba {
	public static void main(String[]args){
		//inisiallisasi variabel
		Scanner input = new Scanner(System.in);
		String anda = null;
		String komputer = null;
		String hasil = null;

		System.out.println ("Memulai Permainan Batu Kertas Gunting");
		System.out.print("Masukkan nama anda : ");
		char pilih;

		//INPUT PILIHAN BATU - KERTAS - GUNTING
		Scanner input2 = new Scanner(System.in);
		System.out.println( "Memilih : ");
		
		pilih = input2.next().charAt(0);
		int pilihan = input.nextInt();
		if(pilihan==0){
			anda = "BATU";
		}
		else if(pilihan==1){
			anda = "GUNTING";
		}
		else if(pilihan==2){
			anda = "KERTAS";
		}
		else if(pilihan==4){
			System.exit(0);
		}
		else {
			System.out.println("Maaf, nilai yang anda masukkan salah");
		}

		int generate = (int) (Math.random()*3+1);
		if(generate==1){
			komputer = "BATU";
		}
		else if(generate==2){
			komputer = "GUNTING";
		}
		else{
			komputer = "KERTAS";
		}

		if(pilihan<0 || pilihan>4)
			System.out.println("Maaf, Silahkan Ulangi lagi");
		else if(anda.equals(komputer)){
			hasil = "SERI";
		} else if(anda=="BATU" && komputer=="KERTAS"){
			hasil = "Anda Kalah";
		} else if(anda=="BATU" && komputer=="GUNTING"){
			hasil = "Anda Kalah";
		} else if(anda=="KERTAS" && komputer=="GUNTING"){
			hasil = "Anda Kalah";
		} else if(anda=="GUNTING" && komputer=="KERTAS"){
			hasil = "Anda Menang";
		} else if(anda=="GUNTING" && komputer=="BATU"){
			hasil = "Anda Kalah";
		}

		System.out.println("anda memilih : "+anda);
		System.out.println("Komputer memilih : "+komputer);
		System.out.println("Hasil : "+hasil);
	}
}
