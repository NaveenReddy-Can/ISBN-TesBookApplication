/**
 * Naveen Reddy
 * Dated : 2022-03-06
 * C0838989
 * Test-1
 * Question-1
 */
package q1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringTokenizer;

/**
 * Class used to represent a isbn
 * 
 * @author Naveen Reddy
 * @since 2022-03-06
 * @version 1.0.0
 */
public class Isbn {

	String prefix;
	String registrationGroup;
	String registrant;
	String publication;
	String checkDigit;
	String seperator;
	String isbnnum;
	String store;
	String validPefix = "978";
	String validPefix1 = "987";
	int validDigits;
	int length = 0;
	int seperaterCount = 0;

	/**
	 * constructor with parameters.
	 * 
	 * @param isbn
	 */
	Isbn(String isbn) {

		this.isbnnum = isbn;
		if (isbn.contains(" ") && isbn.contains("-")) {
			this.seperator = "-";
		} else if (isbn.contains("-")) {
			this.seperator = "-";
		} else {
			this.seperator = " ";
		}

		if (isValidISBN(isbn) == false) { // calls the isvalidisbn method and checks weather a valid string or not if it
											// is valid continues the execution if not valid terminates the program.
			System.exit(0);
		}
		StringTokenizer st = new StringTokenizer(isbn, this.seperator, false); // tokenizing the string by seperator
		List<String> isbnarray = new ArrayList<String>(); // storing the values into list array type

		while (st.hasMoreTokens()) { // while condition to check it has more tokens or not in the String (it is
										// predefined method in string tokenizer).
			store = st.nextToken();
			isbnarray.add(this.store); // storing each token into list array
			for (int i = 0; i < store.length(); i++) {
				char a = this.store.charAt(i);
				boolean b = Character.isDigit(a); // checking wheathe the character is numerical digit or not
				if (b == false) { // if it is not a digit, terminates the program
					System.out.println(
							"please enter only numerical digits(do not enter special characters and alphabets ;)");
					System.exit(0);
				}

			}

		}

		char sep = seperator.charAt(0); // stroing seperater into sep
		for (int i = 0; i < isbn.length(); i++) {
			if (isbn.charAt(i) == sep) { // checking how many seperators are there in the string
				seperaterCount++; // counting seperator occurance using increment operator
			}
		}
		length = isbnnum.length(); // length of the entered string
		validDigits = isbnnum.length() - seperaterCount; // length of valid digits exclding seperators.

		String tempPrefix = isbnarray.get(0); // storing prefix values in tempprefix

		if (tempPrefix.length() <= 3) { // if length of prefix is < 3 it is vallid
			if (tempPrefix.equals(validPefix) || tempPrefix.equals(validPefix1)) { // prefix is only two type so
																					// checking wheather given is in
																					// those are not if not raise error
																					// meassge.
				this.prefix = isbnarray.get(0);
			} else {
				System.out
						.println("the string prefix should be 978 or 987, but you have entered : " + isbnarray.get(0));
			}
		} else {
			System.out.println("the prefix shoul be 3 digits you entered :" + isbnarray.get(0)); // if prefix is
																									// greaterthan 3
																									// digits it shows
																									// error message
		}

		String tempRegistrationGroup = isbnarray.get(1); // storing registrationgroup values in tempregistrationgroup
		if (tempRegistrationGroup.length() <= 5) { // checks length is lessthan 5 or equal
			this.registrationGroup = isbnarray.get(1);
		} else {
			System.out.println(
					"the string registrationGroup should be valid, it shoulbe greater than 1 and less than 5 digits, but you have entered : "
							+ isbnarray.get(1));
		}

		String tempRegistrant = isbnarray.get(2); // storing registrant values in tempregistrant
		if (tempRegistrant.length() >= 2 && tempRegistrant.length() <= 7) { // checks length is graterthan 2 or equal
																			// and lessthan or equals to 7
			this.registrant = isbnarray.get(2);
		} else {
			System.out.println(
					"the string registrant should be valid, it shoulbe greater than 2 and less than 7 digits, but you have entered : "
							+ isbnarray.get(2));
		}

		String tempPublication = isbnarray.get(3); // storing publication values in temppublication
		if (tempPublication.length() >= 1 && tempPublication.length() <= 6) { // checks length is graterthan 1 or equal
																				// and lessthan or equals to 6
			this.publication = isbnarray.get(3);
		} else {
			System.out.println(
					"the string publication should be valid, it shoulbe greater than 1 and less than 6 digits, but you have entered : "
							+ isbnarray.get(3));
		}

		String tempCheckDigit = isbnarray.get(4); // storing checkdigit values in tempcheckdigit
		if (tempCheckDigit.length() <= 1) { // checks length equal and lessthan or equals to 1
			this.checkDigit = isbnarray.get(4);
		} else {
			System.out.println(
					"the string CheckDigit should be valid, it shoulbe be single digit, but you have entered : "
							+ isbnarray.get(4));
		}

	}

