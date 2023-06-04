package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CustomersOrders;
import com.example.demo.repository.OrdersRepository;

@Service
public class OrderService {

	@Autowired
	private OrdersRepository order_repo;

	public CustomersOrders addNewOrder(CustomersOrders order) {
		return this.order_repo.save(order);
	}

	public void deleteOrder(long id) {
		this.order_repo.deleteById(id);
	}

	public CustomersOrders getOrderById(long id) {
		return this.order_repo.findById(id).get();
	}

	public CustomersOrders updateOrder(CustomersOrders newOrder) {
		CustomersOrders oldOrder = this.getOrderById(newOrder.getOrderId());
		oldOrder.setAmount(newOrder.getAmount());
		oldOrder.setDeliveryDate(newOrder.getDeliveryDate());
		oldOrder.setPaid(newOrder.isPaid());
		oldOrder.setProductId(newOrder.getProductId());
		return this.order_repo.save(oldOrder);
	}

	public List<CustomersOrders> getAllOrderes() {
		return this.order_repo.findAll();
	}

}
