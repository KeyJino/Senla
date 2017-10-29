
class Library{

    // Temp array's only for this classes
    private static Book books[] = new Book[1000]; //books
    private static Reader readers[] = new Reader[1000]; //readers


    // First menu item. At the start, we get array's reader, Name book whitch need add and number this reader
    public void addReader(String name, int number){
        for(int i = 0; i < readers.length; i++) {
            if(readers[i] == null) {
                Reader reader = readers[i];

                // Using basic method.
                reader.setName(name);
                reader.setNumber(number);

                readers[i] = reader;
            }
        }
    }

    // Second menu item. At the start, we get array's book, name, author and number's book
    public void addBook(String name, String author, int number) {
        for(int i = 0; i < books.length; i++) {
            if(books[i] == null) {
                Book book = books[i];

                // Using basic method.
                book.setName(name);
                book.setNumber(number);

                books[i] = book;
            }
        }
    }

    // Third menu item. At the start, we get book which need write to reader, reader which need book, and subscribe / insubscribe.
    public void subscribeBooks(Book book, Reader reader, boolean write){
        readers[reader.getNumber() - 1].setBook(books[book.getNumber() - 1], write);
        books[book.getNumber()].setMarker(write);
    }

    // Fourth menu item. We get number reader.
    public Book[] lookReader(Reader reader){

        // i - all books.
        // j - true book.
        int i, j = 0;
        Book[] temp = new Book[books.length];
        for(i = 0; i < books.length; i++) {

            // If reader has book,
            if (readers[reader.getNumber() - 1].getBook(i).getMarker() == true) {
                readers[reader.getNumber() - 1].setBook(books[i], true);

                // We get this book to array.
                temp[j] = readers[reader.getNumber() - 1].getBook(books[i].getNumber());
                j++;
            }
        }

        // return all book.
        return temp;
    }


    // Fiveth menu item. See a specific book reader's. At the start we get number of book.
    public int lookSpecificBook(Book book) {
        int i;
        for (i = 0; i < readers.length; i++) {
            if (books[book.getNumber()] == readers[i].getBook(book.getNumber())) {
                break;
            }
        }
        return readers[i].getNumber();
    }

    // Sixth menu item. See all books and his mark.
    public void allBooksMarker(){
        for (int i = 0; i < books.length; i++){
            books[i].getMarker();
        }
    }

    // Seventh menu item. Look all book.
    public void lookAllReadersBook(){
        for(int i = 0; i < readers.length; i++)
            readers[i].getBook(i);
    }

    Book[] getBooks(){
        return books;
    }

    Reader[] getReaders(){
        return readers;
    }

}