	/**
	 * constructor with parametors
	 * 
	 * @param prefix
	 * @param registrationGroup
	 * @param registrant
	 * @param publication
	 * @param checkDigit
	 * @param seperator
	 */
	public Isbn(String prefix, String registrationGroup, String registrant, String publication, String checkDigit,
			String seperator) {
		super();
		this.prefix = prefix;
		this.registrationGroup = registrationGroup;
		this.registrant = registrant;
		this.publication = publication;
		this.checkDigit = checkDigit;
		this.seperator = seperator;
	}

	/**
	 * Copy constructor
	 * 
	 * @param isbn object which to perform a deep copy on
	 */
	Isbn(Isbn isbnToCopy) {

		if (isbnToCopy == null) {
			System.out.println("Fatal error!");
			System.exit(0);
		}
		this.prefix = isbnToCopy.prefix;
		this.registrationGroup = isbnToCopy.registrationGroup;
		this.registrant = isbnToCopy.registrant;
		this.publication = isbnToCopy.publication;
		this.checkDigit = isbnToCopy.checkDigit;
		this.seperator = isbnToCopy.seperator;

	}

	/**
	 * is valid method
	 * 
	 * @param string isbn which to perform valid or not
	 */
	static boolean isValidISBN(String isbn) {
		String validSeperator = "-";
		int validcountseperator = 0;
		char lastdigit = isbn.charAt(isbn.length() - 1); // storing last digit of string
		String s = String.valueOf(lastdigit);
		int lastDigit = Integer.parseInt(s);
		if (isbn.contains(" ") && isbn.contains("-")) {
			System.out.println("please enter either '-' or ' ', but not both"); // error meassage if user enters both
																				// seperators
			System.exit(0);
		} else if (isbn.contains("-")) {
			validSeperator = "-";
		} else {
			validSeperator = " ";
		}

		char sep = validSeperator.charAt(0);
		for (int i = 0; i < isbn.length(); i++) {
			if (isbn.charAt(i) == sep) {
				validcountseperator++; // count of seperator
			}
		}
		if (validcountseperator > 4) {
			System.out.println("please enter correct number of sepereators");
			System.exit(0);
		}
		if (lastDigit == calculateCheckDigit(isbn)) { // comparing with last digit is equals to calculatedcheck digit
			return true;
		}
		return false;
	}

