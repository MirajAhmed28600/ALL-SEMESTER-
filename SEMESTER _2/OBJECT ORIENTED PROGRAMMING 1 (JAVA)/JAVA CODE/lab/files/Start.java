package files;
public class Start {
    public static void main(String[] args) {

        // ── Create 5 StoryBook objects ────────────────────────────────────────
        StoryBook sb1 = new StoryBook("SB001", "The Hobbit",          "J.R.R. Tolkien",    500.0, 10, "Fantasy");
        StoryBook sb2 = new StoryBook("SB002", "Harry Potter",        "J.K. Rowling",      450.0, 15, "Fantasy");
        StoryBook sb3 = new StoryBook("SB003", "The Alchemist",       "Paulo Coelho",      300.0, 20, "Adventure");
        StoryBook sb4 = new StoryBook("SB004", "Murder on Orient",    "Agatha Christie",   350.0,  8, "Mystery");
        StoryBook sb5 = new StoryBook("SB005", "Pride and Prejudice", "Jane Austen",       280.0, 12, "Romance");

        // ── Create 5 TextBook objects ─────────────────────────────────────────
        TextBook tb1 = new TextBook("TB001", "Java Programming",    "James Gosling",      600.0, 25, 10);
        TextBook tb2 = new TextBook("TB002", "Data Structures",     "Mark Allen Weiss",   750.0, 18, 11);
        TextBook tb3 = new TextBook("TB003", "Discrete Mathematics","Kenneth Rosen",      700.0, 14, 12);
        TextBook tb4 = new TextBook("TB004", "Physics Vol-1",       "H.C. Verma",         400.0, 30,  9);
        TextBook tb5 = new TextBook("TB005", "Calculus",            "James Stewart",      550.0, 22, 10);

        // ── Demonstrate setters and getters ───────────────────────────────────
        System.out.println("===== Demonstrating Setters & Getters =====");
        sb1.setCategory("Classic Fantasy");
        System.out.println("Updated sb1 category: " + sb1.getCategory());

        tb1.setStandard(12);
        System.out.println("Updated tb1 standard: " + tb1.getStandard());

        // ── Demonstrate showDetails (polymorphism) ────────────────────────────
        System.out.println("\n===== Demonstrating showDetails() =====");
        sb1.showDetails();
        tb1.showDetails();

        // ── Demonstrate addQuantity / sellQuantity ────────────────────────────
        System.out.println("===== Demonstrating addQuantity & sellQuantity =====");
        sb2.addQuantity(5);
        sb2.sellQuantity(3);
        tb2.addQuantity(10);
        tb2.sellQuantity(20); // Should show insufficient stock

        // ── Create one BookShop object ────────────────────────────────────────
        BookShop shop = new BookShop("AIUB Book Corner");

        // ── Insert all books into BookShop ────────────────────────────────────
        System.out.println("\n===== Inserting Books into BookShop =====");
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

        // ── Show all books ────────────────────────────────────────────────────
        shop.showAllBooks();

        // ── Search a book by ISBN ─────────────────────────────────────────────
        System.out.println("===== Searching for ISBN TB003 =====");
        shop.searchBook("TB003");

        System.out.println("===== Searching for ISBN INVALID =====");
        shop.searchBook("INVALID");

        // ── Remove a book ─────────────────────────────────────────────────────
        System.out.println("===== Removing sb3 (The Alchemist) =====");
        shop.removeBook(sb3);

        // ── Show all books after removal ──────────────────────────────────────
        shop.showAllBooks();

        // ── Demonstrate BookShop setters & getters ────────────────────────────
        System.out.println("===== BookShop Name =====");
        System.out.println("Shop name: " + shop.getName());
        shop.setName("AIUB Mega Book Store");
        System.out.println("Updated shop name: " + shop.getName());
    }
}
