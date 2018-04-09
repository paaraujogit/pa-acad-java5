package pt.wedo.aplicacao;

import java.util.ArrayList;
import pt.wedo.tarefas.Tarefa;
import java.awt.*;
import java.util.Collection;
import pt.wedo.localizacoes.*;

import pt.wedo.pessoas.Funcionario;
/*
Hello.java
*/
//package pt.wedo.regi.app;
import pt.wedo.pessoas.Funcionario;
import java.util.Date;
import java.util.List;
public class RegiApp{
	public static void main(String[] args){
            System.out.println("Welcome to RegiApp");
            System.out.println("");
            Funcionario f1 = new Funcionario("Nuno", 2200.5);
            f1.setMorada(new Morada("Rua Eng. Ribeiro Ribau", "99", new CodPost("0000","111","ZZZ")));
            Morada mor1 = new Morada("Rua Eng. Ribeiro Meireles", "984", new CodPost("1111","222","Vila do Conde"));
            f1.setMorada(mor1);

            
            Funcionario f2 = new Funcionario("Daniela", 2300.72);
            f2.setMorada(new Morada("Rua Eng. Ribeiro Ribau", "99", new CodPost("0000","111","ZZZ")));
            f2.setVencimento(2000.56);
            
            List<Funcionario> funcionarios = new ArrayList();
            funcionarios.add(f1);
            funcionarios.add(f2);

            Tarefa abc = new Tarefa("ABC", 50, 1);
            Tarefa tar2 = new Tarefa ("TAR2", 60, 5);
            List<Tarefa> tarefas = new ArrayList();
            tarefas.add(abc);
            tarefas.add(tar2);
           
            funcionarios.forEach((func) -> {
                func.atualizarSalario(2);
            });
           
            funcionarios.stream();
            /*
            for(Funcionario func : funcionarios)
                func.atualizarSalario(2);
            */


            funcionarios.get(1).registarTempo(2, tarefas.get(1));
	}
}