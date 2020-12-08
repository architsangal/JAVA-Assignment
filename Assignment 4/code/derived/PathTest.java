package derived;
import base.*;

public class PathTest extends LabTest
{
     public PathTest(String patientId, String testID)
     {
          super(patientId);
          super.setTestID(testID);
          super.setPrice(1000);
     }
}