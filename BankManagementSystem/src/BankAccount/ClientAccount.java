package BankAccount;

public class ClientAccount {
    private Bank bank;
    private Client client;
    private Currencies currencies;
    private double CBalance;

    public ClientAccount(Bank bank, Client client, Currencies currencies, double CBalance) {
        this.bank = new Bank(bank);
        this.client = new Client(client);
        this.currencies = new Currencies(currencies);
        this.CBalance = CBalance;
    }

    public ClientAccount(ClientAccount clientAccount) {
        this.bank = clientAccount.bank;
        this.client = clientAccount.client;
        this.currencies = clientAccount.currencies;
        this.CBalance = clientAccount.CBalance;
    }

    public Bank getBank() {
        return new Bank(bank);
    }

    public void setBank(Bank bank) {
        this.bank = new Bank(bank);
    }

    public Client getClient() {
        return new Client(client);
    }

    public void setClient(Client client) {
        this.client = new Client(client);
    }

    public Currencies getCurrencies() {
        return new Currencies(currencies);
    }

    public void setCurrencies(Currencies currencies) {
        this.currencies = new Currencies(currencies);
    }

    public double getCBalance() {
        return CBalance;
    }

    public void setCBalance(double CBalance) {
        this.CBalance = CBalance;
    }

    @Override
    public String toString() {
        return "Client Account Information: \n" +
                bank +
                "\n" + client +
                "\n" + currencies +
                "\n" + CBalance
                ;
    }
}
