/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multiplicidad;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Robinson Mosquera
 */
public class author {
    private String name;
    private List<Book> books;

    public author() {
    }

    public author(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
    
    public void addBook(Book book){
        books.add(book);
    }

    @Override
    public String toString() {
        return "author{" + "name=" + name + ", books=" + books + '}';
    }
    
}
