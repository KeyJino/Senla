package comparators.order;

import bean.Order;

import java.util.Comparator;

public class SortOrderDate implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {

        if (o1 != null && o2 != null) {
            return o1.getDateFinish().compareTo(o2.getDateFinish());
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
