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
public class CourseDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		 Course c1 = new Course();
		 Isbn isbn = new Isbn("978-0-13-404167-4");
		 Textbook t1 = new Textbook("Absolute JAVA ","Pearson",isbn,6,705);
		 Course c2 = new Course("CSAC","CB08C","written by walter Savitch",t1,4.0);
		 Course copy = new Course(c2);
		 System.out.println("");
     	 System.out.println(" Course 1 is equals with Course 2 :" +c2.equals(c1));
     	 System.out.println("");
		
		 System.out.println(" CourseDemo : \n " +c2.toString());	
		 System.out.println("");
	
	     System.out.println("\n Copy constructor of c2 : "+ copy.toString());
	     System.out.println("");
		
	
		
		
	}
}
