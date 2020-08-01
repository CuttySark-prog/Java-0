public class CardAccount extends BankAccount
{
    public final double COMMISSION_RATE = 0.1;

    @Override
    public boolean withdrawMoneyAccount(double money)
    {
        double commission = money*COMMISSION_RATE;
        double moneyReal = money + commission;

        if (isMoneyEnough(moneyReal))
        {
            account = account - moneyReal;
            System.out.printf("Вы сняли со счета %.02f рублей,%n комиссия составила %.02f рублей, %n" +
                    "всего со счета снято %.02f рублей %n", money, commission, moneyReal);
            return true;
        }
        else return false;
    }
}
