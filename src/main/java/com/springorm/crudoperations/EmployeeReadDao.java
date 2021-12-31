package com.springorm.crudoperations;

import java.util.Scanner;

import org.hibernate.Session;

public class EmployeeReadDao {
	public static void main(String[] args) {
		SessionUtil sessionUtil = new SessionUtil();
		Session session = sessionUtil.getSessionValue().openSession();
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the employee Id : ");
		Employee emp = (Employee) session.get(Employee.class, scn.nextInt());
		if (emp != null)
			System.out.println("Employee Name = " + emp.getEname() + "\n" + "Employee email = " + emp.getEmail() + "\n"
					+ "Employee created by = " + emp.getCreatedBy() + "\n" + "Employee record created date = "
					+ emp.getCreatedOn());
		else
			System.out.println("Entered record not available in the database. please enter correct empId");
		session.close();
		scn.close();
	}
}
