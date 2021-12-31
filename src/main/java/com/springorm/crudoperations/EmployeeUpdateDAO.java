package com.springorm.crudoperations;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmployeeUpdateDAO {
	public static void main(String[] args) {
		SessionUtil sessionUtil = new SessionUtil();
		Session session = sessionUtil.getSessionValue().openSession();
		Transaction transaction = session.beginTransaction();
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the employee Id to Update : ");
		Employee emp = (Employee) session.get(Employee.class, scn.nextInt());
		if (emp != null) {
			System.out.println("Enter a new email to update : ");
			emp.setEmail(scn.next());
			session.update(emp);
			session.flush();
			transaction.commit();
			System.out.println("Email updated successfully");
		} else {
			System.out.println("Entered record not available in the database. please enter correct empId");
		}
		session.close();
		scn.close();
	}

}
