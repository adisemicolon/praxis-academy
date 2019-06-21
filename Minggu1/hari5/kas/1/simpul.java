import java.util.Scanner;

public class simpul{
	public String nama;//nama_perusahaan
	public String alamat;
	public String jenis_usaha;
	public String dir; //nama_direktur
	public int jmlk; //jmlh_karyawan
	public simpul kanan;
}

class perusahaan{
	public static simpul awal;
	public static simpul akhir;

	public static void kosong(){
    	awal = null;
    	akhir= null;
    	int N = 0;
  	}
  	public static void menu(){
  		Scanner scan = new Scanner(System.in);
		System.out.println("Selamat datang dalam program gue");
		System.out.println(" == DATA PERUSHANAAN == ");
		System.out.println("Silahkan pilih menu : ");
		System.out.println("1. Memasukkan data perusahaan ");
		System.out.println("2. Menampilkan data ");
		System.out.println("3. Menambah data ");
		System.out.println("4. Mencari data ");
		System.out.println("5. Mengedit data ");
		System.out.println("6. Menghapus data ");
		System.out.println("7. Keluar ");
		System.out.print(" pilihan anda (1-7) : ");
		int pil = scan.nextInt();
  	}

}