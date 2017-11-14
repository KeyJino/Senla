package comparators.order;

import bean.Order;

import java.util.Comparator;

public class SortOrderStatus implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {

        if (o1 != null && o2 != null){
            return o1.getTypeStatus().compareTo(o2.getTypeStatus());
        }

        if (o1 == null && o2 != null) {
            return 1;
        } else if (o1 != null) {
            return -1;
        } else {
            return 0;
        }

    }
}
