package com.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.db.Db;
import com.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public boolean addEmployee(Employee emp) {
		String sql="insert into employee(fname,lname,gender,country,city,state,company,department,post,salary) values(?,?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement pstm =Db.connectDb().prepareStatement(sql);
			pstm.setString(1, emp.getFname());
			pstm.setString(2,emp.getLname() );
			pstm.setString(3,emp.getGender() );
			pstm.setString(4,emp.getCountry() );
			pstm.setString(5,emp.getCity() );
			pstm.setString(6,emp.getState() );
			pstm.setString(7,emp.getCompany() );
			pstm.setString(8,emp.getDepartment());
			pstm.setString(9,emp.getPost() );
			pstm.setInt(10,emp.getSalary() );
			//pstm.setString(4,emp.getContact() );
			//pstm.setString(4,emp.getEmail() );
			//pstm.setDate(9,emp.getJoinDate());
			//pstm.setInt(8,emp.getAge() );
			//pstm.setDate(9,emp.getDob());
			//pstm.setString(14,emp.getPhoto() );
			pstm.execute();
			return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean deleteEmployee(int id) {
		String sql="delete from employee where id='"+id+"'";
		Statement stm;
		try {
			stm = Db.connectDb().createStatement();
			stm.execute(sql);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Employee getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		List<Employee> emplist =new ArrayList<>();
		String sql="select * from employee";
		try {
			Statement stm=Db.connectDb().createStatement();
			ResultSet rs=stm.executeQuery(sql);
			while(rs.next()) {
				Employee emp=new Employee();
				emp.setId(rs.getInt("id"));
				//emp.setAge(rs.getInt("age"));
				emp.setCity(rs.getString("city"));
				emp.setCompany(rs.getString("company"));
				//emp.setContact(rs.getString("contact"));
				emplist.add(emp);
				
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return emplist;
		//return null;
	}

	@Override
	public List<Employee> search(String data) {
		
		// TODO Auto-generated method stub
		List<Employee> emplist =new ArrayList<>();
		String sql="select * from employee where fname like '%"+data+"%' ";// or post like 
		try {
			Statement stm=Db.connectDb().createStatement();
			ResultSet rs=stm.executeQuery(sql);
			while(rs.next()) {
				Employee emp=new Employee();
				emp.setId(rs.getInt("id"));
				//emp.setAge(rs.getInt("age"));
				emp.setCity(rs.getString("city"));
				emp.setCompany(rs.getString("company"));
				//emp.setContact(rs.getString("contact"));
				emplist.add(emp);
				
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return emplist;
		//return null;
	}
	

}
