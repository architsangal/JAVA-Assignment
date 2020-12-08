package base;
import derived.*;

public class LabTest
{
	protected LabTest(String patientId)
	{
		this.patientId = patientId;
	}   // note that this should never get called explicitly

	protected void setPatientId(String patientId)
	{
		this.patientId = patientId;
	}
	protected void setPrice(int price)
	{
		this.price = price;
	}
	protected void setResult(String result)
	{
		this.result = result;
	}
	protected void setTestID(String testID)
	{
		this.testID = testID;
	}

	protected String getTestID()
	{
		return testID;
	}
	protected String getPatientId()
	{
		return patientId;
	}
	protected int getPrice()
	{
		return price;
	}
	protected String getResult()
	{
		return result;
	}

	private String testID;
	private String result;
	private int price;
	private String patientId;
}

