package entitieException;

import Exception.DomainExceptionn;

public class Conta {
    private Integer numero;
    private String titular;
    private Double saldo;
    private double limiteSaque;


    public Conta(){

    }
    public Conta(Integer numero, String titular, Double saldo, double limiteSaque) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public double getLimiteSaque() {
        return limiteSaque;
    }
    public  void depositar(double valor){

    }
    public void sacar(double valor){
        if (valor > limiteSaque){
            throw new DomainExceptionn("O valor excede o limte de saque!");
        }
           if (valor > saldo){
               throw  new DomainExceptionn("Saldo insuficiente");
        }
           saldo-=valor;
    }
}
