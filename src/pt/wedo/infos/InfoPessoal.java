/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.wedo.infos;

import pt.wedo.localizacoes.Morada;

/**
 *
 * @author Java
 */
public class InfoPessoal {    
    /*Dados Pessoais*/
    String nome;
    String apelido;
    Morada morada;
    String niss;
    String nif;
    String estadoCivil;
    String nFilhos;    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public Morada getMorada() {
        return morada;
    }

    public void setMorada(Morada morada) {
        this.morada = morada;
    }

    public String getNiss() {
        return niss;
    }

    public void setNiss(String niss) {
        this.niss = niss;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getnFilhos() {
        return nFilhos;
    }

    public void setnFilhos(String nFilhos) {
        this.nFilhos = nFilhos;
    }
    
    
}
