package com.dio;

public abstract class Conta implements IConta{
    private static final int AGENCIA_PADRAO = 2;
    private int SEQUENCIAL = 1;

    protected double saldo;
    protected int agencia;
    protected int numero;
    protected Cliente titular;
    
    //  construtores

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.titular = cliente;
    }

    public Conta(Double saldo, Integer agencia, Integer numero) {
        this.saldo = saldo;
        this.agencia = agencia;
        this.numero = numero;
    }
    
    //  getter's e setter's

    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    public Integer getAgencia() {
        return agencia;
    }
    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }
    public Integer getNumero() {
        return numero;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    //  toString

    @Override
    public String toString() {
        return "Conta [saldo= " + saldo + ", agencia= " + agencia + ", numero= " + numero+", titula= "+titular.getNome()+"]";
    }  
    
    //  métodos implementados

    @Override
    public void Deposito(Double valorDoDeposito) {
        this.saldo += valorDoDeposito;
    }

    @Override
    public void Saque(Double valorDoSaque) {
        this.saldo -= valorDoSaque;
    }

    @Override
    public void Trasferencia(Double valorDaTransferencia, Conta ContaAReceber) {
        this.Saque(valorDaTransferencia);
        ContaAReceber.Deposito(valorDaTransferencia);
        
    }
    //outros métodos
    protected void outrasInfoConta(){
        System.out.println("o saldo: "+this.saldo);
        System.out.println("a agencia: "+this.agencia);
        System.out.println("o número: "+this.numero);
    }
    
}
