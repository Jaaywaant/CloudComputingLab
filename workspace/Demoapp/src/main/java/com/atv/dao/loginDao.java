package com.atv.dao;

import java.sql.*;
import java.sql.DriverManager;

public class loginDao {
	String sql = "select * from atharva_111915021_detail where Employee_ID_Number=? and pass=?";
	String url = "jdbc:mysql://127.0.0.1:3306/students";
	String username = "root";
	String password = "Athuvarade6";
	public boolean check(Integer Employee_ID_Number, String pass)
	{
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,username,password);
		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, Employee_ID_Number);
		st.setString(2, pass);
		ResultSet rs = st.executeQuery();
		if(rs.next())
		{
			return true;
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
		return false;
	}
}
