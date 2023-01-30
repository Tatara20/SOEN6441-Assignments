public class Bills {
    private final String type;
    private final String companyName;
    private final double amount;
    private final String month;
    private final int day;
    private final int year;

    public Bills(String type, String companyName, double amount, String month, int day, int year) {
        this.type = type;
        this.companyName = companyName;
        this.amount = amount;
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public String getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public String getCompanyName() {
        return companyName;
    }
}
