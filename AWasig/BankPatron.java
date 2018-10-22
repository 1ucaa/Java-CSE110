package AWasig;

public class BankPatron {
    private String fName;
    private String lName;
    private double sal;
    private double CoH;
    private BankAccount bAcc1;
    private BankAccount bAcc2;

    public BankPatron() {
        fName = "";
        lName = "";
        sal = 0;
        CoH = 0;
        bAcc1 = null;
        bAcc2 = null;
    }

    public BankPatron(String f, String l, double s, double c) {
        fName = f;
        lName = l;
        sal = s;
        CoH = c;
        bAcc1 = null;
        bAcc2 = null;
    }

    public String getName() {
        return fName + " " + lName;
    }

    public double getSal() {
        return sal;
    }

    public double getCoh() {
        return CoH;
    }

    public void getPaid() {
        CoH += (sal/26);
    }

    public BankAccount getbAcc(int b) {
        if (b == 1) {
            return bAcc1;
        } else if (b == 2) {
            return bAcc2;
        } else {
            return null;
        }
    }

    public boolean bAccDep(int b, double a) {
        if (b == 1 && bAcc1 != null) {
            if (a > CoH) {
                return false;
            } else {
                CoH -= a;
                bAcc1.deposit(a);
                return true;
            }
        } else if (b == 2 && bAcc2 != null) {
            if (a > CoH) {
                return false;
            } else {
                CoH -= a;
                bAcc2.deposit(a);
                return true;
            }
        } else {
            return false;
        }
    }

    public boolean bAccWith(int b, double a) {
        if (b == 1 && bAcc1 != null) {
            bAcc1.withdraw(a);
            CoH += a;
            return true;
        } else if (b == 2 && bAcc2 != null) {
            bAcc2.withdraw(a);
            CoH += a;
            return true;
        } else {
            return false;
        }
    }

    public boolean addAccount(double rate, AccountType t) {
        if (bAcc1 == null) {
            bAcc1 = new BankAccount(fName, lName, 0, t);
            bAcc1.setRate(rate);
            return true;
        } else if (bAcc2 == null) {
            bAcc2 = new BankAccount(fName, lName, 0, t);
            bAcc2.setRate(rate);
            return true;
        }
         else {
             return false;
        }
    }

    public boolean removeAccount(int b) {
        if (b == 1) {
            if (bAcc1 != null) {
                bAcc1 = null;
                return true;
            } else {
                return false;
            }
        } else if (b == 2) {
            if (bAcc2 != null) {
                bAcc2 = null;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

}
