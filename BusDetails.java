package MiniProject2;

public class BusDetails {
	private static int  BusId=0;
	private String 		BusName;
	private String 		Coach;
	private String  	SeatingType;
	private String 		AdminName="Asan";
	private String 		AdminPass="Asan@1999";
	
	public String getCoach() {
		return Coach;
	}

	public String getAdminName() {
		return AdminName;
	}

	public String getAdminPass() {
		return AdminPass;
	}

	public void setCoach(String coach) {
		Coach = coach;
	}

	public String getSeatingType() {
		return SeatingType;
	}

	public void setSeatingType(String seatingType) {
		SeatingType = seatingType;
	}

	public BusDetails(String busname, String coach, String seatingType) {
		super();
		BusId++;
		BusName=busname;
		Coach = coach;
		SeatingType = seatingType;
	}

	public int getBusId() {
		return BusId;
	}

	
	public BusDetails() {
		super();
	}

	public String getBusName() {
		return BusName;
	}

	public void setBusName(String busName) {
		BusName = busName;
	}
	

	
}
