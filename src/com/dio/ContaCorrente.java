package com.dio;

public class ContaCorrente extends Conta{

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Concorrete ===");
        super.imprimirInfosComuns();
    }
}
