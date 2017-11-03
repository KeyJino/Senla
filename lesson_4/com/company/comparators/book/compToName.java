package com.company.comparators.book;

import com.company.bin.Book;

import java.util.Comparator;

public class compToName implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
