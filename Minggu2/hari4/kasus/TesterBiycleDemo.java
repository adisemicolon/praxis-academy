import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TesterBiycleDemo{
	@Test
    public static multiplicationOfZeroIntegersShouldReturnZero() {
        Bicycle tester = new Bicycle(); 

        // assert statements
        assertEquals("gear must be 1 ", 1 ,tester.changeGear(1));
    }
}