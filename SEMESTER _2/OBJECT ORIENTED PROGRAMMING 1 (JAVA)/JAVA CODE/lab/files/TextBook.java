package files;
public class TextBook extends Book {
    private int standard;

    // Default constructor
    public TextBook() {
        super();
        this.standard = 0;
    }

    // Parameterized constructor
    public TextBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, int standard) {
        super(isbn, bookTitle, authorName, price, availableQuantity);
        this.standard = standard;
    }

    // Setter & Getter
    public void setStandard(int standard) { this.standard = standard; }
    public int getStandard()              { return standard; }

    @Override
    public void showDetails() {
        System.out.println("--- TextBook Details ---");
        System.out.println("ISBN          : " + getIsbn());
        System.out.println("Title         : " + getBookTitle());
        System.out.println("Author        : " + getAuthorName());
        System.out.println("Price         : " + getPrice());
        System.out.println("Quantity      : " + getAvailableQuantity());
        System.out.println("Standard      : " + standard);
        System.out.println("------------------------");
    }
}
