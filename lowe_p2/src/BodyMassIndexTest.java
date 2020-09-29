import org.junit.Test;
import java.lang.Math;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class BodyMassIndexTest {

    @Test
    public void testNormalWeightBmi(){
        BodyMassIndex bmi= new BodyMassIndex(60, 115);
        String bmiValue= bmi.getBMICategory();
        assertEquals(bmiValue, "normal");
    }
    @Test
    public void testUnderWeightBmi(){
        BodyMassIndex bmi= new BodyMassIndex(72, 100);
        String bmiValue= bmi.getBMICategory();
        assertEquals(bmiValue, "underweight");
    }
    @Test
    public void testOverWeightBmi(){
        BodyMassIndex bmi= new BodyMassIndex(63, 150);
        String bmiValue= bmi.getBMICategory();
        assertEquals(bmiValue, "overweight");
    }
    @Test
    public void testObeseBmi(){
        BodyMassIndex bmi= new BodyMassIndex(65, 195);
        String bmiValue= bmi.getBMICategory();
        assertEquals(bmiValue, "obese");
    }
    @Test
    public void testInfo(){
        String bmiInfo;
        BodyMassIndex info= new BodyMassIndex(45, 135);
        info.getBmiInfo();
        bmiInfo = info.getBmiInfo();
        assertTrue(bmiInfo.startsWith("Your BMI is"));

    }
    @Test
    public void testBmiCalculations(){
        BodyMassIndex bmi= new BodyMassIndex(72, 200);
        double bmiValue = Math.round(bmi.getBmi() * 100f)/100f;
        double expectedBmi = Math.round(100f * (703 * 200f)/ (72f*72f))/100f;
        assertEquals(bmiValue, expectedBmi);
    }

}
