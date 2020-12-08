package base;
import java.util.ArrayList;

import derived.*;

public class Lab
{
	ArrayList<LabTest> getTests()
	{
		return tests;
	}
	public void add(BioChemTest test)
	{
		LabTest t = test;
		tests.add(t);
	}
	public void add(PathTest test)
	{
		LabTest t = test;
		tests.add(t);
	}
	private ArrayList<LabTest> tests = new ArrayList<>();
}