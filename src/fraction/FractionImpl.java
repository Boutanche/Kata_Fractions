// Package: fraction
package fraction;

/**
 * Implémentation d'une fraction.
 */
public class FractionImpl implements Fraction{

    /**
     * Numérateur de la fraction.
     */
    private int numerateur;
    /**
     * Dénominateur de la fraction.
     */
    private int denominateur;

    /**
     * Crée une fraction.
     * @param numerateur Numérateur de la fraction.
     * @param denominateur Dénominateur de la fraction.
     */
    public FractionImpl(int numerateur, int denominateur) {
        this.numerateur = numerateur;
        this.denominateur = denominateur;
    }

    /**
     * Retourne le numérateur de la fraction.
     * @return le numérateur de la fraction.
     */
    public int getNumerateur() {
        return numerateur;
    }

    /**
     * Retourne le dénominateur de la fraction.
     * @return le dénominateur de la fraction.
     */
    public int getDenominateur() {
        return denominateur;
    }
}
