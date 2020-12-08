package derived;
import base.*;
import derived.BioChemTest;
import mainclass.Lab4B;

public class BioChemLab extends Lab
{
	public BioChemLab()
	{
		super();
	}
	private void addTest(BioChemTest test)
	{
		super.add(test);
	}
	public BioChemTest obj(String patientId)
	{
		count++;
		BioChemTest obj = new BioChemTest(patientId,"B"+count);
		Lab4B.getDispatch().processReport(obj);
		addTest(obj);
		return obj;
	}
	private int count = 0;
}