package ddct;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TillTest {

    private Till till;
    private List<String> input;

    @Before
    public void setUp() throws Exception {
        till = new Till();
    }

    @Test
    public void testCalculateTotalCost_noItems() throws Exception {
        input = new ArrayList<String>();
        assertEquals(BigDecimal.ZERO,till.calculateTotalCost(input));
    }

    @Test
    public void testCalculateTotalCost_1xapple() throws Exception {
        input = Arrays.asList("apple");
        assertEquals(new BigDecimal("0.60"),till.calculateTotalCost(input));
    }

    @Test
    public void testCalculateTotalCost_2xapple() throws Exception {
        input = Arrays.asList("apple","apple");
        assertEquals(new BigDecimal("0.60"),till.calculateTotalCost(input));
    }

    @Test
    public void testCalculateTotalCost_3xapple() throws Exception {
        input = Arrays.asList("apple","apple","apple");
        assertEquals(new BigDecimal("1.20"),till.calculateTotalCost(input));
    }

    @Test
    public void testCalculateTotalCost_4xapple() throws Exception {
        input = Arrays.asList("apple","apple","apple","apple");
        assertEquals(new BigDecimal("1.20"),till.calculateTotalCost(input));
    }

    @Test
    public void testCalculateTotalCost_1xorange() throws Exception {
        input = Arrays.asList("orange");
        assertEquals(new BigDecimal("0.25"),till.calculateTotalCost(input));
    }

    @Test
    public void testCalculateTotalCost_2xorange() throws Exception {
        input = Arrays.asList("orange","orange");
        assertEquals(new BigDecimal("0.50"),till.calculateTotalCost(input));
    }

    @Test
    public void testCalculateTotalCost_3xorange() throws Exception {
        input = Arrays.asList("orange","orange","orange");
        assertEquals(new BigDecimal("0.50"),till.calculateTotalCost(input));
    }

    @Test
    public void testCalculateTotalCost_4xorange() throws Exception {
        input = Arrays.asList("orange","orange","orange","orange");
        assertEquals(new BigDecimal("0.75"),till.calculateTotalCost(input));
    }

    @Test
    public void testCalculateTotalCost_5xorange() throws Exception {
        input = Arrays.asList("orange","orange","orange","orange","orange");
        assertEquals(new BigDecimal("1.00"),till.calculateTotalCost(input));
    }

    @Test
    public void testCalculateTotalCost_6xorange() throws Exception {
        input = Arrays.asList("orange","orange","orange","orange","orange","orange");
        assertEquals(new BigDecimal("1.00"),till.calculateTotalCost(input));
    }

    @Test
    public void testCalculateTotalCost_1xapple_1xorange() throws Exception {
        input = Arrays.asList("apple","orange");
        assertEquals(new BigDecimal("0.85"),till.calculateTotalCost(input));
    }

    @Test
    public void testCalculateTotalCost_2xapple_3xorange() throws Exception {
        input = Arrays.asList("apple","orange","apple","orange","orange");
        assertEquals(new BigDecimal("1.10"),till.calculateTotalCost(input));
    }
}
