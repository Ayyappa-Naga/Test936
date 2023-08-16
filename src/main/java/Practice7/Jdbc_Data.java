package Practice7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class Jdbc_Data {
	public static void main(String[] args) throws Exception {
		
		Driver jdriver = new Driver();
		DriverManager.registerDriver(jdriver);
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/classonly","root","Ayyappa@1");
		Statement stat= connection.createStatement();
	String 	SelectQuery ="SELECT * FROM EMP";
	String udata="insert into emp(first_name,last_name,address)values('komal','kiran','Chennai')";
	ResultSet result = stat.executeQuery(SelectQuery);
	while(result.next()) {
		System.out.println(result.getString(1)+" "+result.getString(2)+" "+result.getString(3)+" "+result.getString(4));
	}
		
	int result1 = stat.executeUpdate(udata);
	if(result1==1) {
		System.out.println("data updated ");
	}
	else {
		System.out.println("data not updated ");
	}
	
		connection.close();
		
	}

}
