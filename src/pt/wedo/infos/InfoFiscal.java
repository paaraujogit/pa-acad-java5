/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.wedo.infos;

/**
 *
 * @author Nuno
 */
public class InfoFiscal {
    /*Dados pagamento*/
    double vencimento;
    double escalaoIrs;
    double txIrs;
    double txSegSocial;
    String nib;

    public InfoFiscal() {
    }

    
    public InfoFiscal(double vencimento, String nib) {
        this.vencimento = vencimento;
        this.nib = nib;
    }

    public double getVencimento() {
        return vencimento;
    }

    public void setVencimento(double vencimento) {
        this.vencimento = vencimento;
    }

    public String getNib() {
        return nib;
    }

    public void setNib(String nib) {
        this.nib = nib;
    }
    
    
    
}
