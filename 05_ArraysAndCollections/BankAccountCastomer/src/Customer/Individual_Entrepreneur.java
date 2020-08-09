package Customer;

public class Individual_Entrepreneur extends Customer
{
    protected double REPLENISH_COMISSION_BEFORE_1000 = 0.01;
    protected double REPLENISH_COMISSION_AFTER_1000 = 0.005;

    @Override
    public void replenishMoneyAccount(double money)
    {
        if (money<1000)
        {
            account += (money-money*REPLENISH_COMISSION_BEFORE_1000);
        }
        else if (money>=1000)
        {
            account += (money-money*REPLENISH_COMISSION_AFTER_1000);
        }
        else System.out.println("Некорректная сумма");
    }
}
