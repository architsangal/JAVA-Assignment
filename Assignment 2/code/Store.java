import java.util.ArrayList;
import java.io.*;

// has purchasing and sales dept.
// maintains the list of all Books ever purchased
// can be initialised with a different profit factor
class Store
{
    Store()
    {
        this.books_purchased = new ArrayList<>();
        this.purchasing_dept = new Purchasing(this.books_purchased);
        this.sales_dept = new Sales(this.books_purchased);
    }
    Store(double profit_factor)
    {
        this.books_purchased = new ArrayList<>();
        this.purchasing_dept = new Purchasing(profit_factor, this.books_purchased);
        this.sales_dept = new Sales(this.books_purchased);
    }

    public Purchasing getPurchasing_dept(){  return purchasing_dept;  }
    public Sales getSales_dept() {  return sales_dept;  }

    private Purchasing purchasing_dept;
    private Sales sales_dept;
    private ArrayList<Book> books_purchased;
}