package com.nossobanco.br.model;

import java.util.Objects;

public class Conta {
    private double saldo;
    private int agencia;
    private int conta;
    private Cliente titular;


    public void deposita(double valor){

        this.saldo += valor;
    }




    @Override
    public int hashCode() {
        return Objects.hash(saldo, agencia, conta, titular);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }
}
