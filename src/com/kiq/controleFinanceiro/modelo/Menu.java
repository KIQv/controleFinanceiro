package com.kiq.controleFinanceiro.modelo;

public class Menu {
        private int consultar;
        private int receber;
        private int transferir;
        private int sair;
        public static class menu {
            public static String opcoes = """
                *****************************
                Operações
                
                1 - CONSULTAR SALDO
                2 - DEPOSITAR VALOR
                3 - TRANSFERIR VALOR
                4 - SAIR
                Digite a opção desejada:
                """;
        }
}
