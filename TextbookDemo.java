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
public class TextbookDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Textbook t1 = new Textbook();
		 Isbn isbn = new Isbn("978-0-13-404167-4");  // creating instance variable for isbn
		 Textbook t2 = new Textbook(" Head First Java", "Head First Labs",isbn,2,700);  // creating instance variable for textbook
		 Textbook t3 = new Textbook(" Head First Java", "Head First Labs",isbn,2,700); //// creating instance variable for textbook
		 Textbook copyConstructor  = new Textbook(t2);
		 System.out.println("");
		 System.out.println("TEXTBOOK DEMO  :\n " + t2.toString());	
		 System.out.println("");
		// System.out.println("TEXTBOOK DEMO :\n " + t1.toString());	
		 System.out.println(" Textbook 3 is equals with Textbook 2 : " +t3.equals(t2));
		 System.out.println("");
		 
		 System.out.println("Copy constructor : "+ copyConstructor.toString());
		 System.out.println("");
		
	}

}
