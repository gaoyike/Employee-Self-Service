package gov.nysenate.ess.core.model.payroll;

import gov.nysenate.ess.core.annotation.ProperTest;
import org.junit.Test;

import static org.junit.Assert.*;

@ProperTest
public class PayTypeTests
{
    /** Checks the minimum hours for each pay type */
    @Test
    public void testGetMinHours() throws Exception {
        assertEquals(1820, PayType.RA.getMinHours());
        assertEquals(0, PayType.SA.getMinHours());
        assertEquals(910, PayType.SE.getMinHours());
        assertEquals(0, PayType.TE.getMinHours());
    }

    /** Checks the biweekly status for each pay type */
    @Test
    public void testIsBiweekly() throws Exception {
        assertTrue(PayType.RA.isBiweekly());
        assertTrue(PayType.SA.isBiweekly());
        assertTrue(PayType.SE.isBiweekly());
        assertFalse(PayType.TE.isBiweekly());
    }
}