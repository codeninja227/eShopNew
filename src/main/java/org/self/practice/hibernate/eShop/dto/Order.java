package org.self.practice.hibernate.eShop.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ORDER")
public class Order implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1986660112310297924L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long orderId;
	
	@OneToMany(mappedBy="order",cascade = CascadeType.ALL)
	private Set<Item> items;
	
	private BigDecimal cost;
	
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public Set<Item> getItems() {
		return items;
	}
	public void setItems(Set<Item> items) {
		this.items = items;
	}
	public BigDecimal getCost() {
		return cost;
	}
	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", items=" + items + ", cost=" + cost + "]";
	}

}
