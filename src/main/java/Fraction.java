public class Fraction implements IFraction {

    private final Integer numerator;
    private final Integer denominator;

    public Fraction(Integer numerator, Integer denominator) {
        this.numerator = numerator;
        this.denominator = denominator;

        if (denominator == 0) throw new ArithmeticException("Cannot Divide by 0");
    }

    @Override
    public Integer getNumerator() {
        return numerator;
    }

    @Override
    public Integer getDenominator() {
        return denominator;
    }

    @Override
    public IFraction plus(IFraction other) {
        int jmenovtelSPOL = getDenominator() * other.getDenominator();
        int citatelSPOL = (getNumerator() * other.getDenominator()) + (other.getNumerator() * getDenominator());
        return new Fraction(citatelSPOL, jmenovtelSPOL);

    }

    @Override
    public IFraction minus(IFraction other) {
        int jmenovtelSPOL = getDenominator() * other.getDenominator();
        int citatelSPOL = (getNumerator() * other.getDenominator()) - (other.getNumerator() * getDenominator());
        return new Fraction(citatelSPOL, jmenovtelSPOL);

    }

    @Override
    public IFraction times(IFraction other) {
        int jmenovtelSPOL = getDenominator() * other.getDenominator();
        int citatelSPOL = getNumerator() * other.getDenominator();
        return new Fraction(citatelSPOL, jmenovtelSPOL);


    }

    @Override
    public IFraction dividedBy(IFraction other) {
        int jmenovtelSPOL = getDenominator() * other.getNumerator();
        int citatelSPOL = getNumerator() * other.getDenominator();
        return new Fraction(citatelSPOL, jmenovtelSPOL);

    }

    public static Fraction createNormalised(Integer numerator, Integer denominator) {
        //nechapu
    }

    @Override
    public String toString() {
        return "Fraction " + numerator + "|" + denominator;
    }
}