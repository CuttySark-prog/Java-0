package Customer;

public class Entity extends Customer
{
    @Override
    public boolean withdrawMoneyAccount(double money) {
        double COMMISSION_RATE = 0.1;
        double withdrawcommission = money * COMMISSION_RATE;
        double moneyReal = money + withdrawcommission;

        if (isMoneyEnough(moneyReal)) {
            account = account - moneyReal;
            System.out.printf("Вы сняли со счета %.02f рублей,%n комиссия составила %.02f рублей, %n" +
                    "всего со счета снято %.02f рублей %n", money, withdrawcommission, moneyReal);
            return true;
        }
        else return false;
    }
}
