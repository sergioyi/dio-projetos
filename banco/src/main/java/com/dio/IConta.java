package com.dio;

public interface IConta {
    public void Deposito(Double valorDoDeposito);
    
    public void Saque(Double valorDoSaque);
    
    public void Trasferencia(Double valorDaTransferencia, Conta ContaAReceber);

    public void imprimirExtrato();
}
