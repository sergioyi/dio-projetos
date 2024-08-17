package com.dio;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n Inicio da aplicação \n");
        Apresentacao apresentacao = new Apresentacao();
        apresentacao.Input();
        Cliente nome = new Cliente(apresentacao.getTitular());
        ContaPoupanca pop = new ContaPoupanca(nome);
        ContaCorrente cc = new ContaCorrente(nome);

        cc.Deposito(apresentacao.getValorDeposito());
        cc.Saque(apresentacao.getValorDoSaque());
        cc.Trasferencia(apresentacao.getValorDaTransferencia(), pop);
        cc.imprimirExtrato();

        pop.Deposito(apresentacao.getValorDaTransferencia());
        pop.imprimirExtrato();

        System.out.println("\n Fim da aplicação \n");
    }

}
