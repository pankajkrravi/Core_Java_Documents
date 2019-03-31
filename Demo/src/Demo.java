import java.sql.*;
public class Demo {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		final String url1="jdbc:mysql://localhost:3306";
		final String url2="jdbc:mysql://localhost:3306?user=pankaj&password=root";
		//final String 
		String qry="INSERT INTO employee VALUES(004,'ANKITS','TESTING',45000);";
		//loading and register the driver
		Class.forName("com.mysql.jdbc.Driver");
		//establish the connection
		//Connection con=DriverManager.getConnection(url2);
		Connection con=DriverManager.getConnection(url1,"","root");
		//crate statement/ platform
		Statement stmt=con.createStatement();
		// execute
		stmt.execute(qry);
		//close te=he resources
		stmt.close();
		con.close();
		System.out.println("class losding succesfully");

	}
}
