package test.service;

import java.sql.ResultSet;
import java.sql.SQLException;


import com.mysql.jdbc.PreparedStatement;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import test.been.RegistrationBeen;
import test.dbutil.CreateDbConnection;

public class LoginService extends CreateDbConnection {

	PreparedStatement ps=null;
	String query = null;
	
	public int login_method(RegistrationBeen reg) throws SQLException{
		query ="select * from tbl_login where username = ? and password = ?";
		System.out.println(reg.getUname());
		System.out.println(reg.getPassword());
		ps.setString(1, reg.getUname());
		ps.setString(2, reg.getPassword());
	
		ResultSet rs=ps.executeQuery();
		
		while(rs.next()){
			
			System.out.println(rs.getString(1));
			//	String struser= rs.getString(1);
			String strtype= rs.getString(1);
			if(strtype.equals("admin")){
				return 2;
			}
			if(strtype.equals("user")){
				return 1;
			}
		
			
		}
		return 0;
	}
	
	 
}
