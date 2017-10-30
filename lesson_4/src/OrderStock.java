
public class OrderStock {
    static Order[] orders = new Order[1000];
    private Book[] books;
    ArrayWorker worker = new ArrayWorker();

    OrderStock(Book[] books) {
        this.books = books;
    }

    void addOrder(int price, String idBook) {

        Order temp = orders[worker.searchId(orders)];

        temp.setPrice(price);
        temp.setStatus(false);
        temp.setBook(books[worker.searchId(books, idBook)]);

        orders = worker.setNewOrder(orders, orders[worker.searchId(orders)], temp);
    }

    void staffOrder(int number) {
        Order temp = orders[worker.searchId(orders)]; //Is working???

        temp.setStatus(true);
        temp.setReady(true);

        orders = worker.setNewOrder(orders, orders[worker.searchId(orders)], temp);
    }

    void cancelOrder(int number) {
        Order temp = orders[worker.searchId(orders)];

        temp.setStatus(false);
        temp.setReady(false);

        orders = worker.setNewOrder(orders, orders[worker.searchId(orders)], temp);
    }

    void stayOrder(int number, String idBook) {

        Order temp = orders[worker.searchId(orders)];

        temp.setStatus(false);
        temp.setReady(true);
        temp.setBook(books[worker.searchId(books, idBook)]);

        orders = worker.setNewOrder(orders, orders[worker.searchId(orders)], temp);
    }

}