package org.self.practice.hibernate.eShop.dto;

public interface OrderDao {
	public int saveOrder(Order o);
	public Order getOrder(long orderId);
	public boolean deleteOrder(long orderId);
	
}
