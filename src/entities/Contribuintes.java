package entities;

public abstract class Contribuintes { //Classe abstrata pai Contribuintes
    private String nome;               //Atributos da classe Contribuintes
    protected   double rendaAnual;

    public Contribuintes(){ // Construtor padrão da classe Contribuintes
    }

    public Contribuintes(String nome, double rendaAnual) {  // Construtor com todos os argumentos da classe Contribuintes
        this.nome = nome; // palavra reservada 'this' para indicar que é aquele argumento que ele está "apontando"
        this.rendaAnual = rendaAnual; // palavra reservada 'this' para indicar que é aquele argumento que ele está "apontando"
    }

    public String getNome() {  // getNome para conseguir manipular os dados, pois o nome é PRIVATE
        return nome;
    }

    public double getRendaAnual() {   // getRendaAnual para conseguir manipular os dados, pois o RendaAnual é PROTECTED
        return rendaAnual;
    }
    public abstract double imposto();  // Método abstrato que FORÇA todas as classes filhas implementarem um corpo para esse método


}
