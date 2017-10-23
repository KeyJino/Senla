
class Library extends Menu{
    // Extends user menu, if you needs it.

    // All the books in the library.
    private static Book books[] = {};

    // All readers.
    private static Reader readers[] = {};

    // Manager contains all library's functions. Go to class that you want to watch
    private Manager manager = new Manager(books, readers);
}
