package ARnote;

public class house {
    // Characteristics
    // Attributes
    // Instance Variables
    public int numWalls;
    public int address;
    public int squareFeet;
    private int numDoors;
    public String color;

    // Default Constructor
    public house() {
        numWalls = 4;
        address = -1;
        squareFeet = 50000;
        numDoors = 0;
        color = "Purple";
    }

    // Regular Constructor
    public house(int w, int a, int s, int d, String c)
    {
        numWalls = w;
        address = a;
        squareFeet = s;
        numDoors = d;
        color = c;
    }

    house ffriend = new house(20,52,92,42,"Fun");

    // Get
    public int getNumDoors()
    {
        return numDoors;
    }

    // Set
    public void setNumDoors(int nd)
    {
        numDoors = nd;
    }

    public void addDoor()
    {
        numDoors++;
    }

    public String toString()
    {
       return "Doors:" + numDoors;
    }
}
