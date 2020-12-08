import java.util.ArrayList;
import java.io.*;

// helps in keeping record of revenue for each year
class Revenue
{
    private double thisYear;
    private double previousYear;
    private double prevToPrevYear;

    public double getThisYear() { return thisYear; }
    public void setThisYear(double thisYear) { this.thisYear = thisYear; }
    public double getPreviousYear() { return previousYear; }
    public void setPreviousYear(double previousYear) { this.previousYear = previousYear; }
    public double getPrevToPrevYear() { return prevToPrevYear; }
    public void setPrevToPrevYear(double prevToPrevYear) { this.prevToPrevYear = prevToPrevYear; }
}
