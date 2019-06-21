import java.util.Scanner;

class simpul{
	public String nama;//nama_perusahaan
	public String alamat;
	public String jenis; //jenis_perusahaan
	public int jmlk; //jmlh_karyawan
	public simpul kanan;
}

class perusahaan{
	public static simpul awal;
	public static simpul akhir;
	public static Scanner scan = new Scanner(System.in);
	public static int N = 1;
	public static void kosong(){
    	awal = null;
    	akhir= null;
  	}

  	public static void menu(simpul usaha){
		System.out.println("Selamat datang dalam program gue");
		System.out.println(" == DATA PERUSHANAAN == ");
		System.out.println("Silahkan pilih menu : ");
		System.out.println("1. Input data ");
		System.out.println("2. Tampilkan data ");
		System.out.println("3. Tambah data ");
		System.out.println("4. cari data ");
		System.out.println("5. Edit data ");
		System.out.println("6. Hapus data ");
		System.out.println("7. Keluar ");
		System.out.print(" pilihan anda (1-7) : ");
		int pil = scan.nextInt();
		 switch(pil){
	    	case 1:{
	    		System.out.println("");
	    		input();
	    		break;
	    	}
	    	case 2:{
	    		System.out.println("");
	    		tampil(usaha);
	    		break;
	    	}
	    	case 3:{
	    		System.out.println("");
	    		tambah(usaha);
	    		break;
	    	}
	    	case 4:{
	    		System.out.println("");
	    		cari(usaha);
	    		break;
	    	}	    
	    	case 5:{
	    		System.out.println("");
	    		edit(usaha);
	    		break;
	    	}
	    	case 6:{
	    		System.out.println("");
	    		hapus(usaha);
	    		break;
	    	}	
	    	case 7:{
	    		System.out.println("Sampai jumpa");
	    		break;
	    	}
	    	default:
	    		System.out.println("Maaf pilihan yang anda masukkan salah !!!");
	    		System.out.println("");
	    		menu(usaha);
	    }
  	}


  	public static void input(){
  		simpul usaha = new simpul();
  		char lagi;
  		System.out.println("++++input data perusahaan++++");
  			do{
  				usaha = new simpul();
  				System.out.print("Nama  		 	: ");usaha.nama = scan.next();
  				System.out.print("alamat	 		: ");usaha.alamat = scan.next();
  				System.out.print("Jenis 		 	: ");usaha.jenis = scan.next();
  				System.out.print("Jumlah Karyawan 	: ");usaha.jmlk = scan.nextInt();
  					if(awal == null){
  						awal = usaha;
  						akhir = usaha;
  						usaha.kanan = null; 
  					}else{
  						akhir.kanan = usaha;
  						akhir = usaha;
  						usaha.kanan = null;
  					}
		    System.out.print("Tambah Data Lagi (y/t) : ");
		    lagi = scan.next().charAt(0);
		    N++;
  			}while(lagi=='y'||lagi == 'Y');
  			System.out.println();
  			menu(usaha);
  	}

  	public static void tampil(simpul usaha){
  		simpul cetak = awal;
	    int i=0;
  			System.out.println("");
			System.out.println("---------------------------------------------------------------");
			System.out.println("+++Menampilkan Data Perusahaan+++");
			System.out.println("---------------------------------------------------------------");
			System.out.println("No  Nama\tAlamat\tJenis usaha\tJumlah Karyawan");
			System.out.println("---------------------------------------------------------------");
			while(cetak!=null){
			    System.out.print((i+1)+"  ");
				System.out.print(cetak.nama+"\t\t");
				System.out.print(cetak.alamat+"\t\t");
				System.out.print(cetak.jenis+"\t\t");
				System.out.println(cetak.jmlk);
				cetak = cetak.kanan;
				i++;
			}
		System.out.println("");
	    menu(usaha);
  	}

