// ─────────────────────────────────────────────
//  Interfaces
// ─────────────────────────────────────────────

interface BookOperations {
    void addQuantity(int amount);
    void sellQuantity(int amount);
}

interface BookShopOperations {
    boolean insertBook(Book b);
    boolean removeBook(Book b);
    void showAllBooks();
    Book searchBook(String isbn);
}

// ─────────────────────────────────────────────
//  Abstract class: Book  (implements BookOperations)
// ─────────────────────────────────────────────

abstract class Book implements BookOperations {

    private String isbn; 
    private String bookTitle;
    private String authorName;
    private double price;
    private int availableQuantity;

    // Default constructor
    public Book() {
        this.isbn            = "";
        this.bookTitle       = "";
        this.authorName      = "";
        this.price           = 0.0;
        this.availableQuantity = 0;
    }

    // Parameterized constructor
    public Book(String isbn, String bookTitle, String authorName,
                double price, int availableQuantity) {
        this.isbn              = isbn;
        this.bookTitle         = bookTitle;
        this.authorName        = authorName;
        this.price             = price;
        this.availableQuantity = availableQuantity;
    }

    // Setters
    public void setIsbn(String isbn)                          { this.isbn = isbn; }
    public void setBookTitle(String bookTitle)                { this.bookTitle = bookTitle; }
    public void setAuthorName(String authorName)              { this.authorName = authorName; }
    public void setPrice(double price)                        { this.price = price; }
    public void setAvailableQuantity(int availableQuantity)   { this.availableQuantity = availableQuantity; }

    // Getters
    public String getIsbn()             { return isbn; }
    public String getBookTitle()        { return bookTitle; }
    public String getAuthorName()       { return authorName; }
    public double getPrice()            { return price; }
    public int    getAvailableQuantity(){ return availableQuantity; }

    // BookOperations implementation
    @Override
    public void addQuantity(int amount) {
        if (amount > 0) {
            availableQuantity += amount;
            System.out.println(amount + " copies added to \"" + bookTitle + "\". New quantity: " + availableQuantity);
        } else {
            System.out.println("Amount must be positive.");
        }
    }

    @Override
    public void sellQuantity(int amount) {
        if (amount > 0 && amount <= availableQuantity) {
            availableQuantity -= amount;
            System.out.println(amount + " copies of \"" + bookTitle + "\" sold. Remaining: " + availableQuantity);
        } else if (amount > availableQuantity) {
            System.out.println("Not enough stock for \"" + bookTitle + "\". Available: " + availableQuantity);
        } else {
            System.out.println("Amount must be positive.");
        }
    }

    // Abstract method – subclasses must override
    public abstract void showDetails();
}

// ─────────────────────────────────────────────
//  StoryBook  extends  Book
// ─────────────────────────────────────────────

class StoryBook extends Book {

    private String category;

    // Default constructor
    public StoryBook() {
        super();
        this.category = "";
    }

    // Parameterized constructor
    public StoryBook(String isbn, String bookTitle, String authorName,
                     double price, int availableQuantity, String category) {
        super(isbn, bookTitle, authorName, price, availableQuantity);
        this.category = category;
    }

    // Setter / Getter
    public void   setCategory(String category) { this.category = category; }
    public String getCategory()                { return category; }

    @Override
    public void showDetails() {
        System.out.println("---------- Story Book ----------");
        System.out.println("ISBN            : " + getIsbn());
        System.out.println("Title           : " + getBookTitle());
        System.out.println("Author          : " + getAuthorName());
        System.out.println("Price           : $" + getPrice());
        System.out.println("Available Qty   : " + getAvailableQuantity());
        System.out.println("Category        : " + category);
        System.out.println("--------------------------------");
    }
}

// ─────────────────────────────────────────────
//  TextBook  extends  Book
// ─────────────────────────────────────────────

class TextBook extends Book {

    private int standard;

    // Default constructor
    public TextBook() {
        super();
        this.standard = 0;
    }

    // Parameterized constructor
    public TextBook(String isbn, String bookTitle, String authorName,
                    double price, int availableQuantity, int standard) {
        super(isbn, bookTitle, authorName, price, availableQuantity);
        this.standard = standard;
    }

    // Setter / Getter
    public void setStandard(int standard) { this.standard = standard; }
    public int  getStandard()             { return standard; }

    @Override
    public void showDetails() {
        System.out.println("---------- Text Book -----------");
        System.out.println("ISBN            : " + getIsbn());
        System.out.println("Title           : " + getBookTitle());
        System.out.println("Author          : " + getAuthorName());
        System.out.println("Price           : $" + getPrice());
        System.out.println("Available Qty   : " + getAvailableQuantity());
        System.out.println("Standard/Grade  : " + standard);
        System.out.println("--------------------------------");
    }
}

// ─────────────────────────────────────────────
//  BookShop  implements  BookShopOperations
// ─────────────────────────────────────────────

class BookShop implements BookShopOperations {

    private String name;
    private Book[] listOfBooks;
    private int    count;   // tracks how many books are currently stored

    // Default constructor
    public BookShop() {
        this.name         = "";
        this.listOfBooks  = new Book[100];
        this.count        = 0;
    }

    // Parameterized constructor
    public BookShop(String name) {
        this.name        = name;
        this.listOfBooks = new Book[100];
        this.count       = 0;
    }

