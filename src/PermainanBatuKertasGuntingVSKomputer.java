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
import java.util.Scanner;
public class BatuGuntingKertas {
	public static void main (String[]args) {
		char nama;

		//INPUT NAMA

		System.out.println ("Mulai Permainan Batu Kertas Gunting");

		Scanner input = new Scanner(System.in);
		System.out.print("Masukan nama anda : ");
		nama = input.next().charAt(0);
		String user = null;
		String komputer = null;
		String hasil = null;
		int pilih;

		//INPUT PILIHAN BATU - KERTAS - GUNTING

		Scanner input2 = new Scanner(System.in);
		System.out.print( "Anda Memilih : ");
		pilih = input2.next().charAt(0);

		switch (pilih) {
		case '0':
			user = "Batu";
			System.out.println("batu");
			break;
		case '1':
			user = "Kertas";
			System.out.println("Kertas");
			break;
		case '2':
			user = "Gunting";
			System.out.println("Gunting");
		default:
			break;
		}
			
			int cpu = (int) (Math.random()*3+1);
			
			Scanner scanner = new Scanner(System.in);
			System.out.println( "komputer Memilih : ");
			switch(cpu)
			{
			
			case '0':
				komputer ="batu";
				System.out.print("batu");
				break;
			case '1':
				komputer = "kertas";
				System.out.print("kertas");
				break;
			case '2':
				komputer = "Gunting";
				System.out.print("Gunting");
				break;
			}
				if(pilih<3)
	                System.out.println("Mohon Ulangi!");
	         
	            else if(user.equals(cpu)){
	                hasil = "DRAW";
	            } else if(user=="BATU" && komputer=="KERTAS"){
	                hasil = "Anda Kalah";
	            } else if(user=="BATU" && komputer=="GUNTING"){
	                hasil = "Anda menang";
	            } else if(user=="KERTAS" && komputer=="BATU"){
	                hasil = "Anda Menang";
	            } else if(user=="KERTAS" && komputer=="GUNTING"){
	                hasil = "Anda Kalah";
	            } else if(user=="GUNTING" && komputer=="KERTAS"){
	                hasil = "Anda Menang";
	            } else if(user=="GUNTING" && komputer=="BATU"){
	                hasil = "Anda Kalah";
	            
	          
			}
	}
	}
	




