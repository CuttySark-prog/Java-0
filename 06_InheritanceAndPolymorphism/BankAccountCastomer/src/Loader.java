import Customer.Entity;
import Customer.Individual;
import Customer.individualEntrepreneur;

public class Loader
{
    public static void main(String[] args)
    {
        Individual accountIndividual = new Individual();
        individualEntrepreneur accountIndividualEntrepreneur = new individualEntrepreneur();
        Entity accountEntity = new Entity();
        accountIndividual.replenishMoneyAccount(1500.0);
        System.out.printf("На счете физ.лица стало: %.02f рублей %n", accountIndividual.getAccount());
        accountIndividual.withdrawMoneyAccount(2000.0);
        accountIndividualEntrepreneur.replenishMoneyAccount(999.0);
        System.out.printf("На счете ИП стало: %.02f рублей %n", accountIndividualEntrepreneur.getAccount());
        accountIndividualEntrepreneur.replenishMoneyAccount(1000.0);
        System.out.printf("На счете ИП стало: %.02f рублей %n", accountIndividualEntrepreneur.getAccount());
        accountEntity.replenishMoneyAccount(100000);
        System.out.printf("На счете юр.лица стало: %.02f рублей %n", accountEntity.getAccount());
        accountEntity.withdrawMoneyAccount(40000);

        System.out.printf("На счете юр.лица стало: %.02f рублей %n", accountEntity.getAccount());


    }
}
