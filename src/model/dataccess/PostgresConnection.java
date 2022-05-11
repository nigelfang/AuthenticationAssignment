package model.dataccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresConnection implements DataBaseConnection
{
	private static final String url = "jdbc:postgresql://localhost:5432/authentication";
	private static final String user = "postgres";
	private static final String password = "123";
	@Override
	public Connection getDataBaseConnection() throws SQLException
	{
		Connection connection = DriverManager.getConnection(url, user, password);
		return connection;
	}

}
