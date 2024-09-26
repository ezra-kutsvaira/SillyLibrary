package SillyLibrary;

public class Library {
    static {
        System.out.println("Library system is initializing");
    }
    //static variables to store total Libraries and books
    private static int totalLibraries = 0;
    private static int totalBooks = 0;

    //Instance Variables
    private String libraryName;
    private int booksInThisLibrary;

    // Constructor
    public Library(String name, int books) {
        this.libraryName = name;
        this.booksInThisLibrary = books;
        totalLibraries++;  // Increment total libraries count
        totalBooks += books;  // Add books to total count
    }


    // Getter for total libraries
    public static int getTotalLibraries() {
        return totalLibraries;
    }

    // Getter for total books
    public static int getTotalBooks() {
        return totalBooks;
    }

    // Getter for the library name
    public String getLibraryName() {
        return libraryName;
    }

    // Getter for the number of books in this library
    public int getBooksInThisLibrary() {
        return booksInThisLibrary;
    }
}


