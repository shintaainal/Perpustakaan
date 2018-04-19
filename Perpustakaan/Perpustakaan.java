package FirstClass.Perpustakaan;

import java.util.Map;

public class Perpustakaan {

	private Map<String, Book> daftarBuku;
	private Map<String, Peminjam> daftarPinjam;
	private Map<String, Book> bukuPinjaman;

	//public Map<String, Peminjam> getBukuPinjaman() {
	//	return bukuPinjaman;
	//}

	//public void setBukuPinjaman(Map<String, Peminjam> bukuPinjaman) {
	//	this.bukuPinjaman = bukuPinjaman;
//	}

	public Map<String, Peminjam> getDaftarPinjam(){
		return daftarPinjam;
	}
	public void setDaftarPinjam(Map<String, Peminjam> daftarPinjam){
		this.daftarPinjam = daftarPinjam;

	}
	public Map<String, Book> getDaftarBuku() {
		return daftarBuku;
	}

	public void setDaftarBuku(Map<String, Book> daftarBuku) {
		this.daftarBuku = daftarBuku;
	}
	}

