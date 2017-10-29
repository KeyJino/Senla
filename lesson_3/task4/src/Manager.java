
class Manager {
    Library library = new Library();

    Manager(){
        library.addBook("Harry Potter", " J. K. Rowling", 1);
        library.addReader("Vasya", 1);
        library.subscribeBooks(library.getBooks()[1], library.getReaders()[1], true);
        library.lookReader(library.getReaders()[1]);
        library.lookSpecificBook(library.getBooks()[1]);
        library.allBooksMarker();
        library.lookAllReadersBook();
    }
}
