package com.atv.dao;
import java.sql.*;
import java.sql.DriverManager;

public class SignupDao {
	String sql = "insert into atharva_111915021_detail (Employee_ID_Number,pass,Fname,Lname,DOB,contact) values(?,?,?,?,?,?)";
	String url = "jdbc:mysql://127.0.0.1:3306/students";
	String username = "root";
	String password = "Athuvarade6";
	public void insert(Integer Employee_ID_Number, String pass, String Fname, String Lname, Date DOB, Integer Contact)
	{
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,username,password);
		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, Employee_ID_Number);
		st.setString(2, pass);
		st.setString(3, Fname);
		st.setString(4, Lname);
		st.setDate(5, DOB);
		st.setInt(6, Contact);
		st.executeUpdate();

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	}
}