package files;
public class BookShop implements BookShopOperations {
    private String name;
    private Book[] listOfBooks;
    private int count; // tracks how many books are currently stored

    // Default constructor
    public BookShop() {
        this.name = "";
        this.listOfBooks = new Book[100];
        this.count = 0;
    }

    // Parameterized constructor
    public BookShop(String name) {
        this.name = name;
        this.listOfBooks = new Book[100];
        this.count = 0;
    }

    // Setter & Getter
    public void setName(String name) { this.name = name; }
    public String getName()          { return name; }

    @Override
    public boolean insertBook(Book b) {
        if (count < 100) {
            listOfBooks[count] = b;
            count++;
            System.out.println("Book \"" + b.getBookTitle() + "\" inserted successfully.");
            return true;
        }
        System.out.println("BookShop is full. Cannot insert more books.");
        return false;
    }

    @Override
    public boolean removeBook(Book b) {
        for (int i = 0; i < count; i++) {
            if (listOfBooks[i].getIsbn().equals(b.getIsbn())) {
                // Shift remaining books left
                for (int j = i; j < count - 1; j++) {
                    listOfBooks[j] = listOfBooks[j + 1];
                }
                listOfBooks[count - 1] = null;
                count--;
                System.out.println("Book \"" + b.getBookTitle() + "\" removed successfully.");
                return true;
            }
        }
        System.out.println("Book not found in the shop.");
        return false;
    }

    @Override
    public void showAllBooks() {
        System.out.println("\n===== All Books in " + name + " =====");
        if (count == 0) {
            System.out.println("No books available.");
        } else {
            for (int i = 0; i < count; i++) {
                listOfBooks[i].showDetails(); // Polymorphism
            }
        }
        System.out.println("=====================================\n");
    }

    @Override
    public Book searchBook(String isbn) {
        for (int i = 0; i < count; i++) {
            if (listOfBooks[i].getIsbn().equals(isbn)) {
                System.out.println("Book found:");
                listOfBooks[i].showDetails();
                return listOfBooks[i];
            }
        }
        System.out.println("No book found with ISBN: " + isbn);
        return null;
    }
}
