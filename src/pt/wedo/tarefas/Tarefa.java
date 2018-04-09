package pt.wedo.tarefas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Java
 */
public class Tarefa {
    private static int seq_tarefa;
    private final int id_tarefa;
    private String descricao;
    private double tempoConsumido; //tempo dispendido
    private double tempoPrevisto; //tempo previsto
    private double tempoDisponivel; //tempo disponivel
    private double tolerancia; // tolerancia de tempo consumido em relacao ao tempo previsto
    
    private Tarefa(){
        seq_tarefa++;
        this.id_tarefa = seq_tarefa;
    }

    public Tarefa(String descricao, double tempoPrevisto, double tolerancia) {
        this();
        this.descricao = descricao;
        this.tempoPrevisto = tempoPrevisto;
        this.tolerancia = tolerancia;
        this.tempoDisponivel = this.tempoPrevisto;
    }

    
    
    public void consumirTempo(double tempo){
        if(tempoConsumido < tempoPrevisto && tempoConsumido + tempo < tempoPrevisto){
            tempoConsumido += tempo;
            tempoDisponivel = tempoPrevisto - tempoConsumido;
        }
    }
    
    double calcularTempoMaximo(){
        return tempoPrevisto * (100 + tolerancia)/100;
    }
    
    public int getId_tarefa() {
        return id_tarefa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getTempoConsumido() {
        return tempoConsumido;
    }

    public void setTempoConsumido(double tempoConsumido) {
        this.tempoConsumido = tempoConsumido;
    }

    public double getTempoPrevisto() {
        return tempoPrevisto;
    }

    public void setTempoPrevisto(double tempoPrevisto) {
        this.tempoPrevisto = tempoPrevisto;
    }

    public double getTolerancia() {
        return tolerancia;
    }

    public void setTolerancia(double tolerancia) {
        this.tolerancia = tolerancia;
    }
}
