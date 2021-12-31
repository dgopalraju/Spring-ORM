package com.springorm.crudoperations;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmployeeCreateDao {
	public static void main(String[] args) throws Exception {
		SessionUtil sessionUtil = new SessionUtil();
		Session session = sessionUtil.getSessionValue().openSession();
		Transaction transaction = session.beginTransaction();
		Scanner scn = new Scanner(System.in);
		Employee emp = new Employee();
		System.out.println("Enter the employee Id");
		emp.setEid(scn.nextInt());
		System.out.println("Enter the employee Name");
		emp.setEname(scn.next());
		System.out.println("Enter the employee Email");
		emp.setEmail(scn.next());
		System.out.println("Enter the Createdby name");
		emp.setCreatedBy(scn.next());
		emp.setCreatedOn(new Timestamp(Calendar.getInstance().getTime().getTime()));
		session.save(emp);
		session.flush();
		transaction.commit();
		System.out.println("Requested record is successfully stored in the database");
		session.close();
		scn.close();

	}

}
