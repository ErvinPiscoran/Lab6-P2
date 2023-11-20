import java.util.ArrayList;
class Book{
    private String title;
    private String author;
    private int ISBN;
    public Book(String title, String author, int ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN=ISBN;
    }
    public String getTitle(){
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public int getISBN(){
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
}
class Library{
    ArrayList<Book> books=new ArrayList<>();
    public void adauga(Book carte){
        books.add(carte);
        System.out.println("Cartea "+carte.getTitle()+" a fost adaugata.");
    }
    public void sterge(Book carte){
        books.remove(carte);
        System.out.println("Cartea "+carte.getTitle()+" a fost stearsa.");
    }
    public void afisare(){
        for(Book carti:books){
            System.out.println(carti.getISBN()+" = "+carti.getTitle()+" = "+carti.getAuthor());
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Book fantasy = new Book("Harry Potter","J.K.Rowling",112);
        Book roman = new Book("Ultima noapte de dragoste, prima noapte de razboi","Camil Petrescu",222);
        Library librarie = new Library();
        librarie.adauga(fantasy);
        librarie.afisare();
        librarie.adauga(roman);
        librarie.afisare();
        librarie.sterge(fantasy);
        librarie.afisare();
    }
}