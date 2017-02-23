package test.service;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import test.been.RegistrationBeen;
import test.dbutil.CreateDbConnection;

public class RegistrationService extends CreateDbConnection {
	PreparedStatement ps=null;
	PreparedStatement ps1=null;
	String query=null;
	String query1=null;
	int rt=-1;
	int rt1=-1;
	
	
	public int register(RegistrationBeen reg) 
	{
		System.out.println("Registration service");
		query="insert into tbl_user (vchr_user_fname,vchr_user_lname,vchr_user_gender,vchr_user_address,vchr_user_email,vchr_user_password,image)"
				+ " values (?,?,?,?,?,?,?)";
		
		try {
			ps=super.createConnection().prepareStatement(query);
			ps.setString(1, reg.getFname());
			ps.setString(2, reg.getLname());
			ps.setString(3, reg.getGender());
			ps.setString(4, reg.getAddress());
			ps.setString(5, reg.getEmail());
			ps.setString(6, reg.getPassword());
			ps.setString(7, reg.getFilename());
			
			rt=ps.executeUpdate();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 		
		return rt;
		
	}
	
	public int login_data(RegistrationBeen reg1){
		
		System.out.println("login service");
		query1="insert into tbl_login (username,password,type)"+" values (?,?,?)";
		
		try {
			ps1=super.createConnection().prepareStatement(query1);
			ps1.setString(1, reg1.getEmail());
			ps1.setString(2, reg1.getPassword());
			ps1.setString(3, "user");
		
			rt1=ps1.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rt1;
		
	}

}
