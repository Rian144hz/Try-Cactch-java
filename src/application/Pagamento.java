package application;

import entities.Contribuintes;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.Scanner;

public class Pagamento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner para ler a entrada do usuário

        ArrayList<Contribuintes> contribuintes = new ArrayList<>(); //Arraylist do tipo Contribuintes

        System.out.print("Entre com o número de contribuintes: "); // Pedindo o número de contribuintes para o usuário
        int n = sc.nextInt(); // Lendo a quantidade que o usuário digitou
        for (int i = 1; i <= n; i++) { // Um laço de repetição for, que começa de 1 e vai até n, ou seja, até o tamanho que o usuário digitar
            System.out.println("Dados do contribuinte #:" + i); // Mostrando na ordem qual contribuinte está a ser passado na lista
            System.out.print("Pessoa Física ou Juridica(F/J): "); // Aqui pergunta se o contribuinte é pessoa física ou jurídica
            char letra = sc.next().charAt(0); // Aqui lê a letra que o usuário digitou
            if (letra == 'F') { // Se caso a letra for 'F' é um pessoa fisica
                System.out.print("Nome: ");  // Aqui peço nome
                String nome = sc.next();  // leio o nome
                System.out.print("Renda anual: "); // Aqui peço renda anual
                double renda = sc.nextDouble(); // leio a renda anual
                System.out.print("Gastos com saùde: "); // Aqui peço gastos com saúde
                double gastos = sc.nextDouble(); // aqui leio gastos com saúde
                contribuintes.add(new PessoaFisica(nome, renda, gastos)); // aqui eu adiciono-os na lista, usando o contribuintes.add
                                                                         //passando os parâmetros (nome, renda, gastos)
            } else { // Caso a letra for 'J' é uma pessoa jurídica
                System.out.print("Nome: "); // Aqui peço nome
                String nome = sc.next(); // leio o nome
                System.out.print("Renda anual: "); // Aqui peço renda anual
                double renda = sc.nextDouble(); // leio a renda anual
                System.out.print("Número de funcionários: ");// Aqui peço o número de funcionarios
                int qtd_func = sc.nextInt(); // Aqui leio o número de funcionarios
                contribuintes.add(new PessoaJuridica(nome, renda, qtd_func)); // aqui eu adiciono-os na lista, usando o contribuintes.add
                //passando os parâmetros (nome, renda, qtd_func)
            }
        }
        System.out.println(); // Quebra linha
        System.out.println("Impostos pagos pelos contribuintes: "); // Mostro os impostos pagos pelos contribuintes
        for (Contribuintes c : contribuintes) { // Um laço de repetição foreach, que é usado para cada elemento da lista contribuintes
            System.out.println("Nome: " + c.getNome()); // Pego e mostro o nome dos contribuintes usando c.getNome() pois passei 'c' como variável do laço
            System.out.printf("Valor pago $ %.2f: ", c.imposto()); // Pego e mostro os valores pagos pelos contribuintes usando c.imposto() pois passei 'c' como variável do laço
        }
    }
}
