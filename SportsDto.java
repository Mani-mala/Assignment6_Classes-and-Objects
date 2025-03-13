package assignment6;
import java.util.ArrayList;
import java.util.List;
public class SportsDto {
	public static void main(String[] args) {		
		Team team = new Team("Delhi Capitals", "Delhi", "division-1");
        Player player1 = new Player("Axar patel","Batsman",20);
        Player player2 = new Player("Klay Thompson", "Keeper", 11);
        team.addPlayer(player1);
        team.addPlayer(player2);
        team.displayTeam();
        team.playGame();
        team.hireCoach();
        //player1.train();
        //player2.playGame();
	}
}
class Team
{
	private String team_name;
	private String city;
	private String division;
	private String coach_name;
	private List<Player> players;
	public Team(String team_name, String city, String division)
	{
		this.team_name=team_name;
		this.city=city;
		this.division=division;
		this.players = new ArrayList<>();
	}
	 public void addPlayer(Player player) {
	        players.add(player);
	    }

	    public void playGame() {
	        System.out.println(team_name + " is playing a game.");
	    }
	    public void hireCoach() {
	        System.out.println("A new coach has been hired for " +team_name);
	    }
	    public void displayTeam() {
	        System.out.println("Team : " + team_name + "\nCity : " + city + "\nDivision : " + division);
	        System.out.println("Players : ");
	        for (Player player : players) {
	            player.displayPlayer();
	        }
	    }
}
class Player
{
	private String name;
	private String position;
	private int jerseyNumber;
	public Player(String name,String position,int jerseyNumber)
	{
		this.name=name;
		this.position=position;
		this.jerseyNumber=jerseyNumber;
	}
	public void playGame() {
	        System.out.println(name + " is playing the game.");
	}
    public void train() {
	        System.out.println(name + " is training.");
	}
	public void displayPlayer()
	{
		System.out.println("Player name : "+name+"\nPosition : "+position+"\nJerseynumber : "+jerseyNumber);
	}
}
