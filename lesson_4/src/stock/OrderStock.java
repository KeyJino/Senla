package stock;

import utility.ArrayWorker;
import utility.Checker;
import bean.Order;
import utility.enums.TypeStatus;

public class OrderStock {

    private Order[] orders = new Order[50];
    private Order[] finishOrder;


    public Order[] getOrders() {
        return orders;
    }

    public void setOrders(Order[] orders) {
        this.orders = orders;
    }

    public Order[] getFinishOrder(){
        return finishOrder;
    }

    public void refreshFinishOrder(){
        int count = 0;
        for (Order order : orders) {
            if (order != null && order.isFinish()) {
                count++;
            }
        }
        Order[] executedOrders = new Order[count];

        for (Order order : orders) {
            if (Checker.getPosition(executedOrders) != -1 && order != null && order.isFinish()) {
                int position = Checker.getPosition(executedOrders);
                executedOrders[position] = order;
            }
        }
        this.finishOrder = executedOrders;
    }

    public void addOrder(Order order){
        if (Checker.getPosition(orders) == -1) {
            orders = ArrayWorker.extendArray(orders);
        }
        int position = Checker.getPosition(orders);
        orders [position] = order;
    }

    public void cancelOrder(Order order){
        order.setTypeStatus(TypeStatus.CANCEL);
    }
}
