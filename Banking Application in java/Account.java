
// Account details are mapping 

public class Account {
	private String firstname;
	private String lastname;
	private int id;
	private String email;
	private int password;
	
	Account() {}

	// Account details are mapping using constructors

	public Account(String firstname, String lastname, int id, String email, int password) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.id = id;
		this.email = email;
		this.password = password;
	}
	
	//used getters and setters
	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	
	
}
