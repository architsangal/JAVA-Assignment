import java.util.ArrayList;
import java.io.*;

// Used for testing the code
public class Test
{
    public static void  main(String args[])throws IOException
    {
        // making an object of Store.
        Store store = new Store();

        // input using buffered reader and input stream reader.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // loop which terminates only when "0 0" is entered.
        // while(true) represents the same
        // break is executed only when it finds the terminating condition..
        // used for taking input ==> For books which were bought
        while(true)
        {
            String[] input = br.readLine().split(" ");
            if(input[0].equals("0") && input[1].equals("0"))
                break;
            store.getPurchasing_dept().addBook(Integer.parseInt(input[0]),Double.parseDouble(input[1]));
        }

        // loop which terminates only when "0 0" is entered.
        // while(true) represents the same
        // break is executed only when it finds the terminating condition..
        // used for taking input ==> For books which are sold.
        while(true)
        {
            String[] input = br.readLine().split(" ");
            if(input[0].equals("0") && input[1].equals("0"))
                break;
            int selling_year = Integer.parseInt(input[0]);
            String UniqueID = input[1];
            store.getSales_dept().sell(selling_year,UniqueID);
        }

        store.getSales_dept().printSales();
    }
}