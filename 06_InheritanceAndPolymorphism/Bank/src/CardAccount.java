public class CardAccount extends BankAccount
{
    public void withdrawMoneyAccount(double money)
    {
        double summa = money;
        double commission = summa*0.1;
        double moneyReal = summa + commission;
        account = account - moneyReal;
        System.out.printf("Вы сняли со счета %.02f рублей,%n комиссия составила %.02f рублей, %n" +
                "всего со счета снято %.02f рублей %n", summa, commission, moneyReal);
    }
}
