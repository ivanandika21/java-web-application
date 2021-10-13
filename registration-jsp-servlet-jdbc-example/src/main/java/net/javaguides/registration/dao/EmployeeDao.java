package net.javaguides.registration.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import net.javaguides.registration.model.Employee;

public class EmployeeDao {
	public int registerEmployee(Employee employee) throws ClassNotFoundException {
		String INSERT_USERS_SQL = "INSERT INTO employee(id, first_name, last_name, username, password, address, contact) VALUES (?, ?, ?, ?, ?, ?, ?);";
		
		int result = 0;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employees?allowPublicKeyRetrieval=true&useSSL=false", "root", "admin");
			PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)){
			preparedStatement.setInt(1, 1);
			preparedStatement.setString(2, employee.getFirstName());
			preparedStatement.setString(3, employee.getLastName());
			preparedStatement.setString(4, employee.getUsername());
			preparedStatement.setString(5, employee.getPassword());
			preparedStatement.setString(6, employee.getAddress());
			preparedStatement.setString(7, employee.getContact());
			
			System.out.println(preparedStatement);
			result = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
