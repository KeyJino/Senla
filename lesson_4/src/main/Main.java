package main;

import utility.enums.TypeSort;
import facade.ShopBook;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        ShopBook shopBook = new Data().downloadData();

        shopBook.printSortBook(TypeSort.PRICE);

        shopBook.printSortOrder(TypeSort.DATE);

        shopBook.saveShopData();
    }
}

