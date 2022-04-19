package BankAccount;

public class Currencies {
    private String Name;
    private String Country;

    public Currencies(String name, String country) {
        Name = name;
        Country = country;
    }

    public Currencies(Currencies currencies)
    {
        this.Name = currencies.Name;
        this.Country = currencies.Country;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    @Override
    public String toString() {
        return "Currencies Information: \n" +
                "Currency Name: " + Name + '\n' +
                "Currency Origin: " + Country + '\n';
    }
}
