
public class Member {

	private String UName,password,email,phone,address,Image;
	
	public Member() {
		super();
	}

	public Member(String uname, String password, String email, String phone,String address_1,String image) {
		super();
		this.UName = uname;
		this.password = password;
		this.email = email;
		this.phone = phone;
		address = address_1;	
        Image= image;  }
	public String getUname()
	{
		return UName;
	}

	public void setUname(String uname) {
		this.UName = uname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address_1) {
		address = address_1;
	}

	public String getImage() {
		return Image;
	}

	public void setImage(String image) {
		Image = image;
	}

	
	
}
