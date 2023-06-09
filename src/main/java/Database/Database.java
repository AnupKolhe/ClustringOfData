package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import Data.SendRec;

public class Database {
	
	public boolean data (SendRec sendrec) {
		boolean result=false;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","12345");
			
			PreparedStatement stmt = con.prepareStatement("insert into Process(NumberWords,TotalCount,TotalSpace,TotalLine) values(?,?,?,?)");
			stmt.setInt(1,sendrec.getWord());
			stmt.setInt(2,sendrec.getCount());
			stmt.setInt(3,sendrec.getSpace());
			stmt.setInt(4,sendrec.getLine());
			
			int count =stmt.executeUpdate();
			if(count>0) {
			result =true;
			}
			
			stmt.close();
			con.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return result;
	}
	
}
