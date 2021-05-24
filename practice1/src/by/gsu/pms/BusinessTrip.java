package by.gsu.pms;

public class BusinessTrip {
    private static final int DAILY_RATE = 25000;
    private String account;
    private int transportExpenses;
    private int days;

    // default constructor
    public BusinessTrip() {

    }

    // general-purpose constructor
    public BusinessTrip(String account, int transportExpenses, int days) {
        this.account = account;
        this.transportExpenses = transportExpenses;
        this.days = days;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getTransportExpenses() {
        return transportExpenses;
    }

    public void setTransportExpenses(int transport) {
        this.transportExpenses = transport;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getTotal() {
        return DAILY_RATE * days + transportExpenses;
    }

    public void show() {
        System.out.println("Rate: " + DAILY_RATE + ";\n"
                + "account: " + account + ";\n"
                + "transport :" + transportExpenses + ";\n"
                + "days: " + days + ";\n"
                + "total expenses: " + getTotal());
    }

    @Override
    public String toString() {
        return DAILY_RATE + ";" + account + ";" + transportExpenses + ";" + days + ";" + getTotal();
    }
}