package com.springorm.crudoperations;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class SessionUtil {
	public SessionFactory getSessionValue() {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(com.springorm.crudoperations.Employee.class);
		ServiceRegistry serviceRe = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		SessionFactory sessionFactory = config.buildSessionFactory(serviceRe);
		return sessionFactory;
	}
}
