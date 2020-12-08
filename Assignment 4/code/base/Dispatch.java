package base;
import java.util.ArrayList;

import derived.*;

public class Dispatch
{
	
	public void processReport(BioChemTest test)
	{
		String str = test.getPatientId() + " " + test.getTestID() + " " + (countBC+100);
		countBC++;
		allResults.add(str);
	}   // called by individual labs 

	public void processReport(PathTest test)
	{
		String str = test.getPatientId() + " " + test.getTestID() + " ";
		countP++;
		if(countP%3 == 1 || countP%3 == 2)
			str += "benign";
		else if(countP%3 == 0)
			str += "malignant";
		allResults.add(str);
	}   // called by individual labs 

	public ArrayList<String> getAllResults()
	{
		return allResults;
	}
	
	public int getCountBC()
	{
		return countBC;
	}
	public int getCountP()
	{
		return countP;
	}
	private int countBC = 0;
	private int countP = 0;

	private ArrayList<String> allResults = new ArrayList<>();
}
