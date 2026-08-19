package soa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import soa.models.Order;
import soa.service.OrderService;

@RestController
@RequestMapping("api")
public class OrderController {
	@Autowired
	OrderService OS;
	public OrderController(OrderService OS) {
		this.OS=OS;
	}

	@GetMapping("orders")
	public Object getOrders() {
		return OS.getAllOrders();
	}
	
	@PostMapping("orders")
	public Object order(@RequestBody Order order) {
		return OS.placeOrder(order);
	}

}
