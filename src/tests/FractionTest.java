package tests;

import fraction.Fraction;
import fraction.FractionImpl;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Teste la classe FractionImpl.
 */
public class FractionTest {
    /**
     * Teste la création d'une fraction.
     */
    @Test
    public void doitRetournerUneFraction() {
        Fraction fraction = new FractionImpl(3, 4);
        assertEquals(3, fraction.getNumerateur());
        assertEquals(4, fraction.getDenominateur());
        assertEquals(0.75, fraction.toDecimal(), 0.0001);
    }
    /**
     * Teste la création d'une fraction avec un dénominateur négatif.
     */
    @Test
    public void doitRetournerUneFractionAvecDenominateurNegatif() {
        Fraction fraction = new FractionImpl(3, -4);
        assertEquals(-3, fraction.getNumerateur());
        assertEquals(4, fraction.getDenominateur());
        assertEquals(-0.75, fraction.toDecimal(), 0.0001);
    }
    /**
     * Teste la création d'une fraction avec un numérateur négatif.
     */
    @Test
    public void doitRetournerUneFractionAvecNumerateurNegatif() {
        Fraction fraction = new FractionImpl(-3, 4);
        assertEquals(-3, fraction.getNumerateur());
        assertEquals(4, fraction.getDenominateur());
        assertEquals(-0.75, fraction.toDecimal(), 0.0001);
    }
    /**
     * Teste la création d'une fraction avec un numérateur et un dénominateur négatifs.
     */
    @Test
    public void doitRetournerUneFractionAvecNumerateurEtDenominateurNegatifs() {
        Fraction fraction = new FractionImpl(-3, -4);
        assertEquals(3, fraction.getNumerateur());
        assertEquals(4, fraction.getDenominateur());
        assertEquals(0.75, fraction.toDecimal(), 0.0001);
    }
    /**
     * Teste la création d'une fraction avec un numérateur nul.
     */
    @Test
    public void doitRetournerUneFractionAvecNumerateurNul() {
        Fraction fraction = new FractionImpl(0, 4);
        assertEquals(0, fraction.getNumerateur());
        assertEquals(1, fraction.getDenominateur());
        assertEquals(0, fraction.toDecimal(), 0.0001);
    }

    /**
     * Teste la création d'une fraction avec un dénominateur nul.
     */
    @Test(expected = IllegalArgumentException.class)
    public void doitRetournerUneFractionAvecDenominateurNul() {
        new FractionImpl(3, 0);
    }

}
