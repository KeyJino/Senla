package com.company.comparators.book;


import com.company.bin.Book;

import java.util.Comparator;

public class compToStatus implements Comparator<Book>{
    @Override
    public int compare(Book o1, Book o2) {
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
