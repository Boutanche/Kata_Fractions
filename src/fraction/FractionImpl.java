// Package: fraction
package fraction;

/**
 * Implémentation d'une fraction.
 */
public class FractionImpl implements Fraction {

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
     *
     * @param numerateur   Numérateur de la fraction.
     * @param denominateur Dénominateur de la fraction.
     */
    public FractionImpl(int numerateur, int denominateur) {
        this.numerateur = numerateur;
        this.denominateur = denominateur;
        try {
            if (denominateur < 0) {
                this.numerateur = -numerateur;
                this.denominateur = -denominateur;
            }
            if (numerateur == 0) {
                this.denominateur = 1;
            }
            if (numerateur < 0 && denominateur < 0) {
                this.numerateur = -numerateur;
                this.denominateur = -denominateur;
            }
            if (numerateur < 0 && denominateur > 0) {
                this.numerateur = numerateur;
                this.denominateur = denominateur;
            }
            if (numerateur > 0 && denominateur < 0) {
                this.numerateur = -numerateur;
                this.denominateur = -denominateur;
            }
            if (numerateur > 0 && denominateur > 0) {
                this.numerateur = numerateur;
                this.denominateur = denominateur;
            }
            if (numerateur >= Integer.MAX_VALUE || denominateur >= Integer.MAX_VALUE) {
                throw new IllegalArgumentException("Le dénominateur ou le numérateur est trop grand.");
            }
            if (numerateur <= Integer.MIN_VALUE || denominateur <= Integer.MIN_VALUE) {
                throw new IllegalArgumentException("Le dénominateur ou le numérateur est trop petit.");
            }
            if (denominateur == 0) {
                throw new IllegalArgumentException("Le dénominateur ne peut pas être nul.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Retourne le numérateur de la fraction.
     *
     * @return le numérateur de la fraction.
     */
    public int getNumerateur() {
        return numerateur;
    }

    /**
     * Retourne le dénominateur de la fraction.
     *
     * @return le dénominateur de la fraction.
     */
    public int getDenominateur() {
        return denominateur;
    }

    /**
     * Retourne la valeur décimale de la fraction.
     *
     * @return la valeur décimale de la fraction.
     */
    public double toDecimal() {
        return (double) numerateur / denominateur;
    }
}
