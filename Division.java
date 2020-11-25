import java.util.ArrayList;

/**
 * The Division class creates divisions. Each division has a name, a list
 * of teams, and a list of matches between teams of that division.
 */
public class Division
{
    // instance variables - replace the example below with your own
    private String name;
    private ArrayList<Team> teams;
    private ArrayList<Match> matches;

    /**
     * Constructor for objects of class Division
     */
    public Division(String name)
    {
        this.name = name;
        teams = new ArrayList<>();
        matches = new ArrayList<>();
    }

    /**
     * This method adds a team to the division.
     */
    public void addTeam(String teamName)
    {
        teams.add(new Team(teamName));
    }
    
    /**
     * This method returns a team at a specific index within the divison.
     */
    public Team getTeam(int index)
    {
        return teams.get(index);
    }
    
    /**
     * This method adds a team member to a team within the divison.
     */
    public void addTeamMember(int index, String n, int id)
    {
        teams.get(index).addPlayer(n, id);
    }
    
    /**
     * This method adds a match between two teams to the division.
     */
    public void addMatch(int HT, int AT, int HTpointsSet1, int ATpointsSet1,
    int HTpointsSet2, int ATpointsSet2, int HTpointsSet3, int ATpointsSet3,
    int HTpointsSet4, int ATpointsSet4, int HTpointsSet5, int ATpointsSet5)
    { 
        Team HomeTeam = teams.get(HT);
        Team AwayTeam = teams.get(AT);
        matches.add(new Match(HomeTeam, AwayTeam));
        matches.get(matches.size() - 1).game(HTpointsSet1,
        HTpointsSet2,HTpointsSet3, HTpointsSet4, HTpointsSet5, ATpointsSet1,
        ATpointsSet2,ATpointsSet3, ATpointsSet4, ATpointsSet5);
        int HTpoints = HTpointsSet1 + HTpointsSet2 + HTpointsSet3 
        + HTpointsSet4 + HTpointsSet5;
        int ATpoints = ATpointsSet1 + ATpointsSet2 + ATpointsSet3
        + ATpointsSet4 + ATpointsSet5;
        HomeTeam.increaseScore(HTpoints);
        AwayTeam.increaseScore(ATpoints);
        
    }
    
    /**
     * This method adds a coach to a team within the division.
     */
    public void addTeamCoach(int index, String n, int id)
    {
        teams.get(index).addCoach(n, id);
    }
    
    /**
     * This method calculates the standings of the various teams in the
     * division and displays them in a score board.
     */
    public void calculateStanding()
    {
        // This method will need to iterate over the details of the
        // various matches in the division, and then using that
        // information it will construct a score board to be displayed
        // which will show the rankings of the teams, from first place
        // to last place.
        Team fplc = teams.get(0);
        Team splc = teams.get(0);
        Team tplc = teams.get(0);
        Team furplc = teams.get(0);
        Team fitplc = teams.get(0);
        
        for(int i = 0; i < 4; i++){
            if(fplc.getScore() < teams.get(i).getScore()){
                fplc = teams.get(i);
            }
        }
        for(int i = 0; i < 4; i++){
            if(splc.getScore() < teams.get(i).getScore() && 
            splc.getScore() < fplc.getScore()){
                splc = teams.get(i);
            }
        }
        for(int i = 0; i < 4; i++){
            if(tplc.getScore() < teams.get(i).getScore() && 
            tplc.getScore() < splc.getScore()){
                tplc = teams.get(i);
            }
        }
        for(int i = 0; i < 4; i++){
            if(furplc.getScore() < teams.get(i).getScore() && 
            furplc.getScore() < tplc.getScore()){
                furplc = teams.get(i);
            }
        }
        for(int i = 0; i < 4; i++){
            if(fitplc.getScore() < teams.get(i).getScore() && 
            fitplc.getScore() < furplc.getScore()){
                fitplc = teams.get(i);
            }
        }
              
        System.out.println();
        System.out.println("// " + name + " Scoreboard \\");
        System.out.println("1st Place: " + fplc.getTeamName());
        System.out.println("2nd Place: " + splc.getTeamName());
        System.out.println("3rd Place: " + tplc.getTeamName());
        System.out.println("4th Place: " + furplc.getTeamName());
        System.out.println("5th Place: " + fitplc.getTeamName());
    }
}

