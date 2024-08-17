package com.dio;
import java.util.Scanner;
public class Apresentacao {
    Scanner c = new Scanner(System.in);
    private String titular;
    private double valorDeposito;
    private double valorDoSaque;
    private double valorDaTransferencia;
    private double valorDoDeposito;

    public void Input(){
        System.out.println("Informe o seu nome ");
        this.titular = c.next();
        System.out.println("Informe o seu valor de deposito na conta corrente ");
        this.valorDeposito = c.nextDouble();
        System.out.println("Informe o seu valor do saque na conta corrente");
        this.valorDoSaque = c.nextDouble();
        System.out.println("Informe o seu valor da transferencia para poupança ");
        this.valorDaTransferencia = c.nextDouble();
        System.out.println("Informe o valor de deposito na conta poupança ");
        this.valorDoDeposito = c.nextDouble();
    }

    public String getTitular() {
        return titular;
    }
    public double getValorDeposito() {
        return valorDeposito;
    }
    public double getValorDoSaque() {
        return valorDoSaque;
    }
    public double getValorDaTransferencia() {
        return valorDaTransferencia;
    }
    public double getValorDoDeposito() {
        return valorDoDeposito;
    }

}
