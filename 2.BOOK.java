class Book {
    private int bookId;
    private String title;
    private String author;
    private double price;
    private static int totalBooksCount = 0;
    public Book(int bookId, String title, String author, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
        totalBooksCount++;
    }
    public static int getTotalBooksCount() {
        return totalBooksCount;
    }
    public int getBookId() {
        return bookId;
    }
    public String getTitle() {
        return title;
    }
    public void display() {
        System.out.printf("ID: %-5d | Title: %-20s | Author: %-15s | Price: ₹%.2f\n", 
                          bookId, title, author, price);
    }
    public boolean search(int searchId) {
        return this.bookId == searchId;
    }
    public boolean search(String searchTitle) {
        return this.title.equalsIgnoreCase(searchTitle);
    }
    public Book getCostlierBook(Book other) {
        if (this.price >= other.price) {
            return this;
        } else {
            return other;
        }
    }
}
public class Program5_BookDemo {
    public static void main(String[] args) {
        Book b1 = new Book(101, "Java Programming", "E. Balagurusamy", 450.00);
        Book b2 = new Book(102, "Data Structures", "Lipschutz", 380.50);
        Book b3 = new Book(103, "Effective Java", "Joshua Bloch", 850.00);
        System.out.println("--- All Available Books ---");
        b1.display();
        b2.display();
        b3.display();
        System.out.println("\nTotal number of books created: " + Book.getTotalBooksCount());
        int targetId = 102;
        System.out.println("\nSearching for Book ID " + targetId + "...");
        if (b1.search(targetId)) b1.display();
        else if (b2.search(targetId)) b2.display();
        else if (b3.search(targetId)) b3.display();
        else System.out.println("Book not found.");
        String targetTitle = "effective java";
        System.out.println("\nSearching for Title \"" + targetTitle + "\"...");
        if (b1.search(targetTitle)) b1.display();
        else if (b2.search(targetTitle)) b2.display();
        else if (b3.search(targetTitle)) b3.display();
        else System.out.println("Book not found.");
        System.out.println("\nComparing the prices of \"" + b1.getTitle() + "\" and \"" + b3.getTitle() + "\"...");
        Book costlier = b1.getCostlierBook(b3);
        System.out.print("The costlier book is: ");
        costlier.display();
        System.out.println("ANANYA");
        System.out.println("1WA25CS033");
    }
}
