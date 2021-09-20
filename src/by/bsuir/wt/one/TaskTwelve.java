package by.bsuir.wt.one;

class Book{
    private String title;
    private String author;
    private int price;
    private static int edition;

    public Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public int hashCode(){
        int result = 17;
        result = 37 * result + title.hashCode();
        result = 37 * result + author.hashCode();
        result = 37 * result + price;
        result = 37 * result + edition;
        return result;
    }

    @Override
    public boolean equals(Object o)  {
        return o instanceof Book &&
                title.equals(((Book)(o)).title) &&
                author.equals(((Book)(o)).author) &&
                price == ((Book)(o)).price;
    }

    @Override
    public String toString(){
        return "Book title: " + title +
                "\nAuthor: " + author +
                "\nPrice: " + price +
                "\nEdition: " + edition;
    }

    public static int getEdition() {
        return edition;
    }

    public static void setEdition(int edition) {
        Book.edition = edition;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}


public class TaskTwelve {

    public static void main(String[] args){
        Book.setEdition(15);
        Book b = new Book("The World as Will and Representation", "A. Shopenhauer", 2500);
        System.out.println(b);
        System.out.println("Hash code = " + b.hashCode());
        Book other = new Book("Beyond Good and Evil", "F. Nietzsche", 3940);
        System.out.println(other);
        System.out.println("Hash code = " + other.hashCode());
        System.out.println("b.equals(other): " + b.equals(other));

        b.setTitle("Beyond Good and Evil");
        b.setAuthor("F. Nietzsche");
        b.setPrice(3940);
        System.out.println("b.equals(other): " + b.equals(other));
    }
}
