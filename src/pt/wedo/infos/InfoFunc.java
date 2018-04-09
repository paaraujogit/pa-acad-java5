/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.wedo.infos;

import java.util.Date;
import pt.wedo.pessoas.Funcionario;

/**
 *
 * @author Java
 */
public class InfoFunc {
    /*Dados de funcionário*/
    private static int aux_counter = 0;
    
    final int numFunc;
    Date dtAdmissao;
    String departamento;
    Funcionario lider;

    public InfoFunc() {
        numFunc = ++aux_counter;
    }
    
    
    public InfoFunc(Date dtAdmissao, String departamento) {
        this();
        this.dtAdmissao = dtAdmissao;
        this.departamento = departamento;
    }

    public int getNumFunc() {
        return numFunc;
    }

    public static int getAux_counter() {
        return aux_counter;
    }

    public static void setAux_counter(int aux_counter) {
        InfoFunc.aux_counter = aux_counter;
    }

    public Date getDtAdmissao() {
        return dtAdmissao;
    }

    public void setDtAdmissao(Date dtAdmissao) {
        this.dtAdmissao = dtAdmissao;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Funcionario getLider() {
        return lider;
    }

    public void setLider(Funcionario lider) {
        this.lider = lider;
    }
    
    
    
    
    
}
