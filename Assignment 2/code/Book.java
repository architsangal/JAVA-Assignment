import java.util.ArrayList;
import java.io.*;

// stores all the information reagarding a particular book
class Book
{
    Book(int purchasing_year,double cost_price,double selling_price)
    {
        this.cost_price = cost_price;
        this.selling_price = selling_price;
        this.purchasing_year = purchasing_year;
        this.unique_id = assignUniqueId(purchasing_year);
    }

    private String assignUniqueId(int purchasing_year)
    {
        String str_purchasing_year = purchasing_year+"";
        int no_of_zeros  = 4-str_purchasing_year.length();
        for(int i=0;i<no_of_zeros;i++)
        {
            str_purchasing_year = "0" + str_purchasing_year;
        }
        int sequence_no = 0;
        if(year[purchasing_year] == 999999)
            isSold = -1;// this object is not valid
        else
        {
            sequence_no = ++year[purchasing_year];
            String str_sequence_no = sequence_no+"";
            no_of_zeros  = 6 - str_sequence_no.length();
            for(int i=0;i<no_of_zeros;i++)
            {
                str_sequence_no = "0" + str_sequence_no;
            }
            return str_purchasing_year+"-"+str_sequence_no;
        }
        return str_purchasing_year+"-000000";
    }

    public String getUnique_id() { return this.unique_id; }

    public int getPurchasing_year() { return this.purchasing_year; }

    public void setSelling_year(int selling_year) { this.selling_year = selling_year; }

    public double getSelling_price() { return this.selling_price; }

    public int getIsSold() { return isSold; }
    public void setIsSold(int isSold) { this.isSold = isSold; }

    public double getCost_price() { return cost_price; }
    public int getSelling_year() { return selling_year; }
    
    private static int[] year = new int[10000];    
    // as year is of format yyyy => 0<= yyyy <= 9999
    private String unique_id;
    private int purchasing_year;

    // though selling year and cost price is not directly used in code
    // but as we are inputting them so I though we shoud not loose this
    // information and we should store it somewhere so I am writing getters
    // for these 2 if someone wants to access them.
    
    private int selling_year;
    private double cost_price;
    private double selling_price;
    private int isSold;
}