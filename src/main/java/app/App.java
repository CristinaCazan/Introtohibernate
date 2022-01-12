package app;


import com.github.javafaker.Faker;
import dao.BookDAO;
import entity.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtils;

public class App {
    public static void main(String[] args) {
        Faker faker= new Faker();
        BookDAO bookDAO= new BookDAO();
//        System.out.println(bookDAO.getBookById(6L));
//        bookDAO.insertIntoTable(new Book(faker.book().author()));
//         bookDAO.deleteFromTable(5L);
//        bookDAO.updateBook("noul autor DAO", 7L);
        System.out.println(bookDAO.getAllBooks());



    }
}
