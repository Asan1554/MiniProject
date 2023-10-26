package MiniProject2;

import java.util.LinkedList;
import java.util.Scanner;

public class Reservation {
	
	public static LinkedList<Reservation> Reserve=new LinkedList<>(); 
	
	private static LinkedList<UserDetails> Users=new LinkedList<>();
	
	private int reservationid;
	private String Name;
	private String BusName;
	@Override
	
	public String toString() {
		return "Reservation [reservationid=" + reservationid + ", Name=" + Name + ", BusName=" + BusName + "]";
	}
	
	
	public Reservation(int reservationid, String name, String busName) 
	{
		 
		this.reservationid = reservationid;
		Name = name;
		BusName = busName;
	}


	public int getReservationid() {
		return reservationid;
	}


	public void setReservationid(int reservationid) {
		this.reservationid = reservationid;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getBusName() {
		return BusName;
	}


	public void setBusName(String busName) {
		BusName = busName;
	}
	public Reservation()

	{
		super();
	}

	Scanner sc=new Scanner(System.in);
	UserDetails user   = 	new UserDetails();
	
	public void NewUserid()
	{	
	System.out.println("Enter your name");
	String Name=sc.nextLine();
	System.out.println("Enter your number");
	String Number=sc.next();
	System.out.println("Enter your age");
	int Age=sc.nextInt();
	System.out.println("Create new User name");
	String Username=sc.next();
	System.out.println("Create new password");
	String Password=sc.next();
	UserDetails User= new UserDetails(Name, Number, Age, Username, Password);
	Users.add(User);	
	System.out.println("Successfully Registered.");
	};
	public void UserLogin()

	{
		System.out.println("Enter User Name");
		String UserName=sc.next ();
		System.out.println("Enter your Password");
		String Password=sc.next ();
		String findusername=finduser(UserName,Password);
		if(findusername!=null)
		{
			System.out.println("Hi "+ findusername);
			System.out.println("1. Reservation /n2.Cancellation");
			int choice=sc.nextInt();
			switch (choice)
			{
			case 1:
				Reserve(UserName);
				break;
			case 2:
				Cancellation();
				break;
			}
			
					
		}
		else 
		{
			System.out.println("Invalid UserName or Password");
		}
		
	} 


	private void Cancellation() 
	{
		 System.out.println("Enter your reserved Id and BusName");
		 int id=sc.nextInt();
		 String name=sc.nextLine();
		 LinkedList<Reservation> cancelid=findId(id,name);
		 Reserve.remove(cancelid);
		 System.out.println("Cancellation Successfull");
		 
		 
		
	}
	private void Reserve( String Username) 
	{ 	
		int x=0;
		System.out.println("Enter the Bus Name");
		String Busname=sc.next();
		Reservation Reg=new  Reservation(x+1,Username,Busname);
		Reserve.add(Reg);
		System.out.println("Reservation Successfull");
			
	}
	public static  LinkedList<Reservation> findId(int id, String BusName)
	{
		for (Reservation reserve:Reserve )
		{
			if ((reserve.getReservationid()==id) &&(reserve.getBusName().equalsIgnoreCase(BusName)))
			{
				return Reserve;
			}
		}
		return null;
	}
	
	public static  String finduser(String username, String Password)
	{
		for (UserDetails user:Users )
		{
			if ((user.getPassword().equalsIgnoreCase(Password)) &&(user.getUserName().equalsIgnoreCase(username)))
			{
				return user.getName();
			}
		}
		return null;
	}
	

}
