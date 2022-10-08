/**
 * Naveen Reddy
 * Dated : 2022-03-06
 * C0838989
 * Test-1
 * Question-1
 */
package q1;

import java.util.Objects;

/**
 * Class used to represent a Textbook
 * 
 * @author Naveen Reddy
 * @since 2022-03-06
 * @version 1.0.0
 */
public class Textbook {

	private String title;
	private String publisher;
	private Isbn isbn;
	private int edition;
	private int numPages;

	/**
	 * constructor without parameters.
	 * 
	 * @param title, publisher, isbn, edition, numPages
	 */
	public Textbook() {

		this.title = "TBD";
		this.publisher = "TBD";
		this.isbn = null;
		this.edition = 0;
		this.numPages = 0;

	}

	/**
	 * constructor with parameters
	 * @param title
	 * @param publisher
	 * @param isbn
	 * @param edition
	 * @param numPages
	 */
	public Textbook(String title, String publisher, Isbn isbn, int edition, int numPages) {

		this.title = title;
		this.publisher = publisher;
		this.isbn = isbn;
		this.edition = edition;
		this.numPages = numPages;
	}
	/**
	 * Copy constructor
	 * 
	 * @param Textbook object which to perform a deep copy on
	 */

	public Textbook(Textbook TextbookToCopy) {

		if (TextbookToCopy == null) {
			System.out.println("Fatal error!");
			System.exit(0);
		}
		this.title = TextbookToCopy.title;
		this.publisher = TextbookToCopy.publisher;
		this.isbn = TextbookToCopy.isbn;
		this.edition = TextbookToCopy.edition;
		this.numPages = TextbookToCopy.numPages;
	}

	/**
	 * ToString method to print all values in Textbook
	 * 
	 * @param all values title, publisher, isbn, edition, pages
	 */
	@Override
	public String toString() {
		return "Textbook :- \n TITLE: " + title + "\n PUBLISHER : " + publisher + "\n ISBN-13 : " + isbn + "\n EDITION : "
				+ edition + "\n PAGES : " + numPages ;
	}

	

	/**
	 * Equals method
	 * 
	 * @param Textbook object which perform equal oprertion among two objects
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Textbook other = (Textbook) obj;
		return edition == other.edition && Objects.equals(isbn, other.isbn) && numPages == other.numPages
				&& Objects.equals(publisher, other.publisher) && Objects.equals(title, other.title);
	}


	/**
	 * Return title
	 * 
	 * @return title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * Set tile
	 * 
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * Return publisher
	 * 
	 * @return publisher
	 */
	public String getPublisher() {
		return publisher;
	}

	/**
	 * Set publisher
	 * 
	 * @param publisher
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	/**
	 * return isbn
	 * 
	 * @return isbn
	 */

	public Isbn getIsbn() {
		return isbn;
	}
	/**
	 * Set isbn
	 * 
	 * @param isbn
	 */
	public void setIsbn(Isbn isbn) {
		this.isbn = isbn;
	}

	/**
	 * return edition
	 * 
	 * @return edition
	 */
	public int getEdition() {
		return edition;
	}
	/**
	 * Set edition
	 * 
	 * @param edition
	 */
	public void setEdition(int edition) {
		this.edition = edition;
	}
	/**
	 * return getnumpages
	 * 
	 * @return numpages
	 */
	public int getNumPages() {
		return numPages;
	}
	/**
	 * Set numpages
	 * 
	 * @param numpages
	 */
	public void setNumPages(int numPages) {
		this.numPages = numPages;
	}

}
