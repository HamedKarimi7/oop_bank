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
        System.out.println(account1.getBanalce());//0
        account1.deposit(100);
        System.out.println(account1.getBanalce());//100
        account1.withdraw(50);
        System.out.println(account1.getBanalce());//50



        Customer customer2 = new Customer("H2i", "hmd2.rtj@gmail.com", "09872433");
        BankAccount account2 = new BankAccount(1, customer2);
        System.out.println(account2.getBanalce());//0

    }
}
