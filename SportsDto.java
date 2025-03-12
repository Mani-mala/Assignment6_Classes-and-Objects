package assignment6;

public class SportsDto {
	public static void main(String[] args) {
		Team team=new Team();
		team.playGame("Delhi Capitals", "Delhi", "division-1");
		team.hireCoach("Ricky");
		team.getDisplay();
		Player player=new Player();
		player.playGame("Axar patel","All rounder",20);
		player.Train("batsman");
		player.getDisplay2();
	}
}
class Team
{
	private String team_name;
	private String city;
	private String division;
	private String coach_name;
	public void playGame(String team_name, String city, String division)
	{
		this.team_name=team_name;
		this.city=city;
		this.division=division;
	}
	public void hireCoach(String coach_name)
	{
		this.coach_name=coach_name;	
	}
	public void getDisplay()
	{
		System.out.println("Team name : "+team_name+"\ndivision : "+division+"\nCity : "+city);
		System.out.println("Coach : "+coach_name+"\n");
	}
}
class Player
{
	private String name;
	private String position;
	private int jerseyNumber;
	public void playGame(String name,String position,int jerseyNumber)
	{
		this.name=name;
		this.position=position;
		this.jerseyNumber=jerseyNumber;
	}
	public void Train(String name)
	{
		this.name=name;
	}
	void getDisplay2()
	{
		System.out.println("Player name : "+name+"\nPosition : "+position+"\nJerseynumber : "+jerseyNumber);
		System.out.println("Taking training to become a better "+name);
	}
}
