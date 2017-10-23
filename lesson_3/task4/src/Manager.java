
class Manager {

    // Temp array's only for this classes
    private static Book books[] = {}; //books
    private static Reader readers[] = {}; //readers

    // We got arrays for changes
    Manager(Book[] books, Reader[] readers){
        this.books = books;
        this.readers = readers;
    }

    // First menu item. At the start, we get array's reader, Name book whitch need add and number this reader
    private Reader[] addReader(Reader[] readers, String name, int number){
        Reader[] tmp = new Reader[readers.length + 1];

        //We use System.arraycopy because dynamically expand array
        System.arraycopy(readers, 0, tmp, 0, readers.length);

        // Using basic method.
        tmp[tmp.length - 1].setName(name);
        tmp[tmp.length - 1].setNumber(number);

        // Return new array.
        return tmp;
    }

    // Second menu item. At the start, we get array's book, name, author and number's book
    private Book[] addBook(Book[] books, String name, String author, int number) {
        Book[] temp = new Book[books.length + 1];
        System.arraycopy(books, 0, temp, 0, books.length);

        // Using basic method.
        temp[temp.length - 1].setName(name);
        temp[temp.length - 1].setAuthor(author);
        temp[temp.length - 1].setNumber(number);

        // Return new array
        return temp;
    }

    // Third menu item. At the start, we get book which need write to reader, reader which need book, and subscribe / insubscribe.
    private void subscribeBooks(int book, int reader, boolean write){
        readers[reader - 1].setBook(books[book - 1], write);
        books[book].setMarker(write);
    }

    // Fourth menu item. We get number reader.
    private Book[] lookReader(int reader){

        // i - all books.
        // j - true book.
        int i, j = 0;
        Book[] temp = new Book[books.length];
        for(i = 0; i < books.length; i++) {

            // If reader has book,
            if (readers[reader - 1].getBook(i).getMarker() == true) {
                readers[reader - 1].setBook(books[i], true);

                // We get this book to array.
                temp[j] = readers[reader - 1].getBook(books[i].getNumber());
                j++;
            }
        }

        // return all book.
        return temp;
    }


    // Fiveth menu item. See a specific book reader's. At the start we get number of book.
    private int lookSpecificBook(int book){
        int i;
        for(i = 0; i < readers.length; i++) {
            if (books[book] == readers[i].getBook(book))
                break;
        }
        return readers[i].getNumber();
    }

    // Sixth menu item. See all books and his mark.
    private void allBooksMarker(){
        for (int i = 0; i < books.length; i++){
            books[i].getMarker();
        }
    }

    // Seventh menu item. Look all book.
    private void lookAllReadersBook(){
        for(int i = 0; i < readers.length; i++)
            readers[i].getBook(i);
    }
}
