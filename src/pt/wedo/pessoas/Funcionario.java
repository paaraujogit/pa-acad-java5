package pt.wedo.pessoas;

import java.time.LocalDate;
import pt.wedo.localizacoes.Morada;
import pt.wedo.tarefas.Tarefa;
import pt.wedo.infos.*;
import java.util.Date;

public class Funcionario{
    LocalDate dt_criacao;
    InfoPessoal infoPess;
    InfoFunc infoFunc;
    InfoFiscal infoFiscal;
    private final static double PERCENTAGEM = 0.1;//premio anual é 10% do salário

    public Funcionario() {
        dt_criacao = LocalDate.now();
        infoPess = new InfoPessoal();
        infoFunc = new InfoFunc();
        infoFiscal = new InfoFiscal();
    }
    
    /*Mètodos Construtores*/
    public Funcionario(String _nome, double _vencimento){
        this();
        this.infoPess.setNome(_nome);
        this.infoFiscal.setVencimento(_vencimento);
        
    }
    
    void criarFuncioncario(Funcionario func){
        //Operações BD para persistir funcionário
    }   

    void atualizarFuncionario(int id){
        //
    }
    
    void eliminarFuncionario(int id){
        
    }
    

    
    /*métodos da classe*/
    /*double calcularDescontoIRS(){
        return escalaoIrs * vencimento / 100;
    }
    
    double calcularPremioAnual(){
        return PERCENTAGEM * vencimento;
    }
    */
    public void registarTempo(double tempo, Tarefa tarefa){//, Dia diaEmEdicao){
        //if(diaEmEdicao.validarDiaUtil(diaEmEdicao)){
            tarefa.consumirTempo(tempo);
            System.out.println("O utilizador " + this.infoPess.getNome() + " registou " + tempo + "h na tarefa " + tarefa.getDescricao());
        //}
        
    }
    
    public void atualizarSalario(double aumento){
        double vencActual, vencNovo;
        vencActual = this.infoFiscal.getVencimento();
        vencNovo = vencActual * ((100 + aumento) / 100);
        this.infoFiscal.setVencimento(vencNovo);
        System.out.println("O novo salario do funcionario " + this.getNome() + " é " + vencNovo);
        //return vencNovo;
    }
    
    /*getters e setters*/
    public int getNumFunc(){
            return this.infoFunc.getNumFunc();
    }

    public String getNome(){
            return this.infoPess.getNome();
    }

    public void setNome(String _nome){
            this.infoPess.setNome(_nome);
    }

    public double getVencimento(){
            return this.infoFiscal.getVencimento();
    }

    public void setVencimento(double _vencimento){
            this.infoFiscal.setVencimento(_vencimento);
    }

    public String getDepartamento() {
        return this.infoFunc.getDepartamento();
    }

    public void setDepartamento(String _departamento) {
        this.infoFunc.setDepartamento(_departamento);
    }

    public Morada getMorada() {
        return this.infoPess.getMorada();
    }

    public void setMorada(Morada morada) {
        this.infoPess.setMorada(morada);
    }
}