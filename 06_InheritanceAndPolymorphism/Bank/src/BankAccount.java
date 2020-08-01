public class BankAccount
{
    protected double account;
    public boolean isMoneyEnough(double moneyIn)
    {
        if (this.getAccount()>=moneyIn)
        {
            System.out.println("Перевод возможен");
            return true;
        }
        else System.out.println("Недостаточно средств на счете");
        return false;
    }
    public void replenishMoneyAccount(double money)
    {
      account += money;
    }

    public boolean withdrawMoneyAccount(double money)
    {
        if(isMoneyEnough(money))
        {
            account -= money;
            return true;
        }

        else {
            System.out.println("Снятие невозможно");
            return false;
        }
    }

    public double getAccount()
    {
        return account;
    }
    public boolean send (BankAccount receiver, double ammount)
    {
        if(this.withdrawMoneyAccount(ammount))
        {
            receiver.replenishMoneyAccount(ammount);
            return true;
        }
        else return false;
    }
}
