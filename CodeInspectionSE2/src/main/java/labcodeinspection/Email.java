package labcodeinspection;

import java.util.Locale;

public class Email {

	private String mfirstName;
	private String mlastName;
	private String password;
	private String department;
	private int defpasswLength = 8;
	private String email;

	/**This constructor will save the essential information to recognize the use.
	 * @param firstName and @param lastName we allow to know the full name the user
	 */
	public Email(final String firstName, final String lastName) {
		this.setMfirstName(firstName);
		this.setMlastName(lastName);
	}

	/**This method show of information save in the class
	 * @param void
	 */
	public void showInfo() {
		System.out.println("\nFIRST NAME= " + getMfirstName() + "\nLAST NAME= " + getMlastName());
		System.out.println("DEPARMENT= " + getDepartment() + "\nEMAIL= " + getEmail() + "\nPASSWORD= " + getPassword());
	}

	/**This method allow to save the deparment in the class with a number choosed
	 * @param depChoise
	 */
	public void setDeparment(final int depChoice) {
		switch (depChoice) {
		case 1:
			this.setDepartment("sales");
			break;
		case 2:
			this.setDepartment("dev");
			break;
		default:
			this.setDepartment("acct");
			break;
		
		}
	}

	private String randomPassword(final int length) {
		final String set = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890#$&@*";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			final int rand = (int) (Math.random() * set.length());
			password[i] = set.charAt(rand);
		}
		return new String(password);
	}

	/**This method allow generate of email in base of the information saved.
	 */
	public void generateEmail() {
		this.setPassword(this.randomPassword(this.getDefpasswLength()));
		this.setEmail(this.getMfirstName().toLowerCase(Locale.getDefault()) + this.getMlastName().toLowerCase(Locale.getDefault()) + "@" + this.getDepartment()
				+ ".espol.edu.ec");
	}

	public String getMfirstName() {
		return mfirstName;
	}

	public void setMfirstName(final String mfirstName) {
		this.mfirstName = mfirstName;
	}

	public String getMlastName() {
		return mlastName;
	}

	public void setMlastName(final String mlastName) {
		this.mlastName = mlastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(final String password) {
		this.password = password;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(final String department) {
		this.department = department;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	public int getDefpasswLength() {
		return defpasswLength;
	}

	public void setDefpasswLength(final int defpasswLength) {
		this.defpasswLength = defpasswLength;
	}
	
	
}
