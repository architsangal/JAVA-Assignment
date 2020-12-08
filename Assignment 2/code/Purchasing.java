import java.util.ArrayList;
import java.io.*;

// add books to ArrayList<Book> which acts as complete record of all the books.
// can get and set the factor.
// profit_factor is same as factor.
class Purchasing
{
    // reference to array list is passed
    Purchasing(ArrayList<Book> books_purchased)
    {
        this.profit_factor = 1.5;
        this.books_purchased = books_purchased;
    }
    // if factor needs to be changed.
    Purchasing(double profit_factor,ArrayList<Book> books_purchased)
    {
        this.profit_factor = profit_factor;
        this.books_purchased = books_purchased;
    }
    public void addBook(int year, double cost_price)
    {

        double selling_price = cost_price*this.profit_factor;
        Book book = new Book(year, cost_price, selling_price);
        this.books_purchased.add(book);
    }
    // if factor changes only for a single book
    public void addBook(int year, double cost_price, double profit_factor)
    {
        double selling_price = cost_price*this.profit_factor;
        Book book = new Book(year, cost_price, selling_price);
        this.books_purchased.add(book);
    }

    private double profit_factor;
    private ArrayList<Book> books_purchased;

    // user may like to see what is the current profit factor before before changing it.
    public double getProfit_factor() { return this.profit_factor; }
    public void setProfit_factor(double profit_factor) { this.profit_factor = profit_factor; }

}