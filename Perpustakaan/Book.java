package FirstClass.Perpustakaan;

public class Book {

	private String title;
	private String author;
	private boolean isPinjam;
	private boolean isHapus;

	public boolean isPinjam() {
		return isPinjam;
	}

	public void setPinjam(boolean pinjam) {
		isPinjam = pinjam;
	}

	public Book() {
		this.isPinjam = false;
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

}