package Customer;

public class Entity extends Customer
{
    @Override
    public void withdrawMoneyAccount(double money) {
        double COMMISSION_RATE = 0.1;
        double withdrawCommission = money * COMMISSION_RATE;
        double moneyReal = money + withdrawCommission;

        super.withdrawMoneyAccount(moneyReal);

    }
}
