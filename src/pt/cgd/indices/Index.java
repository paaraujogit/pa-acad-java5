package pt.cgd.indices;

public class Index implements FinantialOp {

    // Stock identification
    private String sIndex;
    // Stock Prices
    private double dPriceBought;
    private double dPriceLast;
    // Valuation indicators
    private double dPERation;
    private double dDCF;
    // Finantial indicators
    Finantial oFinantial;
    private double dGains;

    public Index(String sIndex, double dPriceBought, double dPriceLast) {
        this.sIndex = sIndex;
        this.dPriceBought = dPriceBought;
        this.dPriceLast = dPriceLast;
    }

    public void setoFinantial(double dCurrentRatio, double dDividendY, double dEBTIDA) {
        oFinantial = new Finantial(dCurrentRatio, dDividendY, dEBTIDA);
    }

    public Finantial getoFinantial() {
        return oFinantial;
    }

    public void calculateGains() {
        dGains = (dPriceLast / dPriceBought - 1) * 100;
    }

    void setdPriceBought(double dPriceBought) {
        this.dPriceBought = dPriceBought;
    }

    double getdPriceBought() {
        return dPriceBought;
    }

    double getdPriceLast() {
        return dPriceLast;
    }

    double getdPERation() {
        return dPERation;
    }

}
