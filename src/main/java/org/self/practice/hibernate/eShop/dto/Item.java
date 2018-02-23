package org.self.practice.hibernate.eShop.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
@Entity
@Table(name="Items")
public class Item implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 797587238681036258L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long itemId;
	
	
	private String itemName;
	private BigDecimal itemCost;
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public BigDecimal getItemCost() {
		return itemCost;
	}
	public void setItemCost(BigDecimal itemCost) {
		this.itemCost = itemCost;
	}
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", itemCost=" + itemCost + "]";
	}
	
	
	
	
	
	
}
