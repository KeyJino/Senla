package comparators.order;

import bean.Order;

import java.util.Comparator;

public class SortOrderPrice implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {

        if (o1 != null && o2 != null) {
            return Integer.compare(o1.getPrice(), o2.getPrice());
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
