package FirstClass.Perpustakaan;

import java.util.Map;

public class Peminjam {

    private String idPeminjam, namaPeminjam, alamatPeminjam;


    public String getIdPeminjam() {
        return idPeminjam;
    }

    private Map<String, Book> daftarBuku;

    public Map<String, Book> getDaftarBuku() {
        return daftarBuku;
    }

    public void setDaftarBuku(Map<String, Book> daftarBuku) {
        this.daftarBuku = daftarBuku;
    }

    public void setIdPeminjam(String idPeminjam) {
        this.idPeminjam = idPeminjam;
    }

    public String getNamaPeminjam() {
        return namaPeminjam;
    }

    public void setNamaPeminjam(String namaPeminjam) {
        this.namaPeminjam = namaPeminjam;
    }

    public String getAlamatPeminjam() {
        return alamatPeminjam;
    }

    public void setAlamatPeminjam(String alamatPeminjam) {
        this.alamatPeminjam = alamatPeminjam;
    }
}
