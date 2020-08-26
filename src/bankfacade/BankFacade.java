package bankfacade;

import bankcustomers.BankAccount;
import bankcustomers.BankCustomer;
import bankcustomers.FacadeClass;
import gencustaccount.AccountIf;
import gencustaccount.CustomerIf;
import java.util.ArrayList;


public class BankFacade {



     public static void main(String[] args) {


      ArrayList<AccountIf> cust1Accounts = new ArrayList();
       AccountIf acc = new BankAccount(000011);
       cust1Accounts.add(acc); //acc1ofcust1
       acc = new BankAccount(000012);
       cust1Accounts.add(acc); //acc2ofcust1
       CustomerIf cust1 = new BankCustomer("John", cust1Accounts);


       ArrayList<AccountIf> cust2Accounts = new ArrayList();
       acc = new BankAccount(000021);
       cust2Accounts.add(acc); //acc1ofcust2
       acc = new BankAccount(000022);
       cust2Accounts.add(acc); //acc2ofcust2
       CustomerIf cust2 = new BankCustomer("Johny", cust2Accounts);


       FacadeClass obj = FacadeClass.getMyFacade();

       obj.doDeposit(1500.00, cust1, 000011);
       obj.doDeposit(500.00, cust1, 000012);

       obj.doDeposit(2400.00, cust2, 000021);
       obj.doDeposit(5500.00, cust2, 000022);

       obj.getbankAccount(cust1,000011);
       obj.getbankAccount(cust1, 000012);

       obj.getbankAccount(cust2, 000021);
       obj.getbankAccount(cust2, 000022);

       obj.getBankCustomer(cust1);

    }

}