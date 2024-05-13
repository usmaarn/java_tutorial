import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class User {
    private String name;
    private LocalDate birthDay;
    private ArrayList<Book> books = new ArrayList<Book>();

    public String getName() {
        return this.name;
    }

    public String getBirtday() {
        return this.birthDay.toString();
    }

    public ArrayList<Book> getBooks() {
        return this.books;
    }

    User(String name, String birthDay){
        this.name = name;
        this.birthDay = LocalDate.parse(birthDay);
    }

    public int age() {
        Period age = Period.between(this.birthDay, LocalDate.now());
        return age.getYears();
    }

    public void borrow(Book book) {
        this.books.add(book);
    }
}