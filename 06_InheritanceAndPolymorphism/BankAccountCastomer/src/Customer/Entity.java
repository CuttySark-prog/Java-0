package Customer;

public class Entity extends Customer
{
    static protected double COMMISSION_RATE = 0.1;
    @Override
    public void withdrawMoneyAccount(double money)
    {
        double withdrawCommission = money * COMMISSION_RATE;
        double moneyReal = money + withdrawCommission;

        super.withdrawMoneyAccount(moneyReal);
    }
}
