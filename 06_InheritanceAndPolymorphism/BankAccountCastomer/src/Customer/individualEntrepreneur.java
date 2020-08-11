package Customer;

public class individualEntrepreneur extends Customer
{
    protected double REPLENISH_COMISSION_BEFORE_1000 = 0.01;
    protected double REPLENISH_COMISSION_AFTER_1000 = 0.005;

    @Override
    public void replenishMoneyAccount(double money)
    {
        if (money<1000)
        {
            super.replenishMoneyAccount((money-money*REPLENISH_COMISSION_BEFORE_1000));
        }
        else if (money>=1000)
        {
            super.replenishMoneyAccount(money-money*REPLENISH_COMISSION_AFTER_1000);
        }
        else System.out.println("Некорректная сумма");
    }
}
