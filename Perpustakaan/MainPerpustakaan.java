package FirstClass.Perpustakaan;

import org.omg.PortableInterceptor.ServerRequestInfo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MainPerpustakaan {

    Scanner input = new Scanner(System.in);
    Perpustakaan perpus = new Perpustakaan();

    Map<String, Book> daftarBuku = new LinkedHashMap<String, Book>();
    Map<String, Peminjam> daftarPinjam = new LinkedHashMap<String, Peminjam>();

    Book book = new Book();
    Peminjam pinjam = new Peminjam();

    boolean isHapus = true;

    public void isiDataBuku() {

        System.out.println("WELCOME, tambah data? y/t");
        String isTambah = input.next();

        //Tambah data
        if (isTambah.equals("y")) {
            while (isTambah.equals("y")) {
                System.out.println(" ***********************************************************");
                System.out.println(" Tambah Data Buku ! ");
                System.out.print(" Judul Buku : ");

                Book book = new Book();
                book.setTitle(input.next());

                System.out.print(" Pengarang : ");
                book.setAuthor(input.next());

                System.out.print(" No ISBN : ");
                daftarBuku.put(input.next(), book);

                System.out.print(" Tambah data baru kembali ?(jawab dengan y/t : ");
                isTambah = input.next();

            }

            for (Map.Entry<String, Book> entry : daftarBuku.entrySet()) {
                System.out.println(entry.getKey());
                Book buku = entry.getValue();
                System.out.println(" Judul  Buku : " + buku.getTitle() + "  pengarang " + buku.getAuthor());
            }
        } else {
            System.out.println("THANK YOU");
        }
    }

    public void hapusDataBuku() {
        String Hapus;

        System.out.println(" ***********************************************************");
        System.out.println("Hapus buku? ");

        Hapus = input.next();

        if (Hapus.equals("y")) {
            System.out.println("Masukan ISBN: ");
            daftarBuku.remove(input.next());

            for (Map.Entry<String, Book> entry : daftarBuku.entrySet()) {
                System.out.println(entry.getKey());
                Book buku = entry.getValue();
                System.out.println(" Judul  Buku : " + buku.getTitle() + "  pengarang " + buku.getAuthor());
            }
        } else {
            System.out.println("Data tidak ditemukan!");
        }
        System.out.println("____________________________________________________________________ ");
    }

    public void updateDataBuku() {

        System.out.println("Update Data? ");
        String upd = input.next();

        while (upd.equals("y")) {

            //Print data sebelumnya
            System.out.println("Data Sebelumnya: ");
            for (Map.Entry<String, Book> entry : daftarBuku.entrySet()) {
                System.out.println(entry.getKey());
                Book buku = entry.getValue();
                System.out.println(" Judul  Buku : " + buku.getTitle() + "  pengarang " + buku.getAuthor());
            }
            System.out.println("");
            System.out.println("____________________________________________________________________ ");
            System.out.println("");

            //Update data
            System.out.println("Pilih ISBN data update : ");
            daftarBuku.put(input.next(), book);

            System.out.print(" Judul Buku : ");
            book.setTitle(input.next());

            System.out.print(" Pengarang : ");
            book.setAuthor(input.next());

            System.out.print(" Update lagi?(jawab dengan y/t : ");
            upd = input.next();

            System.out.println("____________________________________________________________________ ");
            System.out.println("Data Baru ");
            for (Map.Entry<String, Book> entry : daftarBuku.entrySet()) {
                System.out.println(entry.getKey());
                Book buku = entry.getValue();
                System.out.println(" Judul  Buku : " + buku.getTitle() + "  pengarang " + buku.getAuthor());

            }
        }
    }

    public void tambahDataPeminjam() {
        //tambah data peminjam
        System.out.println("____________________________________________________________________ ");
        System.out.println(" Welcome ! Tambah data peminjam? y/t");
        String isi = input.next();

        if(isi.equals("y")) {

            while (isi.equals("y")) {
                System.out.println("____________________________________________________________________ ");
                System.out.println(" Tambah Data Peminjam ! ");

                Peminjam pinjam = new Peminjam();

                System.out.print(" Nama Peminjam : ");
                pinjam.setNamaPeminjam(input.next());

                System.out.print(" Alamat : ");
                pinjam.setAlamatPeminjam(input.next());

                System.out.print(" ID Peminjam : ");
                daftarPinjam.put(input.next(), pinjam);

                System.out.print(" Tambah data baru kembali ?(jawab dengan y/t : ");
                isi = input.next();
            }
            for (Map.Entry<String, Peminjam> entry : daftarPinjam.entrySet()) {
                System.out.println(entry.getKey());
                Peminjam pinjam = entry.getValue();
                System.out.println(" Nama  : " + pinjam.getNamaPeminjam() + "  Alamat :" + pinjam.getAlamatPeminjam());
            }

        }else {
            System.out.println("Thank you!");
        }
    }

    public void pinjamBuku(){

        System.out.println("Apakah ada yang mau pinjam buku? y/t");
        String isi = input.next();

        if(isi.equals("y")){

        }
    }

    public static void main(String[] args) {

        MainPerpustakaan obj = new MainPerpustakaan();

        obj.isiDataBuku();
        obj.hapusDataBuku();
        obj.updateDataBuku();
        obj.tambahDataPeminjam();
    }
}


