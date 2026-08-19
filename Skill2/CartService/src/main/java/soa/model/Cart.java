package soa.model;

import jakarta.persistence.*;

@Entity
@Table(name ="cart")
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long cart_Id;
	Long user_Id;
	Long product_Id;
	int quantity;
	public Long getCart_Id() {
		return cart_Id;
	}
	public void setCart_Id(Long cart_Id) {
		this.cart_Id = cart_Id;
	}
	public Long getUser_Id() {
		return user_Id;
	}
	public void setUser_Id(Long user_Id) {
		this.user_Id = user_Id;
	}
	public Long getProduct_Id() {
		return product_Id;
	}
	public void setProduct_Id(Long product_Id) {
		this.product_Id = product_Id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	

}
