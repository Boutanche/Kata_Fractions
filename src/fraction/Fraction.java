package fraction;

/**
 * Interface d'une fraction.
 */
public interface Fraction {
    /**
     * Retourne le numérateur de la fraction.
     * @return le numérateur de la fraction.
     */
    int getNumerateur();

    /**
     * Retourne le dénominateur de la fraction.
     * @return le dénominateur de la fraction.
     */
    int getDenominateur();

    /**
     * Retourne la valeur décimale de la fraction.
     * @return la valeur décimale de la fraction.
     */
    double toDecimal();
}
