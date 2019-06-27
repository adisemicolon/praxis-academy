import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class TesterBiycleDemo{
	@Test
    public void NotNulltest() {
        Bicycle tester = new Bicycle(); 

        // assert statements
        assertNotNull("Bicycle must be not null ", tester);
    }
}