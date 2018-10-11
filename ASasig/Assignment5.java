package ASasig;

import java.util.Scanner;

public class Assignment5 {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args)
    {
        Pet fido = new Pet("Fido",3);
        Pet furball = new Pet("Furball",1);

        Pet userIn = new Pet();
        String res;
        String whi;


        while (true) {
            res = menu();

            while (true) {
                if (!res.matches("A|B|C|D|E|F")) {
                    System.out.println("Invalid input.");
                    res = scan.nextLine();
                } else {
                    break;
                }
            }
            if (res.equals("E")) {
                break;
            }
            else if (res.equals("F")) {
                System.out.println("Which dog would you like to brutally murder?");
                whi = scan.nextLine();

                if (whi.equals("1")) {
                    System.out.println("How would you like to kill Fido?");
                    whi = scan.nextLine();

                    System.out.println("You have successfully killed Fido by method of " + whi + ".");
                    fido.setDead();
                }
                else if (whi.equals("2")) {
                    System.out.println("How would you like to kill Furball?");
                    whi = scan.nextLine();

                    System.out.println("You have successfully killed Furball by method of " + whi + ".");
                    furball.setDead();
                }
                else if (whi.equals("3")) {
                    if (userIn.getExists()) {
                        System.out.println("How would you like to kill " + userIn.getName() + "?");
                        whi = scan.nextLine();

                        System.out.println("You have successfully killed " + userIn.getName() +" by method of " + whi + ".");
                        furball.setDead();
                    }
                    else {
                        System.out.println("Invalid input.");
                    }
                }
                continue;
            }
            else if (res.equals("A")) {
                // Fido:
                System.out.print("Fido is " + fido.getAge() + " years old " +
                        "and is ");
                if (!fido.getAdopted()) {
                    System.out.print("not ");
                }
                System.out.print("adopted.");
                if (fido.getDead()) {
                    System.out.print(" Fido is also dead.\n");
                } else {
                    System.out.print("\n");
                }

                // Furball:
                System.out.print("Furball is " + furball.getAge() + " years old " +
                "and is ");
                if (!furball.getAdopted()){
                    System.out.print("not ");
                }
                System.out.print("adopted.");
                if (furball.getDead()) {
                    System.out.print(" Furball is also dead.\n");
                } else {
                    System.out.print("\n");
                }

                // User input pet:
                if (userIn.getExists()) {
                    System.out.print(userIn.getName() + " is " + userIn.getAge() +
                            " years old and is ");
                    if (!userIn.getAdopted()){
                        System.out.print("not ");
                    }
                    System.out.print("adopted.");
                    if (userIn.getDead()) {
                        System.out.print(" " + userIn.getName() + " is also dead.\n");
                    } else {
                        System.out.print("\n");
                    }
                }
                continue;
            }
            else if (res.equals("B")) {
                furball.setAge();
                fido.setAge();
                if (userIn.getExists()) {
                    userIn.setAge();
                }
                System.out.println("All pets just got a year older.");
                continue;
            }
            else if (res.equals("C")) {
                if (userIn.getExists())
                {
                    System.out.println("Sorry, the store is full.");
                }
                else
                {
                    System.out.println("Enter a name.");
                    String nm = scan.nextLine();
                    System.out.println("Enter an age.");
                    int ag = scan.nextInt();
                    scan.nextLine();

                    for (int i = 1; i <= ag; i++) {
                        userIn.setAge();
                    }

                    userIn.setExists();
                    userIn.setName(nm);
                    System.out.println(nm + " has arrived in the store.");
                }

                continue;
            }
            else if (res.equals("D"))
            {
                System.out.println("Enter the number pet you would like to adopt." +
                        "\nThe number correlates with the order they are listed.");
                res = scan.nextLine();

                if (res.equals("1")) {
                    if (fido.getAdopted()) {
                        System.out.println("That is not a valid pet.");
                        continue;
                    }
                    else
                    {
                        fido.setAdopted();
                        System.out.println("Fido was adopted!");
                        continue;
                    }
                }
                if (res.equals("2")){
                    if (furball.getAdopted()) {
                        System.out.println("That is not a valid pet.");
                        continue;
                    }
                    else
                    {
                        furball.setAdopted();
                        System.out.println("Furball was adopted!");
                        continue;
                    }
                }
                if (res.equals("3")){
                    if (userIn.getExists()) {
                        if (userIn.getAdopted()) {
                            System.out.println("That is not a valid pet.");
                            continue;
                        } else {
                            userIn.setAdopted();
                            System.out.println(userIn.getName() + " was adopted!");
                            continue;
                        }
                    } else {
                        System.out.println("That is not a valid pet.");
                        continue;
                    }
                }
            }
        }
        System.out.print("Have a good day! :)");
        scan.close();
    }
    private static String menu()
    {
        System.out.println("Type the letter to make your selection."
                + "\nA. List the pets in the store."
                + "\nB. Age up the pets."
                + "\nC. Add a new pet."
                + "\nD. Adopt a pet."
                + "\nE. Quit."
                + "\nF. Kill a dog.");
        String res = scan.nextLine();
        return res;
    }
}