package ASasig;

public class Pet {

    private String name;
    private int age;
    private boolean adopted;
    private boolean exists;
    private boolean dead;

    // Default Constructor.
    public Pet() {
        name = "";
        age = 0;
        adopted = false;
        exists = false;
        dead = false;
    }

    // Regular Constructor.
    public Pet(String n, int a) {
        name = n;
        age = a;
        adopted = false;
        exists = true;
        dead = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        age++;
    }

    public boolean getAdopted() {
        return adopted;
    }

    public void setAdopted() {
        adopted = true;
    }

    public boolean getExists() {
        return exists;
    }

    public void setExists() {
        exists = true;
    }

    public void setDead() {
        dead = true;
    }

    public boolean getDead() {
        return dead;
    }
}
