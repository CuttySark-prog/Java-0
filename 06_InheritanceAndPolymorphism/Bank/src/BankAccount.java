
public class BankAccount
{
    public double account;
    public void replenishMoneyAccount(double money)
    {
      account += money;
    }

    public void withdrawMoneyAccount(double money)
    {
        account -= money;
    }

    public double getAccount()
    {
        return account;
    }
    public boolean send (BankAccount receiver, double ammount)
    {
        receiver.replenishMoneyAccount(ammount);
        this.withdrawMoneyAccount(ammount);
        return true;
    }
}
