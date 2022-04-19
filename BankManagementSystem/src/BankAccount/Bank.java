package BankAccount;

public class Bank {
    private String BName;
    private String Country;
    private String BCode;

    public Bank(String BName, String country, String BCode) {
        this.BName = BName;
        this.Country = country;
        this.BCode = BCode;
    }

    public Bank(Bank bank)
    {
        this.BName= bank.BName;
        this.Country = bank.Country;
        this.BCode = bank.BCode;
    }

    public String getBName() {
        return BName;
    }

    public void setBName(String BName) {
        this.BName = BName;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        this.Country = country;
    }

    public String getBCode() {
        return BCode;
    }

    public void setBCode(String BCode) {
        this.BCode = BCode;
    }

    @Override
    public String toString() {
        return "Bank Information: \n" +
                "Bank Name: " + BName + "\n" +
                "Bank Code: " + BCode + "\n" +
                "Bank Country: " + Country + "\n"
                ;
    }
}
