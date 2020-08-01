public class Main
{
  public static void main(String[] args)
  {
      BankAccount myAccount = new BankAccount();
      System.out.println(myAccount.getAccount());
      myAccount.replenishMoneyAccount(5000);
      System.out.println(myAccount.getAccount());
      myAccount.withdrawMoneyAccount(3000);
      System.out.println(myAccount.getAccount());
      DepositeAccount myDepositeAccount = new DepositeAccount();
      myDepositeAccount.replenishMoneyAccount(600);
      System.out.println(myDepositeAccount.getAccount());
      myDepositeAccount.withdrawMoneyAccount(800);
      System.out.println(myDepositeAccount.getAccount());
      CardAccount myCardAccount = new CardAccount();
      myCardAccount.replenishMoneyAccount(1000);
      System.out.println(myCardAccount.getAccount());
      myCardAccount.withdrawMoneyAccount(900);
      System.out.println(myCardAccount.getAccount());
      myAccount.send(myDepositeAccount, 333);
      System.out.printf("На счете осталось %.02f %n На депозите стало %.02f %n", myAccount.getAccount(),myDepositeAccount.getAccount());
      myAccount.send(myCardAccount, 666);
      System.out.printf("На счете осталось %.02f %n На карте стало %.02f %n", myAccount.getAccount(),myCardAccount.getAccount());
      myDepositeAccount.send(myAccount, 111);
      System.out.printf("На депозите осталось %.02f %n На счете стало %.02f %n", myDepositeAccount.getAccount(),myAccount.getAccount());
      myCardAccount.send(myDepositeAccount,22);
      System.out.printf("На карте осталось %.02f %n На депозите стало %.02f %n", myCardAccount.getAccount(),myDepositeAccount.getAccount());
      myDepositeAccount.send(myAccount,500000.0);
      System.out.printf("На депозите осталось %.02f %n На счете стало %.02f %n", myDepositeAccount.getAccount(),myAccount.getAccount());
      myCardAccount.send(myAccount, 600000.0);
      System.out.printf("На карте осталось %.02f %n На депозите стало %.02f %n", myCardAccount.getAccount(),myDepositeAccount.getAccount());
      myAccount.send(myCardAccount, 8000000.0);
      System.out.printf("На счете осталось %.02f %n На карте стало %.02f %n", myAccount.getAccount(),myCardAccount.getAccount());



  }
}
