/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.funcionatio8;

/**
 *
 * @author aluno
 */
public class Funcionario extends Funcionatio8(){
           private String nome;
           private String salario;

    public Funcionario(String nome, String salario) {
        this.nome = nome;
        this.salario = salario;
        
       
    }

    public String getNome() {
        return nome;
    }

    public String getSalario() {
        return salario;
        
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }
    
}

