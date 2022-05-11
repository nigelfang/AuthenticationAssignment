package model.dataccess;

public class ConnectionFactory {

	public DataBaseConnection getConnection(String dataBase)
	{
		if (dataBase == "postgres")
			return new PostgresConnection();
		if (dataBase == "mysql")
			return new MySqlConnection();
		
		return null;
		
	}
}
