package comparators.book;

import bean.Book;

import java.util.Comparator;

public class SortBookDateRegister implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {

        if (o1 != null && o2 != null) {
            return o1.getDateRegister().compareTo(o2.getDateRegister());
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
