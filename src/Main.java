import ex1.Shape;
import ex1.Triangle;
import ex2.Book;
import ex2.ForeignBook;

public class Main {
    public static void main(String[] args) {
        // ex1
        Shape triangle = new Triangle(3.0,4.0,5.0);
        System.out.println(triangle.calcArea());

        // ex2
        // write your console application
        Book book = new ForeignBook();
        System.out.println(book.calcMoney());
    }
}