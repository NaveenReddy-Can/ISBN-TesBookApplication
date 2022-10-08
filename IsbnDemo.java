/**
 * Naveen Reddy
 * Dated : 2022-03-06
 * C0838989
 * Test-1
 * Question-1
 */
package q1;

/**
 * @author Naveen Reddy
 *
 */
public class IsbnDemo {
	@SuppressWarnings("static-access")
	public static void main( String[] args) {
		Isbn isbn = new Isbn("978-1-4088-5025-1"); // creating instance variable for isbn
		System.out.println("isbn :" +isbn.toString());
		 System.out.println("");
		System.out.println("isbn isvalid: "+isbn.isValidISBN("978-1-4088-5025-1") );
		 System.out.println("");
		System.out.println("ISBN calculated : " +isbn.calculateCheckDigit("978-1-4088-5025-1"));
		 System.out.println("");
		System.out.println("ISBN equals with another : " +isbn.equals(isbn));
	}

}
