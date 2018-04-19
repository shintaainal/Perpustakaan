package FirstClass.Perpustakaan;

import sun.security.util.Pem;

import java.util.Map;

public class Perpustakaan {

	//Book buku = new Book();

	private Map<String, Book> daftarBuku;
	private Map<String, Peminjam> daftarPinjam;
	private Map<String, Book> bukuDiPinjam;


	public Map<String, Book> getBukuDiPinjam() {
		return bukuDiPinjam;
	}

	public void setBukuDiPinjam(Map<String, Book> bukuDiPinjam) {
		this.bukuDiPinjam = bukuDiPinjam;
	}

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

