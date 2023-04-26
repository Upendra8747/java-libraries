package singleTonClass;

public class Account {
	 public static Account a=null;
	
	
	private Account() {
		System.out.println("Account created");
	}
	public static  void getInstance() {
		
	if(a==null)
		 a = new Account();
	else
		System.out.println("Account not created");
	}
}
