package assignment6;

public class FlightDto {
	private int flight_id;
    private String airline;
    private String source;
    private String destination;
    private double ticket_price;
    private static final String AIRPORT_CODE = "INTL-001"; 
	public int getFlightId() {
		return flight_id;
	}
	public void setFlightId(int flight_id) {
		this.flight_id = flight_id;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public double getPrice() {
		return ticket_price;
	}
	public void setPrice(double ticket_price) {
		this.ticket_price = ticket_price;
	}
	public static void main(String[] args) {
		FlightDto flight1=new FlightDto();
		flight1.setFlightId(487467);
		System.out.println("Flight id : "+flight1.getFlightId());
		flight1.setAirline("King Fisher");
		System.out.println("Airline : "+flight1.getAirline());
		flight1.setSource("India");
		System.out.println("Source : "+flight1.getSource());
		flight1.setDestination("Switzarland");
		System.out.println("Destination : "+flight1.getDestination());
		flight1.setPrice(99000);
		System.out.println("Salary : "+flight1.getPrice());
		System.out.println("Airport code : "+AIRPORT_CODE );
		System.out.println("\n");

	}

}
