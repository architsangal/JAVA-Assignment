package derived;
import base.*;
import derived.PathTest;
import mainclass.Lab4B;

public class PathLab extends Lab
{
	public PathLab()
	{
		super();
	}
	private void addTest(PathTest test)
	{
		super.add(test);
	}
	public PathTest obj(String patientId)
	{
		count++;
		PathTest obj = new PathTest(patientId,"P"+count);
		Lab4B.getDispatch().processReport(obj);
		addTest(obj);
		return obj;
	}
	private int count = 0;
}