	/**
	 * calculatecheckdigit method
	 * 
	 * @param isbn
	 * @return r
	 */
	public static int calculateCheckDigit(String isbn) {

		String isbnnum = isbn; // retriving isbn
		String seperator;
		if (isbnnum.contains(" ") && isbnnum.contains("-")) {
			seperator = "-";
		} else if (isbnnum.contains("-")) {
			seperator = "-";
		} else {
			seperator = " ";
		}

		StringTokenizer stringtoken = new StringTokenizer(isbn, seperator);
		List<String> isbnTokenList = new ArrayList<String>(); // String array list to store tokens of string
		List<String> isbnCharList = new ArrayList<String>(); // String array list to store characters of a string from
																// tokens
		String token;
		char a;
		boolean b;
		while (stringtoken.hasMoreTokens()) { // tokenizing into token and storing values into token
			token = stringtoken.nextToken();
			isbnTokenList.add(token);
			for (int i = 0; i < token.length(); i++) {
				a = token.charAt(i);
				b = Character.isDigit(a);
				if (b == false) {
					System.out.println(
							"please enter only valid numerical digits [do not enter alphabets,specialcharacters, blank spaces]");
					System.exit(0);
				}
				String s = String.valueOf(a);
				isbnCharList.add(s); // adding characters of tokens from array list

			}
		}
		int size = isbnCharList.size();
		int[] singleDigit = new int[size]; // int array to store
		for (int digit = 0; digit < size; digit++) {
			singleDigit[digit] = Integer.parseInt(isbnCharList.get(digit)); // stored single digit from string

		}
		int r = (10 - (singleDigit[0] + 3 * singleDigit[1] + singleDigit[2] + 3 * singleDigit[3] + singleDigit[4]
				+ 3 * singleDigit[5] + singleDigit[6] + 3 * singleDigit[7] + singleDigit[8] + 3 * singleDigit[9]
				+ singleDigit[10] + 3 * singleDigit[11]) % 10); // formula given in the question to calculate r value

		return r;
	}

	/**
	 * Return prefix
	 * 
	 * @return prefix
	 */
	public String getPrefix() {
		return prefix;
	}

	/**
	 * Set prefix
	 * 
	 * @param prefix
	 */
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	/**
	 * Return registration
	 * 
	 * @return registrationgroup
	 */
	public String getRegistrationGroup() {
		return registrationGroup;
	}

	/**
	 * Set registrationgroup
	 * 
	 * @param registrationgroup
	 */
	public void setRegistrationGroup(String registrationGroup) {
		this.registrationGroup = registrationGroup;
	}

	/**
	 * Return registration
	 * 
	 * @return registration
	 */

	public String getRegistrant() {
		return registrant;
	}

	/**
	 * Set registration
	 * 
	 * @param registration
	 */
	public void setRegistrant(String registrant) {
		this.registrant = registrant;
	}

	/**
	 * Return publlication
	 * 
	 * @return publication
	 */
	public String getPublication() {
		return publication;
	}

	/**
	 * Set publication
	 * 
	 * @param publication
	 */
	public void setPublication(String publication) {
		this.publication = publication;
	}

	/**
	 * Return checkdigit
	 * 
	 * @return checkdigit
	 */
	public String getCheckDigit() {
		return checkDigit;
	}

	/**
	 * Set checkdigit
	 *
	 * @param checkdigit
	 */
	public void setCheckDigit(String checkDigit) {
		this.checkDigit = checkDigit;
	}

	/**
	 * Return seperator
	 * 
	 * @return seperator
	 */
	public String getSeperator() {
		return seperator;
	}

	/**
	 * Set seperator
	 * 
	 * @param seperator
	 */
	public void setSeperator(String seperator) {
		this.seperator = seperator;
	}

	/**
	 * Equals method
	 * 
	 * @param isbn object which perform equal oprertion among two objects
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Isbn other = (Isbn) obj;
		return Objects.equals(checkDigit, other.checkDigit) && Objects.equals(prefix, other.prefix)
				&& Objects.equals(publication, other.publication) && Objects.equals(registrant, other.registrant)
				&& Objects.equals(registrationGroup, other.registrationGroup)
				&& Objects.equals(seperator, other.seperator);
	}

	/**
	 * ToString method to print all values in isbn class
	 * 
	 * @param all values prefix, registrationgroup,registrant, publication,
	 *            checkdigit, edition, seperator
	 * 
	 */
	@Override
	public String toString() {
		return " ISBN number entered : " + isbnnum + " \nThe count of all digits : " + length
				+ "\nThe count of valid digits : " + validDigits + " \nThe count of seperator : " + seperaterCount
				+ "\nISBN [prefix=" + prefix + ", registrationGroup=" + registrationGroup + ", registrant=" + registrant
				+ ", publication=" + publication + ", checkDigit=" + checkDigit + ", seperator=" + seperator + "]";
	}

}
