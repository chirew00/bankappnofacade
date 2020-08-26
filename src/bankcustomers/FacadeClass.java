package bankcustomers;

import gencustaccount.AccountIf;
import gencustaccount.CustomerIf;

import java.util.ArrayList;




public class FacadeClass {


    AccountIf acc ;
    CustomerIf cust;


    private static FacadeClass myFacadeObj = null;
        public FacadeClass() {}


    public static FacadeClass getMyFacade(){
        if (myFacadeObj == null) {
            myFacadeObj = new FacadeClass();
        }
        return myFacadeObj;
    }

    public void doDeposit(double amt , CustomerIf cust,int accNo){
        cust.getAccount(accNo).deposit(amt);

    }
   public void getbankAccount(CustomerIf cust,int accNo){
       acc = cust.getAccount(accNo);
       System.out.println("Account number " + acc.getAccountNumber() + " has " + acc.getBalance());
   }

   public void getBankCustomer(CustomerIf cust){

        System.out.println("All Account of "+cust.getCustomerName());
        ArrayList<AccountIf> accounts = cust.getllAccounts();
            for(AccountIf account : accounts) {
            System.out.println("Account number " + account.getAccountNumber() + " has " + account.getBalance());
       }

       
   }



}