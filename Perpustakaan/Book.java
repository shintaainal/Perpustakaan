package FirstClass.Perpustakaan;

public class Book {

	private String title, hapus;
	private String author;
	private boolean isPinjam, isHapus;

	public String getHapus() {

		return hapus;
	}

	public void setHapus(String hapus) {
		this.hapus = hapus;
	}

	public boolean isHapus() {
		return isHapus;
	}

	public void setHapus(boolean hapus) {
		isHapus = hapus;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public boolean isPinjam() {
		return isPinjam;
	}

	public void setPinjam(boolean isPinjam) {
		this.isPinjam = isPinjam;
	}

	public boolean isIshapus() {
		return isHapus;
	}

	public void setIshapus(boolean ishapus) {
		this.isHapus = ishapus;
	}
}