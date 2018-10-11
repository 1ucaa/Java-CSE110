package ARnote;

import java.util.Scanner;

public class main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        house myHouse = new house();
        house myOtherHouse = new house(20, 12, 4, 600, "Magenta");

        myHouse.setNumDoors(myHouse.getNumDoors() + 1);

        System.out.println(myHouse.getNumDoors());
        myHouse.addDoor();

        System.out.println(myOtherHouse.getNumDoors());
        System.out.println(myHouse.getNumDoors());

        System.out.println(myHouse);

        scan.close();
    }
}