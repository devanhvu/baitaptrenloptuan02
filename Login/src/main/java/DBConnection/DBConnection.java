package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private final String serverName = "DESKTOP-UNJLSIC\\SQLSERVER";
	private final String dbName = "laptrinhwweb";
	private final String portNumber ="1433";
	private final String instance = "";
	private final String userID = "sa";
	private final String password = "123";


	public Connection getConnection() throws Exception{
		String url =
				"jdbc:sqlserver://" + serverName + "\\" + instance + ":" + portNumber +
				";databaseName=" + dbName;
				if (instance == null || instance.trim().isEmpty())
				url =
				"jdbc:sqlserver://"+serverName+":"+portNumber
				+";databaseName="+dbName;
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				return DriverManager.getConnection(url, userID, password);
	}
	
	public static void main(String[] args) {
		try {
		System.out.println(new DBConnection().getConnection());
		} catch (Exception e) {
		e.printStackTrace();
		}
		}
}
