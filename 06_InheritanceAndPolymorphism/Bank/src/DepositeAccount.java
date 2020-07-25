import java.time.LocalDate;

public class DepositeAccount extends BankAccount
{
    public LocalDate dateOfOperation;
    public void replenishMoneyAccount(double money)
    {
      account += money;
      dateOfOperation = LocalDate.now();
  //    System.out.println(dateOfOperation);
    }

    public void withdrawMoneyAccount(double money)
    {
        LocalDate day = dateOfOperation.plusMonths(1);
        System.out.println(day);
        if (LocalDate.now().isAfter(day))
            account -= money;
        else System.out.printf("Вы не можете снимать деньги с этого счета ранее %s %n", day);
    }
}
