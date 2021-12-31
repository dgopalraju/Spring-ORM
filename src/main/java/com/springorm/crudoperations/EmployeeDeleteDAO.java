package com.springorm.crudoperations;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmployeeDeleteDAO {
	public static void main(String[] args) {
		SessionUtil sessionUtil = new SessionUtil();
		Session session = sessionUtil.getSessionValue().openSession();
		Transaction transaction = session.beginTransaction();
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the employee Id to delete the record : ");
		Employee emp = (Employee) session.get(Employee.class, scn.nextInt());
		if (emp != null) {
			session.delete(emp);
			session.flush();
			transaction.commit();
			System.out.println("Record deleted successfully in the database");
		} else {
			System.out.println("Entered record not available in the database. please enter correct empId");
		}
		session.close();
		scn.close();
	}

}
