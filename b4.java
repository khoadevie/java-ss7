// class book
public class Book {

    // Thuộc tính (public theo sơ đồ UML)
    public String title;
    public String author;
    public double price;

    // Phương thức in thông tin sách
    public void printInfo() {
        System.out.println("Title : " + title);
        System.out.println("Author: " + author);
        System.out.println("Price : " + price);
    }
}

// main.java
public class Main {
    public static void main(String[] args) {
        Book book = new Book();

        book.title = "Lập trình Java";
        book.author = "Nguyễn Văn A";
        book.price = 99.5;

        book.printInfo();
    }
}
