package com.kiq.controleFinanceiro;
import com.kiq.controleFinanceiro.modelo.Cliente;
public class Main {
    public static void main(String[] args) {
        Cliente kaique = new Cliente("Kaique", "Conta Corrente", 1000);
        System.out.printf("""
                ******************************************
                
                Cliente:                   %s
                Saldo:                     R$ %d
                Tipo de Conta:             %s
                
                ******************************************
                """, kaique.getNomeCliente(), kaique.getSaldo(), kaique.getTipoConta());

    }
}