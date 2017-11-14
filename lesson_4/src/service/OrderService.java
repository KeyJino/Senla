package service;

import stock.OrderStock;
import bean.Order;
import comparators.order.*;

import java.util.Arrays;

public class OrderService {

    private OrderStock orderStock;


    public OrderService(OrderStock orderStock) {
        this.orderStock = orderStock;
    }


    public OrderStock getOrderStock() {
        return orderStock;
    }

    public int getTotalPrice(){
        int sum = 0;
        for (Order order: orderStock.getFinishOrder()) {
            sum += order.getPrice();
        }
        return sum;
    }
    
    public int getFinishOrders(){
        return orderStock.getFinishOrder().length;
    }

    public Order[] sortOrderDate(){
        Arrays.sort(orderStock.getOrders(), new SortOrderDate());
        return orderStock.getOrders();
    }

    public Order[] sortOrderPrice(){
        Arrays.sort(orderStock.getOrders(), new SortOrderPrice());
        return orderStock.getOrders();
    }

    public Order[] sortOrderStatus(){
        Arrays.sort(orderStock.getOrders(), new SortOrderStatus());
        return orderStock.getOrders();
    }

    public Order[] sortFinishOrderDate(){
        orderStock.refreshFinishOrder();
        Arrays.sort(orderStock.getFinishOrder(), new SortOrderDate());
        return orderStock.getFinishOrder();
    }

    public Order[] sortFinishOrderPrice(){
        orderStock.refreshFinishOrder();
        Arrays.sort(orderStock.getFinishOrder(), new SortOrderPrice());
        return orderStock.getFinishOrder();
    }
}
