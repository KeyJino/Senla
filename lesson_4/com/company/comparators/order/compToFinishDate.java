package com.company.comparators.order;

import com.company.bin.Order;

import java.util.Comparator;

public class compToFinishDate implements Comparator<Order> {
        @Override
        public int compare(Order o1, Order o2) {
            return o1.getFinishDate().compareTo(o2.getFinishDate());
        }
    }


