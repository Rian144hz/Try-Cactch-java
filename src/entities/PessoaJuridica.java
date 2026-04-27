package entities;

public class PessoaJuridica extends Contribuintes { //Classe filha PessoaJuridica
    private int numeroDefuncionarios;

    public PessoaJuridica() { // Construtor padrão da classe PessoaJuridica
        super();// Usado para herdar algo, caso mude algo lá na classe pai
    }

    public PessoaJuridica(String nome, double rendaAnual, int numeroDefuncionarios) {  // Construtor com todos os argumentos da classe PessoaJuridica
        super(nome, rendaAnual); // Palavra reservada 'super' para indicar que está a herdar nome, e rendaAnual da classe pai
        this.numeroDefuncionarios = numeroDefuncionarios; // palavra reservada 'this' para indicar que é aquele argumento que ele está "apontando"
    }

    public int getNumeroDefuncionarios() { // getNumeroDefuncionarios para conseguir manipular os dados, pois o getGastosComSaude é PRIVATE
        return numeroDefuncionarios; // retorna o número de funcionarios
    }

    @Override // Notação @override para dizer que esse método é uma sobreposicao
    public double imposto() { //Método herdado pela classe pai que está sendo implementado um corpo á ela
        double impostoPJ; // Variável impostoPJ usada para calcular o imposto da pessoa jurídica
        if (numeroDefuncionarios > 10) { // Aqui s2e numero de funcionarios for maior que dez
            impostoPJ = rendaAnual * 0.14; // Pessoa jurídica so paga quatorze porcento de imposto
        } else {
            impostoPJ = rendaAnual * 0.16; // Caso contrario pessoa jurídica paga dezeceis porcento de imposto
        }
        return impostoPJ; // retorna o impostoPJ
    }
}
