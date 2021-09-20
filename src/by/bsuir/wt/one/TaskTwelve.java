package by.bsuir.wt.one;

class Book{
    protected String title;
    protected String author;
    protected int price;
    protected static int edition;

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

class ProgrammerBook extends Book{
    private String language;
    private int level;

    @Override
    public int hashCode(){
        int result = super.hashCode();
        result = 37 * result + language.hashCode();
        result = 37 * result + level;
        return result;
    }

    @Override
    public boolean equals(Object o)  {
        return super.equals(o) &&
               o instanceof ProgrammerBook &&
               language.equals(((ProgrammerBook)(o)).language) &&
               level == ((ProgrammerBook)(o)).level;
    }

    @Override
    public String toString(){
        return super.toString() +
               "\nLanguage: " + language +
               "\nLevel: " + level;
    }

    public ProgrammerBook(String title, String author, int price,
                          String language, int level){
        super(title, author, price);
        this.language = language;
        this.level = level;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
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

        ProgrammerBook pascal = new ProgrammerBook("Pascal Guide", "N. Virt", 3990, "English", 500);
        System.out.println(pascal);
        System.out.println("Hash code = " + pascal.hashCode());
        System.out.println("b.equals(pascal): " + b.equals(pascal));
        System.out.println("other.equals(pascal): " + other.equals(pascal));
        ProgrammerBook pascal2 = new ProgrammerBook("Pascal Guide", "N. Virt", 3990, "English", 500);
        System.out.println("pascal.equals(pascal2): " + pascal.equals(pascal2));
    }
}
