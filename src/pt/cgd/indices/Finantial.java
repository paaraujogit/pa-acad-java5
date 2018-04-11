
package pt.cgd.indices;


public class Finantial implements FinantialOp {
    double dCurrentRatio;
    double dDividendY;
    double dROE;
    double dROI;
    double dEBTIDA;
    double dGains;

    public Finantial(double dCurrentRatio, double dDividendY, double dEBTIDA) {
        this.dCurrentRatio = dCurrentRatio;
        this.dDividendY = dDividendY;
        this.dEBTIDA = dEBTIDA;
    }
    
    public void calculateGains() {
        dGains = dDividendY;
    }

    public double getdCurrentRatio() {
        return dCurrentRatio;
    }

    public void setdCurrentRatio(double dCurrentRatio) {
        this.dCurrentRatio = dCurrentRatio;
    }

    public double getdDividendY() {
        return dDividendY;
    }

    public void setdDividendY(double dDividendY) {
        this.dDividendY = dDividendY;
    }

    public double getdROE() {
        return dROE;
    }

    public void setdROE(double dROE) {
        this.dROE = dROE;
    }

    public double getdROI() {
        return dROI;
    }

    public void setdROI(double dROI) {
        this.dROI = dROI;
    }

    public double getdEBTIDA() {
        return dEBTIDA;
    }

    public void setdEBTIDA(double dEBTIDA) {
        this.dEBTIDA = dEBTIDA;
    }

    
}
