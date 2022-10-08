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
 * Class used to represent a course
 * 
 * @author Naveen Reddy
 * @since 2022-03-06
 * @version 1.0.0
 */
public class Course {

	private String name;
	private String courseCode;
	private String description;
	private Textbook txtBook;
	private double credits;

	/**
	 * constructor without parameters
	 * 
	 */
	Course() {

		this.name = "TBD";
		this.courseCode = "TBD";
		this.description = " ";
		this.txtBook = null;
		this.credits = 0.0;

	}

	/**
	 * constructor with parameters
	 * @param name
	 * @param courseCode
	 * @param description
	 * @param txtBook
	 * @param credits
	 */
	Course(String name, String courseCode, String description, Textbook txtBook, double credits) {
		super();
		if (name != null) {
			this.name = name;
		}

		this.name = name;
		this.courseCode = courseCode;
		this.description = description;
		this.txtBook = txtBook;
		if (credits >= 0)
			this.credits = credits;
	}
	/**
	 * Copy constructor
	 * 
	 * @param course object which to perform a deep copy on
	 */

	Course(Course CourseToCopy) {

		if (CourseToCopy == null) {
			System.out.println("Fatal error!");
			System.exit(0);
		}
		this.name = CourseToCopy.name;
		this.courseCode = CourseToCopy.courseCode;
		this.description = CourseToCopy.description;
		this.txtBook = CourseToCopy.txtBook;
		this.credits = CourseToCopy.credits;
	}



	/**
	 * ToString method to print output
	 * 
	 * @param all values course, coursecode,credit, description
	 */
	@Override
	public String toString() {
		return "Course :-\n COURSE : " + name + "\n CODE : " + courseCode + "\n CREDITS : " + credits
				+ "\n DESCRIPTION : " + description + "\n ===== TEXTBOOK=====\n" + txtBook + ".";
	}

	/**
	 * Equals method
	 * 
	 * @param Course object which perform equal oprertion among two objects
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return Objects.equals(courseCode, other.courseCode)
				&& Double.doubleToLongBits(credits) == Double.doubleToLongBits(other.credits)
				&& Objects.equals(description, other.description) && Objects.equals(name, other.name)
				&& Objects.equals(txtBook, other.txtBook);
	}
	/**
	 * Return name
	 * 
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * Set name
	 * 
	 * @param name
	 */

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Return coursecode
	 * 
	 * @return coursecode
	 */
	public String getCourseCode() {
		return courseCode;
	}
	/**
	 * Set coursecode
	 * 
	 * @param coursecode
	 */
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	/**
	 * Return description
	 * 
	 * @return description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * Set description
	 * 
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * Return textbook
	 * 
	 * @return textbook
	 */
	public Textbook getTxtBook() {
		return txtBook;
	}

	/**
	 * Set textbook
	 * 
	 * @param textbook
	 */
	public void setTxtBook(Textbook txtBook) {
		this.txtBook = txtBook;
	}

	/**
	 * Return credit
	 * 
	 * @return credit
	 */
	public double getCredits() {
		return credits;
	}

	/**
	 * Set credit
	 * 
	 * @param credit
	 */
	public void setCredits(double credits) {
		this.credits = credits;
	}

}
