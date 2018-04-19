package FirstClass.Perpustakaan;

import java.util.Map;

public class Perpustakaan {
	private String namaPerpustakaan;

	private Map<String, Book> daftarBuku;

	public Map<String, Book> getDaftarBuku() {
		return daftarBuku;
	}

	public void setDaftarBuku(Map<String, Book> daftarBuku) {
		this.daftarBuku = daftarBuku;
	}

	public String getNamaPerpustakaan() {
		return namaPerpustakaan;
	}

	public void setNamaPerpustakaan(String namaPerpustakaan) {

		this.namaPerpustakaan = namaPerpustakaan;
	}

}
