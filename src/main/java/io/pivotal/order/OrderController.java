package io.pivotal.order;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	
	@Autowired
	private OrderRepository or;

	@GetMapping("/orders")
	public List<Order> getAllOrders() {
		return or.findAll();
	}
	
	@PostMapping("/orders")
	public void saveOrder (@RequestBody List<Order> order) {
		
		or.saveAll(order);
	}
}
