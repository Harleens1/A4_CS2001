

/**
 * The coach class is supposed to create objects of type coach.
 * That is to say that the coach class creates distincit objects
 * for each coach of each team within the volleyball league.
 *
 * @author (Thomas Sheppard)
 * @version (v1)
 */
public class coach
{
    // Class instance variables. Name is the name of the coach, and id
    // is the number associated with that coach.
    private String name;
    private int id;

    /**
     * Creates a coach with the associated name and id number.
     */
    public coach(String name, int id)
    {
        // initialise instance variables
        this.name = name;
        this.id = id;
    }
}
