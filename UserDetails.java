package MiniProject2;

public class UserDetails {
	
	private String 	Name;
	private String 	Number;
	private int 	Age;
	private String 	UserName;
	private String  Password;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getNumber() {
		return Number;
	}

	public void setNumber(String number) {
		Number = number;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public UserDetails(String name, String number, int age, String userName, String password) 
	{
		super();
		this.Name = name;
		this.Number = number;
		this.Age = age;
		this.UserName = userName;
		this.Password = password;
	}

	public UserDetails() 
	{ 
		super(); 
	}

	 

	
}
