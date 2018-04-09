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
public class CodPost {
    String codPost1;
    String codPost2;
    String localidade;
    String concelho;
    String distrito;
    String pais;

    public CodPost(String codPost1, String codPost2, String localidade) {
        this.codPost1 = codPost1;
        this.codPost2 = codPost2;
        this.localidade = localidade;
    }
    
}
