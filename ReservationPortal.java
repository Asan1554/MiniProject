package MiniProject2;

import java.util.Scanner;

public class ReservationPortal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("======================================================================================");
		System.out.println("Welcome to Nandhanam Travels");
		System.out.println("======================================================================================");
		System.out.println("Login as a \n1.Admin\n2.User");
		Scanner sc=new Scanner(System.in);
		int login=sc.nextInt();
		String username;
		String Password;
		BusDetails Details =	new BusDetails();
		AdminLogin admin   =	new AdminLogin();
		Reservation UserDet=    new Reservation();
		int x;
				
		while(true)
		{
			switch(login)
			{
			case 1:
				System.out.println("Kindly enter your User Name");
				username=sc.next();
				System.out.println("Kindly enter the Password");
				Password = sc.next();
				if(username.equalsIgnoreCase(Details.getAdminName()) && Password.equals(Details.getAdminPass()))
						{
							System.out.println("Hello "+Details.getAdminName());
							System.out.println("Do you want add /n1.New Bus /n2.Update Bus");
							x=sc.nextInt();
							
								if (x==1)
								{
									admin.NewBus();
									break;
								}
								else if (x==2)
								{
									admin.UpdateBus();
									break;
								}
						break;	
						}
				else
				{
					System.out.println("The user name or password is incorrect.");
					continue;
				}
				
			case 2:
				while(true)
				{
				int usertype;
				
				System.out.println("1. Login  /n2. Sign Up");
				usertype=sc.nextInt();
				switch(usertype)
				{
				case 1:
					
					UserDet.UserLogin();
					break;
				case 2:
					UserDet.NewUserid();
					continue;
					
				}
				break;
				}
				
				
				
				
			}
			break;
		}
		
		
	}

}
