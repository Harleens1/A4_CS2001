

/**
 * The Match class creates a scoreboard for a match between two teams.
 * Each match is played until one team wins 3 sets. A set is won by the
 * team which reaches 21 points first. If the match reaches the 5th set,
 * the team which reaches 15 points first wins. (Side note, this means
 * that the maximum number of points a team can earn is 97, assuming that
 * they lose two sets with 20 points, win two sets with 21 points, and then
 * win the final set with 15 points.)
 */
public class Match
{
    // instance variables - replace the example below with your own
    private int sets;
    private int points1;
    private int points2;
    private Team team1;
    private Team team2;

    /**
     * Constructor for objects of class match
     */
    public Match(int sets, int points1, int points2, Team team1, Team team2)
    {
        // initialise instance variables
        sets = sets;
        points1 = points1;
        points2 = points2;
        team1 = team1;
        team2 = team2;
    }
}
