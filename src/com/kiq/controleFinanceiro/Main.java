package com.kiq.controleFinanceiro;
import com.kiq.controleFinanceiro.modelo.Cliente;
import com.kiq.controleFinanceiro.modelo.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Cliente kaique = new Cliente("Kaique", "Conta Corrente", 1000);

        System.out.println(Menu.menu.opcoes);
        var opcao = leitura.nextInt();

        while (opcao != 4 ){
            if (opcao == 1){
                System.out.println("Saldo disponivel: R$" + kaique.getSaldo());
            }else if (opcao == 2){
                System.out.println("Qual valor você quer depositar?");
                var deposito = leitura.nextInt();
                System.out.println("Saldo anterior: R$" + kaique.getSaldo());
                kaique.setSaldo(kaique.getSaldo() + deposito);
                System.out.println("Valor depositado: R$" + deposito + "\nSaldo atual: R$" + kaique.getSaldo());
            }else if (opcao == 3){
                System.out.println("Qual valor você quer transferir?");
                var transferir = leitura.nextInt();
                System.out.println("Saldo anterior: R$" + kaique.getSaldo());
                kaique.setSaldo(kaique.getSaldo() - transferir);
                System.out.println("Valor enviado: R$" + transferir + "\nSaldo atual: R$" + kaique.getSaldo());
            }else {
                System.out.println("Digite uma opção valida");
            }
            System.out.println(Menu.menu.opcoes);
            opcao = leitura.nextInt();
            if(opcao == 4){
                System.out.println("Até a proxima!");
                break;
            }
        }
    }
}