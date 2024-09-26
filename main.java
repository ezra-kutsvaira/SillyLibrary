package SillyLibrary;

public class main {
    public static void main(String[] args) {
                Library library1 = new Library("Stodart Library", 100);
                Library library2 = new Library("Tauya Library", 450);
                Library library3 = new Library("Muzhanje Library", 200);


                // Display total number of libraries and total books
                System.out.println("Total Libraries: " + Library.getTotalLibraries());
                System.out.println("Total Books: " + Library.getTotalBooks());

                // Display individual library details
                System.out.println(library1.getLibraryName() + " has " + library1.getBooksInThisLibrary() + " books.");
                System.out.println(library2.getLibraryName() + " has " + library2.getBooksInThisLibrary() + " books.");
                System.out.println(library3.getLibraryName() + " has " + library3.getBooksInThisLibrary() + " books.");
            }
        }

