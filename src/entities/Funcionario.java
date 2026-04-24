package entities;

public  class Funcionario {
    private String nome;
    protected double salarioBase;

    public Funcionario(){

    }

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double vencimento(){
        return salarioBase;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "Nome = '" + nome + '\'' +
                ", Vencimento = " + vencimento() +
                '}';
    }
}
