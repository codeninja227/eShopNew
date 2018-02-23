package org.self.practice.hibernate.eShop;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.self.practice.hibernate.eShop.dto.Item;
import org.self.practice.hibernate.eShop.dto.Order;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        HibernateUtil util = new HibernateUtil();
        SessionFactory sf = util.getSessionFactory();
        Session session = sf.openSession();
        Item item = new Item();
        item.setItemCost(BigDecimal.valueOf(8.0));
        
       /* Item item1 = new Item();
        item1.setItemCost(BigDecimal.valueOf(55.0));
        item1.setItemName("shirt");
        
        Set<Item> items = new HashSet<Item>();
        items.add(item);
        items.add(item1);
        
        Order o = new Order();
        o.setItems(items); */
        
        	try {
				Transaction tx = session.beginTransaction();
				tx.begin();
				session.saveOrUpdate(item);
				System.out.println(item);
				session.flush();
				tx.commit();
			} catch (Exception e) {
				// TODO: handle exception
			}
    }
}