    // Setter / Getter
    public void   setName(String name) { this.name = name; }
    public String getName()            { return name; }

    // ── BookShopOperations ──────────────────

    @Override
    public boolean insertBook(Book b) {
        if (count >= listOfBooks.length) {
            System.out.println("BookShop is full. Cannot insert \"" + b.getBookTitle() + "\".");
            return false;
        }
        // Duplicate ISBN check
        for (int i = 0; i < count; i++) {
            if (listOfBooks[i].getIsbn().equals(b.getIsbn())) {
                System.out.println("Book with ISBN " + b.getIsbn() + " already exists.");
                return false;
            }
        }
        listOfBooks[count++] = b;
        System.out.println("\"" + b.getBookTitle() + "\" inserted successfully.");
        return true;
    }

    @Override
    public boolean removeBook(Book b) {
        for (int i = 0; i < count; i++) {
            if (listOfBooks[i].getIsbn().equals(b.getIsbn())) {
                // Shift remaining elements left
                for (int j = i; j < count - 1; j++) {
                    listOfBooks[j] = listOfBooks[j + 1];
                }
                listOfBooks[--count] = null;
                System.out.println("\"" + b.getBookTitle() + "\" removed successfully.");
                return true;
            }
        }
        System.out.println("Book with ISBN " + b.getIsbn() + " not found.");
        return false;
    }

    @Override
    public void showAllBooks() {
        System.out.println("\n========== Books in " + name + " ==========");
        if (count == 0) {
            System.out.println("No books available.");
        } else {
            for (int i = 0; i < count; i++) {
                listOfBooks[i].showDetails();   // polymorphic call
            }
        }
        System.out.println("Total books: " + count);
        System.out.println("==========================================\n");
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

// ─────────────────────────────────────────────
//  Start  –  main method
// ─────────────────────────────────────────────

public class main2{

    public static void main(String[] args) {

        // ── 1. Create 5 StoryBook objects ───────────────────────────────

        StoryBook sb1 = new StoryBook("SB001", "The Great Adventure", "Alice Brown",
                                      12.99, 30, "Adventure");
        StoryBook sb2 = new StoryBook("SB002", "Mystery of the Night", "Bob Smith",
                                      9.99, 20, "Mystery");
        StoryBook sb3 = new StoryBook("SB003", "Fantasy Realm", "Carol White",
                                      14.50, 15, "Fantasy");
        StoryBook sb4 = new StoryBook("SB004", "Romance in Paris", "David Lee",
                                      11.25, 25, "Romance");
        StoryBook sb5 = new StoryBook();          // default constructor
        sb5.setIsbn("SB005");
        sb5.setBookTitle("Horror House");
        sb5.setAuthorName("Eve Black");
        sb5.setPrice(8.75);
        sb5.setAvailableQuantity(10);
        sb5.setCategory("Horror");

        // ── 2. Create 5 TextBook objects ────────────────────────────────

        TextBook tb1 = new TextBook("TB001", "Mathematics Grade 8",  "Prof. A. Khan",  18.00, 50, 8);
        TextBook tb2 = new TextBook("TB002", "Physics Grade 10",     "Prof. B. Roy",   22.00, 40, 10);
        TextBook tb3 = new TextBook("TB003", "Chemistry Grade 11",   "Prof. C. Das",   20.50, 35, 11);
        TextBook tb4 = new TextBook("TB004", "Biology Grade 12",     "Prof. D. Hasan", 19.75, 45, 12);
        TextBook tb5 = new TextBook();            // default constructor
        tb5.setIsbn("TB005");
        tb5.setBookTitle("English Grade 9");
        tb5.setAuthorName("Prof. E. Ahmed");
        tb5.setPrice(15.00);
        tb5.setAvailableQuantity(60);
        tb5.setStandard(9);

        // ── 3. Create one BookShop object ───────────────────────────────

        BookShop shop = new BookShop("AIUB Book Corner");

        // ── 4. Insert all books into the shop ───────────────────────────

        System.out.println("\n===== Inserting Books =====");
        shop.insertBook(sb1);
        shop.insertBook(sb2);
        shop.insertBook(sb3);
        shop.insertBook(sb4);
        shop.insertBook(sb5);
        shop.insertBook(tb1);
        shop.insertBook(tb2);
        shop.insertBook(tb3);
        shop.insertBook(tb4);
        shop.insertBook(tb5);

        // ── 5. Show all books (polymorphism: showDetails called on each) ─

        shop.showAllBooks();

        // ── 6. Demonstrate addQuantity / sellQuantity ────────────────────

        System.out.println("===== Stock Operations =====");
        sb1.addQuantity(5);
        tb2.sellQuantity(10);
        tb2.sellQuantity(100);   // insufficient stock demo

        // ── 7. Search for a book ─────────────────────────────────────────

        System.out.println("\n===== Search Book =====");
        shop.searchBook("TB003");
        shop.searchBook("XX999");   // not found demo

        // ── 8. Remove a book ────────────────────────────────────────────

        System.out.println("\n===== Remove Book =====");
        shop.removeBook(sb3);

        // ── 9. Show remaining books ──────────────────────────────────────

        shop.showAllBooks();

        // ── 10. Demonstrate getName / setName ────────────────────────────

        System.out.println("Shop name : " + shop.getName());
        shop.setName("AIUB Central Bookstore");
        System.out.println("Updated name : " + shop.getName());
    }
}
