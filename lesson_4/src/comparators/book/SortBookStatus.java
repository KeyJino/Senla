package comparators.book;

import bean.Book;

import java.util.Comparator;

public class SortBookStatus implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {

        if (o1 != null && o2 != null) {
            return o1.getStatus().compareTo(o2.getStatus());
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
