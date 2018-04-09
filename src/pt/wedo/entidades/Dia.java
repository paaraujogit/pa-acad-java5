package pt.wedo.entidades;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nuno
 */

public class Dia {
    private double  numHoras;
    private double  numHorasExtra;
    private boolean isFeriado = false;
    private boolean isFimDeSemana = false;
    private boolean isUtil = true;
    
    boolean validarDiaUtil(Dia dia){
        if(isFeriado || isFimDeSemana){
            isUtil = false;
        }
        return isUtil;
    }
    
    
}
