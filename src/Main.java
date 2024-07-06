//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

        public static void main(String[] args) {
            // Create a Bank
            Bank myBank = new Bank("My Bank");

            // Add Branches
            myBank.addBranch("Downtown Branch");
            myBank.addBranch("Uptown Branch");

            // Add Customers to a Branch
            Branch downtown = myBank.findBranch("Downtown Branch");
            if (downtown != null) {
                downtown.addCustomer("Alice");
                downtown.addCustomer("Bob");
            }

            // Show how many customers are in the Downtown Branch
            if (downtown != null) {
                int customerCount = downtown.getCustomerCount();
                System.out.println("The Downtown Branch has " + customerCount + " customers.");
            }

            // Add Transactions to a Customer
            Customer alice = downtown.findCustomer("Alice");
            if (alice != null) {
                alice.addTransaction(100.0); // Alice deposits $100
                alice.addTransaction(-50.0); // Alice withdraws $50
            }
        }
    }