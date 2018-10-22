package AWasig;

public class PatronList {

    private BankPatron Client1;
    private BankPatron Client2;
    private BankPatron Client3;
    private BankPatron Client4;
    private BankPatron Client5;

    public PatronList() {
        Client1 = null;
        Client2 = null;
        Client3 = null;
        Client4 = null;
        Client5 = null;
    }

    public boolean newPatron(String first, String last, double sal, double cash) {
        if (Client1 == null) {
            Client1 = new BankPatron(first,last,sal,cash);
            return true;
        } else if (Client2 == null) {
            Client2 = new BankPatron(first,last,sal,cash);
            return true;
        } else if (Client3 == null) {
            Client3 = new BankPatron(first,last,sal,cash);
            return true;
        } else if (Client4 == null) {
            Client4 = new BankPatron(first,last,sal,cash);
            return true;
        } else if (Client5 == null) {
            Client5 = new BankPatron(first,last,sal,cash);
            return true;
        } else {
            return false;
        }
    }

    public boolean remClient(String fullName) {
        if (Client1 == null) {
            return false;
        } else if (fullName.equals(Client1.getName())) {
            Client1 = null;
            return true;
        } else if (Client2 == null) {
            return false;
        } else if (fullName.equals(Client2.getName())) {
            Client2 = null;
            return true;
        } else if (Client3 == null) {
            return false;
        } else if (fullName.equals(Client3.getName())) {
            Client3 = null;
            return true;
        } else if (Client4 == null) {
            return false;
        } else if (fullName.equals(Client4.getName())) {
            Client4 = null;
            return true;
        } else if (Client5 == null) {
            return false;
        } else if (fullName.equals(Client5.getName())) {
            Client5 = null;
            return true;
        }
        return false;
    }

    public BankPatron getClientwName(String fullName) {
        if (fullName.equals(Client1.getName())) {
            return Client1;
        } else if (fullName.equals(Client2.getName())) {
            return Client2;
        } else if (fullName.equals(Client3.getName())) {
            return Client3;
        } else if (fullName.equals(Client4.getName())) {
            return Client4;
        } else if (fullName.equals(Client5.getName())) {
            return Client5;
        } else {
            return null;
        }
    }

    public String getClientInfo() {
        String ret = "";
        if (Client1 == null && Client2 == null && Client3 == null && Client4 == null && Client5 == null) {
            ret += "None\n";
            return ret;
        } else {
            if (Client1 != null) {
                ret += Client1.getName() + "\n";
                if (Client1.getbAcc(1) != null) {
                    ret += Client1.getbAcc(1).getType() + " " +
                            Client1.getbAcc(1).getAccountNum() + " " +
                            "Balance: " + Client1.getbAcc(1).checkBalance() + " " +
                            "Interest Rate: " + Client1.getbAcc(1).getRate() + "\n";
                }
                if (Client1.getbAcc(2) != null) {
                    ret += Client1.getbAcc(2).getType() + " " +
                            Client1.getbAcc(2).getAccountNum() + " " +
                            "Balance: " + Client1.getbAcc(2).checkBalance() + " " +
                            "Interest Rate: " + Client1.getbAcc(2).getRate() + "\n";
                }
            }
            if (Client2 != null) {
                ret += Client2.getName() + "\n";
                if (Client2.getbAcc(1) != null) {
                    ret += Client2.getbAcc(1).getType() + " " +
                            Client2.getbAcc(1).getAccountNum() + " " +
                            "Balance: " + Client2.getbAcc(1).checkBalance() + " " +
                            "Interest Rate: " + Client2.getbAcc(1).getRate() + "\n";
                }
                if (Client2.getbAcc(2) != null) {
                    ret += Client2.getbAcc(2).getType() + " " +
                            Client2.getbAcc(2).getAccountNum() + " " +
                            "Balance: " + Client2.getbAcc(2).checkBalance() + " " +
                            "Interest Rate: " + Client2.getbAcc(2).getRate() + "\n";
                }
            }
            if (Client3 != null) {
                ret += Client3.getName() + "\n";
                if (Client3.getbAcc(1) != null) {
                    ret += Client3.getbAcc(1).getType() + " " +
                            Client3.getbAcc(1).getAccountNum() + " " +
                            "Balance: " + Client3.getbAcc(1).checkBalance() + " " +
                            "Interest Rate: " + Client3.getbAcc(1).getRate() + "\n";
                }
                if (Client3.getbAcc(2) != null) {
                    ret += Client3.getbAcc(2).getType() + " " +
                            Client3.getbAcc(2).getAccountNum() + " " +
                            "Balance: " + Client3.getbAcc(2).checkBalance() + " " +
                            "Interest Rate: " + Client3.getbAcc(2).getRate() + "\n";
                }
            }
            if (Client4 != null) {
                ret += Client4.getName() + "\n";
                if (Client4.getbAcc(1) != null) {
                    ret += Client4.getbAcc(1).getType() + " " +
                            Client4.getbAcc(1).getAccountNum() + " " +
                            "Balance: " + Client4.getbAcc(1).checkBalance() + " " +
                            "Interest Rate: " + Client4.getbAcc(1).getRate() + "\n";
                }
                if (Client4.getbAcc(2) != null) {
                    ret += Client4.getbAcc(2).getType() + " " +
                            Client4.getbAcc(2).getAccountNum() + " " +
                            "Balance: " + Client4.getbAcc(2).checkBalance() + " " +
                            "Interest Rate: " + Client4.getbAcc(2).getRate() + "\n";
                }
            }
            if (Client5 != null) {
                ret += Client5.getName() + "\n";
                if (Client5.getbAcc(1) != null) {
                    ret += Client5.getbAcc(1).getType() + " " +
                            Client5.getbAcc(1).getAccountNum() + " " +
                            "Balance: " + Client5.getbAcc(1).checkBalance() + " " +
                            "Interest Rate: " + Client5.getbAcc(1).getRate() + "\n";
                }
                if (Client5.getbAcc(2) != null) {
                    ret += Client5.getbAcc(2).getType() + " " +
                            Client5.getbAcc(2).getAccountNum() + " " +
                            "Balance: " + Client5.getbAcc(2).checkBalance() + " " +
                            "Interest Rate: " + Client5.getbAcc(2).getRate() + "\n";
                }
            }
            return ret;
        }
    }
}
