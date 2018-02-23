package org.self.practice.hibernate.eShop;



import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.self.practice.hibernate.eShop.dto.Item;
import org.self.practice.hibernate.eShop.dto.Order;

public class HibernateUtil {
	private static SessionFactory sessionFactory;
	public SessionFactory getSessionFactory() {
		if (sessionFactory == null ) {
			Configuration config = new Configuration();
			config.configure("hibernate.cfg.xml");
			config.addAnnotatedClass(Item.class);
			//config.addAnnotatedClass(Order.class);
			StandardServiceRegistryBuilder standardServiceRegistryBuilder = new StandardServiceRegistryBuilder()
					.applySettings(config.getProperties());
			sessionFactory = config.buildSessionFactory(standardServiceRegistryBuilder.build());
		}
		return sessionFactory;
	}
}
