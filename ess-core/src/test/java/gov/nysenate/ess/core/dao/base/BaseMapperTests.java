package gov.nysenate.ess.core.dao.base;

import gov.nysenate.ess.core.annotation.ProperTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

import java.sql.Date;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@Category(ProperTest.class)
public class BaseMapperTests
{
    /** Should convert date from result set to LocalDate. */
    @Test
    public void testGetLocalDateFromRs() throws Exception {
        ResultSet mockRs = mock(ResultSet.class);
        // May 1, 2015
        java.sql.Date date = java.sql.Date.valueOf("2015-05-01");
        when(mockRs.getDate("col")).thenReturn(date);
        assertEquals(LocalDate.of(2015, 5, 1), BaseMapper.getLocalDateFromRs(mockRs, "col"));
        // Null -> Null
        when(mockRs.getDate("col")).thenReturn(null);
        assertEquals(null, BaseMapper.getLocalDateFromRs(mockRs, "col"));
    }

    /** Should convert timestamp from result set to LocalDateTime. */
    @Test
    public void testGetLocalDateTimeFromRs() throws Exception {
        ResultSet mockRs = mock(ResultSet.class);
        // May 1, 2015 13;14:15.123456789
        java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf("2015-05-01 13:14:15.123456789");
        when(mockRs.getTimestamp("col")).thenReturn(timestamp);
        assertEquals(LocalDateTime.of(2015, 5, 1, 13, 14, 15, 123456789),
                BaseMapper.getLocalDateTimeFromRs(mockRs, "col"));
        // Null -> Null
        when(mockRs.getTimestamp("col")).thenReturn(null);
        assertEquals(null, BaseMapper.getLocalDateTimeFromRs(mockRs, "col"));
    }

    /** get status from code should return true for A or Y. */
    @Test
    public void testGetStatusFromCode() throws Exception {
        // A, a, Y, y
        assertTrue(BaseMapper.getStatusFromCode("A"));
        assertTrue(BaseMapper.getStatusFromCode("Y"));
        assertTrue(BaseMapper.getStatusFromCode(" A "));
        assertTrue(BaseMapper.getStatusFromCode(" Y "));
        assertTrue(BaseMapper.getStatusFromCode("a"));
        assertTrue(BaseMapper.getStatusFromCode("y"));
        assertTrue(BaseMapper.getStatusFromCode(" a  "));
        assertTrue(BaseMapper.getStatusFromCode(" y  "));
        // I, i
        assertFalse(BaseMapper.getStatusFromCode("I"));
        assertFalse(BaseMapper.getStatusFromCode(" I "));
        assertFalse(BaseMapper.getStatusFromCode("i"));
        assertFalse(BaseMapper.getStatusFromCode(" i  "));
        // null
        assertFalse(BaseMapper.getStatusFromCode(null));
        // Random
        assertFalse(BaseMapper.getStatusFromCode("Meow"));
    }
}