import java.time.LocalDate;

public class DepositeAccount extends BankAccount
{
    private LocalDate dateOfOperation = LocalDate.of(1,1,1);
    @Override
    public void replenishMoneyAccount(double money)
    {
      account += money;
      dateOfOperation = LocalDate.now();
  //    System.out.println(dateOfOperation);
    }
    @Override
    public boolean withdrawMoneyAccount(double money)
    {
        LocalDate day = dateOfOperation.plusMonths(1);
       // System.out.println(day);
        if (LocalDate.now().isAfter(day) && isMoneyEnough(money))
        {
            account -= money;
            return true;
        }
        else
        {
            System.out.printf("Вы не можете снимать деньги с этого счета ранее %s %n", day);
            return false;
        }
    }
}
