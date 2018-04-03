package com.sravanthi.java;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmployeeImplimentation implements EmployeeData {
	public void save(int id, String Name, String Address,double salary)throws Exception{

		String sql = ("insert into emp values("+id+", '"+Name+"',"+salary+"+");
		Connection con = null;
        try{
                Class.forName("org.h2.Driver");
                con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test");
                java.sql.Statement st = con.createStatement();
                st.executeUpdate(sql);
        }catch(Exception e){
                e.printStackTrace();
        }finally{
                try{
                        if(con!=null)
                                con.close();
                }catch(Exception e){}
        }
}

	@Override
	public boolean update(int empAddress, double salary) {
		String empNo;
		String sql = "update emp set salary=salary+"+salary+" where empAddress="+empAddress;
        Connection con = null;
        boolean flag = false;
        try{
                Class.forName("org.h2.Driver");
                con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test");
                Statement st = (Statement) con.createStatement();
                if(((java.sql.Statement) st).executeUpdate(sql)>0){
                        flag = true;
                }
        }catch(Exception e){
                e.printStackTrace();
        }finally{
                try{
                        if(con!=null)
                                con.close();
                }catch(Exception e){}
        }
        return flag;
		
	}

	@Override
	public String delete(String empName){
		String sql = "delete from emp where empName="+empName;
        Connection con = null;
        boolean flag = false;
        try{
                Class.forName("org.h2.Driver");
                con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test");
                java.sql.Statement st = con.createStatement();
                if(st.executeUpdate(sql)>0){
                        flag = true;
                }
        }catch(Exception e){
                e.printStackTrace();
        }
        finally{
                try{
                        if(con!=null)
                                con.close();
                }
                catch(Exception e){}
        }
        return flag;

	}

	public String get(double salary) {
		// TODO Auto-generated method stub
		   String sql = "select * from emp where salary="+salary;
           StringBuilder sb = new StringBuilder();
           Connection con = null;
           try{
                   Class.forName("org.h2.Driver");
                   con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test");
                   java.sql.Statement st = con.createStatement();
                   ResultSet rs = st.executeQuery(sql);
                   if(rs.next()){
                           sb.append(rs.getInt(1));
                           sb.append("t");
                           sb.append(rs.getString(2));
                           sb.append("t");
                           sb.append(rs.getDouble(3));
                           sb.append("t");
                           sb.append(rs.getInt(4));
                   }
           }catch(Exception e){
                   e.printStackTrace();
           }finally{
                   try{
                           if(con!=null)
                                   con.close();
                   }catch(Exception e){}
           }
           return sb.toString();
   }

	@Override
	public void create(int id, String Name, String Address, double salary) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getEmp(double salary) {
		// TODO Auto-generated method stub
		
	}

		
	


		
	}
	

