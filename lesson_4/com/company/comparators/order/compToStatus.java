package com.company.comparators.order;

import com.company.bin.Book;
import com.company.bin.Order;

import java.util.Comparator;

public class compToStatus implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        if(o1.getStatus() == true && o2.getStatus() == false) {
            return 1;
        }
        else if(o2.getStatus() == true && o1.getStatus() == false) {
            return -1;
        }
        else {
            return 0;
        }
    }
}