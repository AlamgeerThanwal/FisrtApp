package vdb;
import java.sql.*;
public class Db {
public static synchronized  Connection connect()
	{
		Connection con=null;
		try{
			String url    =  "jdbc:mysql://localhost:3306/";
		    String db     =  "bluebook";
		    String driver =  "com.mysql.jdbc.Driver";
		    String user   =  "root";
		    String pass   =  "root";
		      Class.forName(driver).newInstance();
		      con = DriverManager.getConnection(url+db, user, pass);
		      System.out.println("Connected to database.");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}
public static synchronized ResultSet getTable(Connection con,String tablename)
{
	ResultSet rs=null;
	try
	{
	PreparedStatement pst=con.prepareStatement("select * from "+tablename);
	rs=pst.executeQuery();
	
	}
	catch (Exception e) 
	{
		System.out.println(e);
	}
	System.out.println(tablename+" table retrieved successfully");
	return rs;
}
public static synchronized ResultSet getSelected(Connection con,String query)
{
	ResultSet rs=null;
	try
	{
	PreparedStatement pst=con.prepareStatement(query);
	rs=pst.executeQuery();	
	}
	catch (Exception e) 
	{
		System.out.println(e);
	}
	System.out.println("Executing: "+query+"\nRows retrieved successfully");
	return rs;
}
public static synchronized void insert(Connection con,String query)
{
	int stat=0;
	try
	{
	PreparedStatement pst=con.prepareStatement(query);
	stat=pst.executeUpdate();	
	}
	catch (Exception e) 
	{
		System.out.println(e);
	}
	if(stat==1)
	{
		System.out.println("Executing: "+query+"\ninserted successfully");
	}
	else
	{
		System.out.println("Executing: "+query+"\ninsertion failed");
	}
}
public static synchronized void update(Connection con,String query)
{
	int stat=0;
	try
	{
	PreparedStatement pst=con.prepareStatement(query);
	stat=pst.executeUpdate();	
	}
	catch (Exception e) 
	{
		System.out.println(e);
	}
	if(stat==1)
	{
		System.out.println("Executing: "+query+"\nupdated successfully");
	}
	else
	{
		System.out.println("Executing: "+query+"\nupdation failed");
	}
}
public static synchronized void deleteTable(Connection con,String tablename)
{
	int stat=0;
	try
	{
	PreparedStatement pst=con.prepareStatement("delete from "+tablename);
	stat=pst.executeUpdate();	
	}
	catch (Exception e) 
	{
		System.out.println(e);
	}
	if(stat==1)
	{
		System.out.println(tablename+" deleted successfully");
	}
	else
	{
		System.out.println(tablename+" deletion failed");
	}
}
}
