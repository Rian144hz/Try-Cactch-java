package entities;

public class PessoaFisica extends Contribuintes { //Classe filha PessoaFisica

    private double gastosComSaude;  //Atributo gastosComSaude

    public PessoaFisica() {  //Construtor padrão
        super(); // Usado para herdar algo, caso mude algo lá na classe pai
    }

    public PessoaFisica(String nome, double rendaAnual, double gastosComSaude) {  // Construtor com todos os argumentos da classe PessoaFisica
        super(nome, rendaAnual); // Palavra reservada 'super' para indicar que está a herdar nome, e rendaAnual da classe pai
        this.gastosComSaude = gastosComSaude; // palavra reservada 'this' para indicar que é aquele argumento que ele está "apontando"
    }

    public double getGastosComSaude() { // getGastosComSaude para conseguir manipular os dados, pois o getGastosComSaude é PRIVATE
        return gastosComSaude; // retorna os gastos com saúde
    }

    @Override // Notação @override para dizer que esse método é uma sobreposicao
    public double imposto() { //Método herdado pela classe pai que está sendo implementado um corpo á ela
        double impostoPF; // Variável impostoPF usada para calcular o imposto da pessoa jurídica
        if (rendaAnual < 20000.0) { // Aqui se renda anual for menor que duzentos mil
            impostoPF = rendaAnual * 0.15; // Pessoa física so paga quinze porcento de imposto
        } else {
            impostoPF = rendaAnual * 0.25; // Caso contrario pessoa física paga vinte e cinco porcento de imposto
        }

        double abatimento = gastosComSaude * 0.5; // Aqui é a variável de abatimento, pois ela guarda o gasto com saúde de cinco porcento
        double impostoFinal = impostoPF - abatimento; // Imposto final que é imposto final, menos o abatimento de cinco porcento
        return impostoFinal; // Aqui retornamos o imposto final
    }


}
