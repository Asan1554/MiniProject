package MiniProject2;

import java.util.LinkedList;
import java.util.Scanner;

public class AdminLogin {
	
		private static LinkedList<BusDetails> list=new LinkedList<>();
		
		Scanner sc=new Scanner(System.in);
		String check;
		
		public void NewBus()
		{	
			do 
			{
				System.out.println("Enter BusName, Coach and Seating Type");
				String busname=sc.nextLine();
				String coachtype=sc.nextLine();
				String seatingtype=sc.nextLine();
				 
				BusDetails Bus = new BusDetails(busname,coachtype, seatingtype);
				list.add(Bus);
				System.out.println("You want to add more");
				check=sc.nextLine();
			}while(check.toUpperCase().equals("YES"));
		}
		public void UpdateBus()
		{
			System.out.println("Enter Bus Id");
			int busid=sc.nextInt();
			String name=findBus(busid);
			if (name!=null)
			{
				System.out.println("What you want to update \n1.Coach \n2. Seating Type");
				int upd=sc.nextInt();
				do{
				
				switch(upd)
					{
					case 1:
						System.out.println("Enter the New Coach");
						String coach=sc.nextLine();
						for (BusDetails id: list)
						{
							id =list.get(busid);
							id.setCoach(coach);
					    }
						break;
					case 2:
						System.out.println("Enter the Seating Type");
						String seat=sc.nextLine();
						for (BusDetails id: list)
						{
							id =list.get(busid);
							id.setSeatingType(seat);
					    }
						break;
				    }
				System.out.println("Do you want to update more");
				check=sc.nextLine();
				}while(check.toUpperCase().equals("YES"));
		    }
			else {
				System.out.println("The entered bus is not in the list kindly add as new to update");
			}
		}
		public  String  findBus(int busid)
		{
			for (BusDetails id:list)
			{
				if (id.getBusId()==busid)
				{
					return id.getBusName();
				}
			}
			return null;
			
		}
		
		
		
		
		
}
