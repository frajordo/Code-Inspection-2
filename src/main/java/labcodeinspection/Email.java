package labcodeinspection;

import java.util.Locale;

/***
 * Class to represent a email
 * @author Los Pibes
 *
 */
public class Email {

	/**
	 * First Name owner
	 */
	private String m_firstName;
	
	/**
	 * Last Name owner
	 */
	private String m_lastName;
	
	/**
	 * Password to forbid use
	 */
	private String password;
	
	/**
	 * Department owner
	 */
	private String department;
	
	/**
	 * Default length for password
	 */
	private int defaultpasswordLength = 8;
	
	/**
	 * Email direction name
	 */
	private String email;


	/**
	 * getter for m_firtsName variable
	 * @return
	 */
	public String getM_firstName() {
		return m_firstName;
	}

	
	/**
	 * Constructor to set user name
	 * @param firstName
	 * @param lastName
	 */
	public Email(String firstName, String lastName) {
		this.m_firstName = firstName;
		this.m_lastName = lastName;
	}

	/**
	 * Method for show hole user information
	 */
	public void showInfo() {
		System.out.println("\nFIRST NAME= " + m_firstName + "\nLAST NAME= " + m_lastName);
		System.out.println("DEPARMENT= " + department + "\nEMAIL= " + email + "\nPASSWORD= " + password);
	}

	/**
	 * Set user department
	 * @param depChoice: options, possible values: sales, dev, acct
	 */
	public void setDeparment(int depChoice) {
		switch (depChoice) {
		case 1:
			this.department = "sales";
			break;
		case 2:
			this.department = "dev";
			break;
		case 3:
			this.department = "acct";
			break;
		default:
			this.department = "sales";
		}
	}

	/**
	 * Method to generate a random password
	 * @param length
	 * @return A string  
	 */
	private String randomPassword(int length) {
		String set = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890#$&@*";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * set.length());
			password[i] = set.charAt(rand);
		}
		return new String(password);
	}
	
	
	/**
	 * metod to generate a default email for user, m_firstName and m_lastName must be setted
	 */
	public void generateEmail() {
		this.password = this.randomPassword(this.defaultpasswordLength);
		this.email = this.m_firstName.toLowerCase(Locale.US) + this.m_lastName.toLowerCase(Locale.US) + "@" + this.department
				+ ".espol.edu.ec";
	}


	/**
	 * @return the m_lastName
	 */
	public String getM_lastName() {
		return m_lastName;
	}


	/**
	 * @param m_lastName the m_lastName to set
	 */
	public void setM_lastName(String m_lastName) {
		this.m_lastName = m_lastName;
	}


	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}


	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}


	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}


	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}


	/**
	 * @return the defaultpasswordLength
	 */
	public int getDefaultpasswordLength() {
		return defaultpasswordLength;
	}


	/**
	 * @param defaultpasswordLength the defaultpasswordLength to set
	 */
	public void setDefaultpasswordLength(int defaultpasswordLength) {
		this.defaultpasswordLength = defaultpasswordLength;
	}


	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}


	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	/**
	 * @param m_firstName the m_firstName to set
	 */
	public void setM_firstName(String m_firstName) {
		this.m_firstName = m_firstName;
	}
	
	
	
}
