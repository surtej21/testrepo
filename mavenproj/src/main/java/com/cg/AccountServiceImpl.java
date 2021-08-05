package com.cg;

import java.util.List;

public class AccountServiceImpl implements AccountService{
	AccountDAO dao=new AccountDAOImpl();
	
	@Override
	public void insertAccount(Account a) {
		// TODO Auto-generated method stub
		dao.insertAccount(a);
	}

	@Override
	public void withdraw(double amount, Account a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deposite(double amount, Account a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAccount(int aid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Account selectAccountByAid(int aid) {
		// TODO Auto-generated method stub
		return dao.selectAccountByAid(aid);
	}

	@Override
	public List<Account> selectAllAccount() {
		// TODO Auto-generated method stub
		return null;
	}

}
