package FirstClass.Perpustakaan;

import java.util.Map;

public class Perpustakaan {

	private Map<String, Book> daftarBuku;
	private Map<String, Peminjam> daftarPinjam;

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

