package entity;

public class Staff {
	
	private long staffId;
	private String firstName;
	private String lastName;
	private Phone phone;
	private String email;
	private Staff manager;
	
	
	public Staff() {
	}


	public Staff(long staffId, String firstName, String lastName, Phone phone, String email, Staff manager) {
		super();
		this.staffId = staffId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		this.manager = manager;
	}
	
	public Staff(long staffId, String firstName, String lastName, Phone phone, String email) {
		super();
		this.staffId = staffId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
	}
	public Staff(long staffId) {
		this.staffId = staffId;
	}
	

	/**
	 * @return the staffId
	 */
	public long getStaffId() {
		return staffId;
	}


	/**
	 * @param staffId the staffId to set
	 */
	public void setStaffId(long staffId) {
		this.staffId = staffId;
	}


	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}


	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}


	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	/**
	 * @return the phone
	 */
	public Phone getPhone() {
		return phone;
	}


	/**
	 * @param phone the phone to set
	 */
	public void setPhone(Phone phone) {
		this.phone = phone;
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
	 * @return the manager
	 */
	public Staff getManager() {
		return manager;
	}


	/**
	 * @param manager the manager to set
	 */
	public void setManager(Staff manager) {
		this.manager = manager;
	}


	@Override
	public String toString() {
		return "Staff [staffId=" + staffId + ", firstName=" + firstName + ", lastName=" + lastName + ", phone=" + phone
				+ ", email=" + email + ", manager=" + manager + "]";
	}

	
	
}
