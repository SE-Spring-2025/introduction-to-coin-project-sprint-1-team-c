import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CoinTest {    
	private Coin testPenny;
	private Coin testNickel;
	private Coin testDime;
	private Coin testQuarter;
	private Coin testHalfDollar;
	private Coin testDollar;

    @Test
    public void testConstructors() {
	// Make sure they don't blow up
	// parameterless constructor
	try {
	    Penny p = new Penny();
	}
	catch (Exception e) {
	    fail("Coin() constructor caused exception: "+e.getMessage());
	}

	// value arg constructor with year
	try {
	    Penny p = new Penny(2020);
	}
	catch (Exception e) {
	    fail("Coin() constructor caused exception: "+e.getMessage());
	}
    }

    @Test
    public void testGetters() {
	
	if (! testPenny()) fail("penny getters failed");
	if (! testNickel()) fail("nickel getters failed");
	if (! testDime()) fail("dime getters failed");
	if (! testQuarter()) fail("quarter getters failed");
	if (! testHalfDollar()) fail("half dollar getters failed");
	if (! testDollar()) fail("dollar getters failed");
	
	// make it here then didn't fail!
	assertTrue(true);

    }
}
    
