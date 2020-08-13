package Customer;

public abstract class Customer
{
    protected double account;
    public boolean isMoneyEnough(double moneyIn)
    {
        if (this.getAccount()>=moneyIn && moneyIn>0)
        {
            return true;
        }
        else //System.out.println("Недостаточно средств на счете");
            return false;
    }
    public void replenishMoneyAccount(double money)
    {
        if(money>0)
        {
            account += money;
        }
        else
        {
            System.out.printf("Я (банк), буду рад внести на счет %.02f рублей, но мой куратор считает, что вы должны подумать ещё раз! %n", money);
        }
    }

    public void withdrawMoneyAccount(double money)
    {
        if(isMoneyEnough(money)&&money>0)
        {
            account -= money;
        }

        else
        {
            System.out.println("Снятие невозможно");
        }
    }
    public double getAccount()
    {
        return account;
    }
}
