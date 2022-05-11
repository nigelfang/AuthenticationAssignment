package model.business;

import java.sql.SQLException;

import model.dataccess.LoginDataAccess;

public class LoginBusiness {
	
	private String userName;
	
	private String password;
	
	private static LoginBusiness instance;
	
	public LoginBusiness(String userName, String password)
	{
		this.userName = userName;
		this.password = password;
	}
	
	public static LoginBusiness getInstance()
	{
		return instance;
	}
	
	public boolean verifyCredentials() throws ClassNotFoundException, SQLException
	{
		return LoginDataAccess.getInstance().verifyCredentials();
	}
	
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}
}
