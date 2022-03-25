package addressbook;

public class User {
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zipNo;
	private String mobileNo;
	private String email;
	public User(String string, String string2, String string3, String string4, String string5, String string6,
			String string7, String string8) {
		
	}
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", zipNo=" + zipNo + ", mobileNo=" + mobileNo + ", email=" + email + "]";
	}
	
}
