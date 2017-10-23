
class Reader {

    private String name;
    private int number;
    private Book[] books;

    Reader(String name, int number){
        this.name = name;
        this.number = number;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getNumber(){
        return this.number;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public void setBook(Book book, boolean write){
        Book[] tmp = new Book[books.length + 1];
        System.arraycopy(books, 0, tmp, 0, books.length);
        if(write == true)
            tmp[tmp.length - 1] = book;
        else
            tmp = books;
        books = tmp;
    }

    public Book getBook(int number) {
        int i;
        for (i = 0; i < books.length; i++) {
            if (books[i].getNumber() == number - 1)
                break;
            else i = 0;
        }
        return books[i];
    }

}
