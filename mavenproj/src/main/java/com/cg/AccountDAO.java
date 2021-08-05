package com.cg;

import java.util.List;

public interface AccountDAO {
	public void insertAccount(Account a);
	public void updateAccount(Account a);
	public void deleteAccount(int aid);
	public Account selectAccountByAid(int aid);
	public List<Account> selectAllAccount();
}
