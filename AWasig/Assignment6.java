package AWasig;

import java.util.Scanner;

public class Assignment6 {

    public static PatronList viewClients = new PatronList();
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {


        String res;

        System.out.println("Welcome to the CSE110 bank!");

        while (true) {
            res = menuInput();
            if (res.equals("a")) {
                System.out.println("Patrons currently at the bank:");
                System.out.print(viewClients.getClientInfo());
                continue;
            }
            if (res.equals("b")) {
                System.out.println("What is the first name of the new patron?");
                String fname = scan.nextLine();
                System.out.println("Last name?");
                String lname = scan.nextLine();
                System.out.println("Their yearly salary?");
                double sal = scan.nextDouble();
                System.out.println("How much cash do they have on hand?");
                double coh = scan.nextDouble();
                boolean notFull = viewClients.newPatron(fname, lname, sal, coh);
                if (notFull) {
                    System.out.print("Welcome to the CSE110 bank, " + fname + " " + lname + ".\n");
                } else {
                    System.out.println("Failure: the bank line is full.");
                }
                scan.nextLine();
                continue;
            }
            if (res.equals("c")) {
                System.out.println("Give the full name of the patron you'd like to remove.");
                String rem = scan.nextLine();
                boolean ret = viewClients.remClient(rem);
                if (ret) {
                    System.out.println("Patron successfully removed.");
                } else {
                    System.out.println("There is no Patron by that name.");
                }
                continue;
            }
            if (res.equals("d")) {
                BankPatron who = whichPat();
                while (true) {
                    System.out.println("What do you want to do with " + who.getName() + "?");
                    String resD = menuInputd();
                    if (resD.equals("a")) {
                        AccountType acc;
                        while (true) {
                            // What type of account?
                            String resDacc = addAccMenu();
                            if (resDacc.equals("a")) {
                                acc = AccountType.Checking;
                                break;
                            } else if (resDacc.equals("b")) {
                                acc = AccountType.Savings;
                                break;
                            } else if (resDacc.equals("c")) {
                                acc = AccountType.CD;
                                break;
                            } else if (resDacc.equals("d")) {
                                acc = AccountType.MoneyMarket;
                                break;
                            } else if (resDacc.equals("e")) {
                                acc = AccountType.IRA;
                                break;
                            } else {
                                System.out.println("Invalid input");
                                continue;
                            }
                        }
                        System.out.println("Please input the interest rate.");
                        double rate = scan.nextDouble();
                        scan.nextLine();
                        accAction(acc, who, rate);
                        continue;
                    } else if (resD.equals("b")) {
                        System.out.println("Which account shall be closed, 1 or 2?");
                        int resp = scan.nextInt();
                        boolean succ = who.removeAccount(resp);
                        if (succ) {
                            System.out.print("Success: account " + resp + " closed.");
                        } else {
                            System.out.println("Failure: account not closed.");
                        }
                        continue;
                    } else if (resD.equals("c")) {
                        who.getPaid();
                        continue;
                    } else if (resD.equals("d")) {
                        if (who.getbAcc(1) != null) {
                            who.getbAcc(1).applyInterest();
                        }
                        if (who.getbAcc(2) != null) {
                            who.getbAcc(2).applyInterest();
                        }
                        continue;
                    } else if (resD.equals("e")) {
                        System.out.println("Which account will receive a deposit?");
                        int resp = scan.nextInt();
                        System.out.println("How much will be deposited?");
                        double amount = scan.nextDouble();
                        scan.nextLine();
                        if (amount < 0) {
                            System.out.println("Error: Cannot deposit negative money.");
                            continue;
                        }
                        boolean success = who.bAccDep(resp,amount);
                        if (success) {
                            System.out.println("Success: Deposit went through.");
                        } else {
                            System.out.println("Failure: Deposit not able to be completed.");
                        }
                        continue;
                    } else if (resD.equals("f")) {
                        System.out.println("From which account will money be withdrawn?");
                        int resp = scan.nextInt();
                        System.out.println("How much will be withdrawn?");
                        double amount = scan.nextDouble();
                        scan.nextLine();
                        if (amount < 0) {
                            System.out.println("Error: Cannot withdraw negative money.");
                            continue;
                        }
                        boolean success = who.bAccWith(resp,amount);
                        if (success) {
                            System.out.println("Success: Withdraw went through.");
                        } else {
                            System.out.println("Failure: Withdraw was not able to be completed.");
                        }
                        continue;
                    } else if (resD.equals("g")) {
                        break;
                    }
                    else {
                        System.out.println("Invalid Input.");
                        continue;
                    }
                }
                continue;
            }
            if (res.equals("e")) {
                break;
            } else {
                System.out.println("Invalid input.");
                continue;
            }
        }
        System.out.println("Thank you for coming.");
    }

    public static String menuInput() {
        System.out.println(
                "a. List Patrons" +
                "\nb. Add New Patron" +
                "\nc. Remove Patron" +
                "\nd. Patron Specific Actions" +
                "\ne. Quit");
        String res = scan.nextLine();
        return res;
    }
    public static String menuInputd() {
        System.out.println(
                "a. Add New Account" +
                "\nb. Close Account" +
                "\nc. Get Paid" +
                "\nd. Apply Interest to Accounts" +
                "\ne. Make Deposit" +
                "\nf. Make Withdraw" +
                "\ng. Return to Main Menu"
        );
        String res = scan.nextLine();
        return res;
    }
    public static String addAccMenu() {
        System.out.println(
                "Which account type did you want?" +
                "\na. Checking" +
                "\nb. Savings" +
                "\nc. CD" +
                "\nd. Money Market" +
                "\ne. IRA"
        );
        String res = scan.nextLine();
        return res;
    }
    public static BankPatron whichPat() {
        System.out.println("Type the full name of the patron you want.");
        String name = scan.nextLine();
        BankPatron res = viewClients.getClientwName(name);
        return res;
    }
    public static void accAction(AccountType a, BankPatron b, double r) {
        boolean success = b.addAccount(r,a);
        if (success) {
            System.out.println("Success: account added.");
        } else {
            System.out.println("Failure: account not added.");
        }
    }
}
