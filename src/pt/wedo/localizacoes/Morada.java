/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.wedo.localizacoes;

/**
 *
 * @author Nuno
 */
public class Morada {
    String rua;
    String num_porta;
    String andar;
    String fraccao;
    CodPost codPost;

    public Morada(String rua, String num_porta, CodPost coPost) {
        this.rua = rua;
        this.num_porta = num_porta;
        this.codPost = coPost;
    }

    public String getRua() {
        return rua;
    }

    public String getNum_porta() {
        return num_porta;
    }

    public String getAndar() {
        return andar;
    }

    public String getFraccao() {
        return fraccao;
    }

    public CodPost getCoPost() {
        return codPost;
    }
    
    
    

}
