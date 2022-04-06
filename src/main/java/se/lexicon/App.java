package se.lexicon;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      Customer customer1 = new Customer("Hamed Karimi", "hmdkrm.rtj@gmail.com", "098765433");
      BankAccount account1 = new BankAccount(1, customer1);
        System.out.println(account1.getBanalce());
        account1.deposit(100);
        System.out.println(account1.getBanalce());
        account1.withdraw(50);
        System.out.println(account1.getBanalce());


    }
}
