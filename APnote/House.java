package APnote;

public class House
{
    // Characteristics
    // Attributes
    // Instance Variables

    public String color;
    private int stories; // Since it is public, anyone can change values in it.
    public String mats; // Cannot write to private as well as read
    public int length;
    public int width;

    // Default Constructor: do not return a type or a void.
    public House()  // No one can touch your privates.
    {
        color = "Red";
        stories = 2;
        mats = "Wood";
        length = 300;
        width = 200;
    }

    // Constructor
    public House(String c, int s, String m, int l)
    {
        color = c;
        stories = s;
        mats = m;
        length = l;
        width = 924;
    }

    // Methods
    public int getStories()
    {
        return stories;
    }
}
