package MySQL.Connect;
import java.sql.*;

import com.mysql.cj.jdbc.JdbcPropertySet;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException
    {
    	//Class.forName("com.mysql.jdbc.Driver");
    	String url = "jdbc:mysql://localhost:3306/world?useLegacyDatetimeCode=false&serverTimezone=America/New_York";
    	try(Connection con = DriverManager.getConnection
    			(url, "root", "haslodomysql321");
    		Statement stmt = con.createStatement();
    		ResultSet rs = stmt.executeQuery("SELECT * FROM city")){
    		
    		while(rs.next()) {
    			String s = rs.getString("Name");
    			System.out.println(s);
    		}
    		
    	}catch(SQLException ex) {
    		ex.printStackTrace();
    	}
    	
    	
    }
}
