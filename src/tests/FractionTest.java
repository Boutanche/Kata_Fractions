package tests;

import fraction.Fraction;
import fraction.FractionImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FractionTest {
    /**
     * Teste la création d'une fraction.
     */
    @Test
    public void doitRetournerUneFraction() {
        Fraction fraction = new FractionImpl(1, 2);
        assertEquals(1, fraction.getNumerateur());
        assertEquals(2, fraction.getDenominateur());
    }
}