  	public static int hitung(){
  		int N = 0;
  		simpul bantu;
  		bantu = awal;
  		while (bantu!=null){
  			bantu = bantu.kanan;
  			N++;
  		}
  		return (N);
  	}
  	public static void tambah(simpul usaha){
  		int pil;
  		do{	
  			System.out.println("+++Tambah Data+++");
  			System.out.println("1. Menambah Data Di Depan");
		    System.out.println("2. Menambah Data Di Tengah");
		    System.out.println("3. Menambah Data Di Belakang");
		    System.out.println("4. Kembali Ke Menu Utama");
		    System.out.print("Input Pilihan (1-4) : ");
  			pil = scan.nextInt();
  				switch (pil){
  					case 1 :{
  						simpul ngarep = new simpul();
  						System.out.println("Menambah data didepan");			
  						System.out.print("Nama  		 	: ");ngarep.nama = scan.next();
  						System.out.print("alamat	 		: ");ngarep.alamat = scan.next();
  						System.out.print("Jenis 		 	: ");ngarep.jenis = scan.next();
  						System.out.print("Jumlah Karyawan 	: ");ngarep.jmlk = scan.nextInt();
  						if(awal == null){
  							awal = ngarep;
  							akhir = ngarep;
  							akhir.kanan = null; 
  						}else{
  							ngarep.kanan = awal;
  							awal = ngarep;
  						}
  						break;
  					}
  					case 2 :{
  						simpul tengah = new simpul();
  						int js = hitung();
  						System.out.println("Menambah data ditengah");			
  						System.out.print("Nama  		 	: ");tengah.nama = scan.next();
  						System.out.print("alamat	 		: ");tengah.alamat = scan.next();
  						System.out.print("Jenis 		 	: ");tengah.jenis = scan.next();
  						System.out.print("Jumlah Karyawan 	: ");tengah.jmlk = scan.nextInt();
  						System.out.print("Tentukan lokasi :");
  							int l = scan.nextInt();
  							
  							if(l==1){
  								System.out.println("Lakukan penambahan diDepan");
  							}else if(l > js){
  								System.out.println("Lakukan penambahan diBelakang");
  							}else{
  							simpul anu = awal;
  							int i = 1;
  							while ((i<l-1)&&(anu != akhir)){
  								anu = anu.kanan;
  								i++;
  							}
  							tengah.kanan = anu.kanan;
  							anu.kanan = tengah;
  						}
  						break;
  					}
  					case 3 :{
  						simpul mburi = new simpul();
  						System.out.println("Menambah data diBelakang");			
  						System.out.print("Nama  		 	: ");mburi.nama = scan.next();
  						System.out.print("alamat	 		: ");mburi.alamat = scan.next();
  						System.out.print("Jenis 		 	: ");mburi.jenis = scan.next();
  						System.out.print("Jumlah Karyawan 	: ");mburi.jmlk = scan.nextInt();
  							if(awal == null){
  								awal = mburi;
  								akhir = mburi;
  								mburi.kanan = null; 
  							}else{
  								akhir.kanan = mburi;
  								akhir = mburi;
  								mburi.kanan = null;
  							}
  						break;
  					}
  					case 4 :{
  						System.out.println();
  						menu(usaha);
  						break;
  					}
  					default :
  						System.out.println("OJO NGAWUR !!!");
  				}
  		}while(pil!=4);
  	}
  	public static void cari(simpul usaha){
  		boolean ketemu = false;
  		int i = 1;
  		simpul nggolek = awal;
  		System.out.println("+++Mencari data+++");
  		System.out.print("Masukkan nama perusahaan :");
  		String nm = scan.next();
  		while(nggolek !=null){
  			if(!nggolek.nama.equals(nm)){
  				nggolek=nggolek.kanan;
  			}else{
  				System.out.println("Perusahaan yang anda cari ada pada urutan ke " +i);
				  System.out.println("---------------------------------------------------------------");
				  System.out.println("Menampilkan Data Perusahaan");
				  System.out.println("---------------------------------------------------------------");
				  System.out.println("No  Nama\tAlamat\tJenis usaha\tJumlah Karyawan");
				  System.out.println("---------------------------------------------------------------");
			    System.out.print((i)+"  ");
					System.out.print(nggolek.nama+"\t\t");
					System.out.print(nggolek.alamat+"\t\t");
					System.out.print(nggolek.jenis+"\t\t");
					System.out.println(nggolek.jmlk);
					nggolek = nggolek.kanan;
  				}
  			i++;
  			ketemu = true;
  			break;
  		}
  		if(ketemu!=true)
  			System.out.print("Data gak ada");
  		System.out.println();
  		menu(usaha);
  	}

  	public static void edit(simpul usaha){
      boolean ketemu = false;
      simpul ubah = awal;
      System.out.println("+++Edit data+++");
      System.out.print("Masukkan nama perusahaan yang akan diubah :");
      String nm = scan.next();
      while(ubah !=null){
        if(!ubah.nama.equals(nm)){
          ubah=ubah.kanan;
        }else{
              simpul baru = new simpul();
              System.out.println("Masukkan data baru");
              System.out.print("Nama        : ");baru.nama = scan.next();
              System.out.print("alamat      : ");baru.alamat = scan.next();
              System.out.print("Jenis       : ");baru.jenis = scan.next();
              System.out.print("Jumlah Karyawan   : ");baru.jmlk = scan.nextInt();
                ubah.nama = baru.nama;
                ubah.alamat = baru.alamat;
                ubah.jenis = baru.jenis;
                ubah.jmlk = baru.jmlk;
              System.out.println("data " + nm + "berhasil diubah");
              menu(usaha);
    	    }
        }
        if(ketemu!=true)
          System.out.print("Data gak ada");
        System.out.println();
        menu(usaha);
      }

  	public static void hapus(simpul usaha){
  	   if(awal == null){
          System.out.println("Maaf data masih kosong, hapus tidak bisa dilakukan !!!");
          menu(usaha);
       }else{
          System.out.print("Masukkan nama perusahaan yang akan dihapus : ");
          String hps = scan.next();
          if(awal == akhir){
            if(awal.nama.equals(hps)){
              System.out.println("Hapus data berhasil!!!");
                kosong();
                menu(usaha);
            }else
              System.out.println("data "+hps + "tidak ditemukan !!");
          }else if(awal.nama.equals(hps)){
            System.out.println("Hapus data berhasil");
              awal = awal.kanan;
          }else{
            simpul busek = awal;
            while(busek.kanan.nama.equals(hps)==false){
              busek = busek.kanan;
              if(busek.kanan == null)break;
            }
            if((busek==akhir)&&(akhir.nama.equals(hps)==false)){
              System.out.print("data " + hps + "gak ada !!");
            }else if(akhir.nama.equals(hps)){
              System.out.println("hapus data berhasil");
              busek.kanan = null;
              akhir = busek;
              menu(usaha);
            }else{
              System.out.println("hapus data berhasil");
              busek.kanan = busek.kanan.kanan;
              menu(usaha);
            }
          }
       }
  	}

  	public static void main(String[] ikhlaskanah) {
  		simpul usaha = new simpul();
  		kosong();
  		menu(usaha);
  	}

}