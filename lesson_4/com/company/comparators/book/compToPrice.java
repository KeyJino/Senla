package com.company.comparators.book;

import com.company.bin.Book;

import java.util.Comparator;

public class compToPrice implements Comparator<Book>{
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getPrice() - o2.getPrice();
    }
}
