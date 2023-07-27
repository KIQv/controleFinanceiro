package com.kiq.controleFinanceiro.modelo;

public class Cliente {
    private String nomeCliente;
    private String tipoConta;
    private int saldo;

    public Cliente(String nomeCliente, String tipoConta, int saldo) {
        this.nomeCliente = nomeCliente;
        this.tipoConta = tipoConta;
        this.saldo = saldo;
    }
    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", tipoConta='" + tipoConta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}