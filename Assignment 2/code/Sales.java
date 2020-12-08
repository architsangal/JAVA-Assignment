import java.util.ArrayList;
import java.io.*;

// use to keep record which book is sold, record of revenue and print revenue
class Sales
{
    private ArrayList<Book> books;
    private Revenue[] record;// an array to store revenues 
    Sales(ArrayList<Book> books)
    {
        this.books = books;
        this.record = new Revenue[10000];
    }
    // selling a book ==> this function is used to store and update the information
    public void sell(int year, String UniqueID)
    {
        for(Book i : books)
        {
            if(i.getUnique_id().equals(UniqueID))
            {
                if(i.getIsSold()!=-1)
                {
                    i.setIsSold(1);
                    i.setSelling_year(year);
                    int purchasing_year = i.getPurchasing_year();
                    if(record[year] == null)
                        record[year] = new Revenue();
                    if(year == purchasing_year)
                    {
                        record[year].setThisYear(record[year].getThisYear()+i.getSelling_price());
                    }
                    else if(year-1 == purchasing_year)
                    {
                        record[year].setPreviousYear(record[year].getPreviousYear()+i.getSelling_price());
                    }
                    else if(year-2 == purchasing_year)
                    {
                        record[year].setPrevToPrevYear(record[year].getPrevToPrevYear()+i.getSelling_price());
                    }
                }
                break;
            }
        }
    }
    public void printSales()
    {
        // System.out.println(year+" "
        // + record[year].getThisYear()+" "
        // + record[year].getPreviousYear()+" "
        // + record[year].getPrevToPrevYear()
        // );
        for(int i=0;i<10000;i++)
        {
            // print nothing if record array has not stored anything
            if(record[i] != null)
            {
                System.out.println(i+" "
                + Math.round(record[i].getThisYear())+" "
                + Math.round(record[i].getPreviousYear())+" "
                + Math.round(record[i].getPrevToPrevYear())
                );
            }
        }
    }
}
