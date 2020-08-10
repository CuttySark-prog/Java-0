package Customer;

public abstract class Customer
{
        protected double account;
        public boolean isMoneyEnough(double moneyIn)
        {
            if (this.getAccount()>=moneyIn)
            {
                return true;
            }
            else System.out.println("Недостаточно средств на счете");
            return false;
        }
        public void replenishMoneyAccount(double money)
        {
            account += money;
        }

        public boolean withdrawMoneyAccount(double money)
        {
            if(isMoneyEnough(money))
            {
                account -= money;
                return true;
            }

            else {
                System.out.println("Снятие невозможно");
                return false;
            }
        }
        public double getAccount()
        {
            return account;
        }

}
