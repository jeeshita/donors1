package com.Donors;
import java.io.IOException;
import java.sql.*;

public class Donors {
	public static void main (String args[] ) throws IOException{
		Class.forName("oracle.jdbc.Driver.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:8080:xe";
		Connection c= DriverManager.getConnection(url,"root","mysql");
		Statement s=c.createStatement();
		String q="select * from donors;";
		ResultSet rs= s.execute(q);
		String id=request.getParameter(id);
		String name=request.getParameter(name);
		String age=request.getParameter(age);
		String add=request.getParameter(add);
		String email=request.getParameter(email);
		String phone=request.getParameter(phone);
		String bg=request.getParameter(bg);



		String insert="insert into donors(name,age,address,email,mobile,blood) values("+name+","+age+","+add+","+email+","+phone+","+bg);";
				
	//	while(rs.next())
	//	{System.out.print();}
		 
		
		
		
	}
	
	

}
