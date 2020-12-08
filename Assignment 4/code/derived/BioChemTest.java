package derived;
import base.*;

public class BioChemTest extends LabTest
{
     public BioChemTest(String patientId, String testID)
     {
          super(patientId);
          super.setTestID(testID);
          super.setPrice(400);
     }

}