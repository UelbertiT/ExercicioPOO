package com.mycompany.contabancariaa;

public class ContaBancaria {
        
        private double saldo;
        private String titular;

    public ContaBancaria(double Saldo, String titular) {
        this.saldo = Saldo;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double novoSaldo) {
        this.saldo = novoSaldo;
    }
    

    public String getTitular() {
        return titular;
    }

    public void setTitular(String novoTitular) {
        this.titular = novoTitular;
    }
}
