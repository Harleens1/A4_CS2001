import java.util.ArrayList;

/**
 * The Team class creates teams. Each team is supposed to have a name, 
 * twelve players, and two coaches. Each team has it's own score, which is
 * the culmination of all the points that team has earned over all the
 * matches it has played.
 * 
 */
public class Team
{
    // instance variables - replace the example below with your own
    private String name;
    private ArrayList<Player> players;
    private ArrayList<Coach> coaches;
    private int score;

    /**
     * Constructor for objects of class Team. It creates two lists,
     * one which holds twelve players and a second which holds two
     * coaches. The teams initial score is set to 0.
     */
    public Team(String name)
    {
        // initialise instance variables
        this.name = name;
        players = new ArrayList<>();
        coaches = new ArrayList<>();
        score = 0;
    }
    
    /**
     * This method adds a player to the team.
     */
    public void addPlayer(String n, int id)
    {
        players.add(new Player(n, id));
    }
    
    /**
     * This method adds a coach to the team.
     */
    public void addCoach(String n, int id)
    {
        coaches.add(new Coach(n, id));
    }

    /**
     * This method increases the score of the team.
     */
    public void increaseScore(int points)
    {
        // put your code here
        score = score + points;
    }
    
    /**
     * This method returns the score of the team.
     */
    public int getScore()
    {
        return score;
    }
    
    
    public String getTeamName()
    {
        return name;
    }
}
