package base;
import java.util.ArrayList;

import derived.*;

public class Billing
{
	void billTest(LabTest test)
	{
		String str = "";
		str = test.getTestID() + " " + test.getPrice();
		totalSum += test.getPrice();
		bills.add(str);
	}  // called by Reception
	
	public ArrayList<String> getBills()
	{
		return bills;
	} // one string for each test
	
	public int getTotalSum()
	{
		return totalSum;
	}

	private int totalSum  = 0;
	private ArrayList<String> bills = new ArrayList<>();
	// each string has testId and billed amount, separated by a space
	
}
