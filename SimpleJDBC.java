import java.sql.*;
public class SimpleJDBC {
	
	public static void main(String[] args)
	throws SQLException,ClassNotFoundException{
		//load the JDBC driver
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded");
		
		//connect a database
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/test","root","root");
		System.out.println("Database connected");
		
		//create a statement
		Statement statement = connection.createStatement();
		
		//Execute a statement
		ResultSet resultSet = statement.executeQuery("select username from users");
		
		while (resultSet.next()){
			System.out.println(resultSet.getString(1));
		}
				
	}
}


