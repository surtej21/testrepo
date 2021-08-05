package com.cg;

import java.util.List;
import java.sql.*;

public class AccountDAOImpl implements AccountDAO {
	private Connection con;
	private PreparedStatement pst;
	
	private void makeConnection()
	{
		//try{
			con=   DbUtils.getConnection();
			 System.out.println("Connected");
		//}
		/*catch(SQLException e)
		{
			System.out.println(e);
		}
		*/
	}

	private void releaseConnection()
	{
		try{
			con.close();
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}
	@Override
	public void insertAccount(Account a) {
		try{
			makeConnection();
			pst=con.prepareStatement("insert into Account(aid,holder,balance) values(?,?,?)");
			pst.setInt(1, a.getAid());
			pst.setString(2, a.getHolder());
			pst.setDouble(3, a.getBalance());
			int i=pst.executeUpdate();
			System.out.println("Inserted Account records "+i);
			releaseConnection();
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}

	}

	@Override
	public void updateAccount(Account a) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAccount(int aid) {
		// TODO Auto-generated method stub

	}

	@Override
	public Account selectAccountByAid(int aid) {
		// TODO Auto-generated method stub
		Account ob=new Account();
		try{
			makeConnection();
			pst=con.prepareStatement("select * from Account where aid=?");
			pst.setInt(1, aid);
			ResultSet rs=pst.executeQuery();
			if(rs.next())
			{
				ob.setAid(rs.getInt("aid"));
				ob.setHolder(rs.getString("holder"));
				ob.setBalance(rs.getDouble("balance"));
			}
			
			
			releaseConnection();
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		return ob;
	}

	@Override
	public List<Account> selectAllAccount() {
		// TODO Auto-generated method stub
		return null;
	}

}
