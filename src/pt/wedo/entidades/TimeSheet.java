/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Java
 */
import java.util.Date;
public class TimeSheet {
    private int diasTotal;
    private int numDiasUteis;
    private int numDiasFds;
    private int numFeriados;
    private Date mesRefer;
    private int numHorasDiarias;
    
    int calcularHorasTotal(){
        return numDiasUteis * numHorasDiarias;
    }
    
    void preencheTimesheet(){
      
    }
    
    
    
    
    
}
