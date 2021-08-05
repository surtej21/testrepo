package com.cg;

import java.util.List;

public interface AccountService {
	public void insertAccount(Account a);
	public void withdraw(double amount,Account a);
	public void deposite(double amount,Account a);
	public void deleteAccount(int aid);
	public Account selectAccountByAid(int aid);
	public List<Account> selectAllAccount();
}
