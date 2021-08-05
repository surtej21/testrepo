package com.cg;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ob=new Account(100,"Manjiri",25000.00);
		AccountService aservice=new AccountServiceImpl();
		aservice.insertAccount(ob);
		 
		Account a=aservice.selectAccountByAid(102);
		System.out.println(a);
	}

}
