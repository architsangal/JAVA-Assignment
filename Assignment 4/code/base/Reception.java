package base;
import java.util.ArrayList;

import derived.*;
import mainclass.*;

public class Reception
{
	public Reception()
	{
		testList = new ArrayList<>();
		names = new ArrayList<>();
		count = 0;
	}
	public boolean addRequest(String testType, String patientName)
	{ 
		// should create the appropriate sub-type of LabTest, 
		// add that to Billing and 
		// then to the specific lab, after generating a patient ID
		
		if(testType.equals("Path"))
		{
			count++;// Patient ID
			names.add(patientName);
			LabTest labTest = Lab4B.getpLab().obj(count+"");
			Lab4B.getBilling().billTest(labTest);
			testList.add(labTest);
			return true;
		}
		else if(testType.equals("Bio"))
		{
			count++;// Patient ID
			names.add(patientName);
			LabTest labTest = Lab4B.getBcLab().obj(count+"");
			Lab4B.getBilling().billTest(labTest);
			testType.equals(labTest);
			return true;
		}
		
		return false; 	
	}

	public static ArrayList<String> getNames()
	{
		return names;
	}
	private int count;
	private static ArrayList<LabTest> testList;
	private static ArrayList<String> names;
}
