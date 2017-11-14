package comparators.book;

import java.util.Comparator;
import bean.Book;

public class SortBookABC implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {

        if (o1 != null && o2 != null) {
            return o1.getName().compareTo(o2.getName());
        }

        if (o1 == null && o2 != null) {
            return 1;
        } else if (o1 != null){
            return -1;
        } else {
            return 0;
        }
    }
}
