

class DataPesanan{
	int total;
	Penjahit nJahit;
	public DataPesanan(int total , String nama){
		this.total = total;
		nJahit = new Penjahit();
		this.nJahit.nama = nama;
	}

}