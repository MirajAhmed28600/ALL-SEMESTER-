package files;
public abstract class Book implements BookOperations {
    private String isbn;
    private String bookTitle;
    private String authorName;
    private double price;
    private int availableQuantity;

    // Default constructor
    public Book() {
        this.isbn = "";
        this.bookTitle = "";
        this.authorName = "";
        this.price = 0.0;
        this.availableQuantity = 0;
    }

    // Parameterized constructor
    public Book(String isbn, String bookTitle, String authorName, double price, int availableQuantity) {
        this.isbn = isbn;
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.price = price;
        this.availableQuantity = availableQuantity;
    }

    // Setters
    public void setIsbn(String isbn)                        { this.isbn = isbn; }
    public void setBookTitle(String bookTitle)              { this.bookTitle = bookTitle; }
    public void setAuthorName(String authorName)            { this.authorName = authorName; }
    public void setPrice(double price)                      { this.price = price; }
    public void setAvailableQuantity(int availableQuantity) { this.availableQuantity = availableQuantity; }

    // Getters
    public String getIsbn()            { return isbn; }
    public String getBookTitle()       { return bookTitle; }
    public String getAuthorName()      { return authorName; }
    public double getPrice()           { return price; }
    public int getAvailableQuantity()  { return availableQuantity; }

    // BookOperations implementations
    @Override
    public void addQuantity(int amount) {
        if (amount > 0) {
            this.availableQuantity += amount;
            System.out.println(amount + " copies added. New quantity: " + this.availableQuantity);
        } else {
            System.out.println("Amount must be positive.");
        }
    }

    @Override
    public void sellQuantity(int amount) {
        if (amount > 0 && amount <= this.availableQuantity) {
            this.availableQuantity -= amount;
            System.out.println(amount + " copies sold. Remaining quantity: " + this.availableQuantity);
        } else {
            System.out.println("Invalid sell amount or insufficient stock.");
        }
    }

    // Abstract method
    public abstract void showDetails();
}
