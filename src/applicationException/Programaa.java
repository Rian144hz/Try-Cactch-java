package applicationException;

import entitieException.Conta;
import Exception.DomainExceptionn;

import java.util.Scanner;

public class Programaa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Qual o número da conta: ");
            int numero = sc.nextInt();
            sc.nextLine();
            System.out.print("Qual nome do titular: ");
            String nome = sc.nextLine();
            System.out.print("Seu saldo inicial: ");
            double saldo = sc.nextDouble();
            System.out.print("Qual limite do seu saque: ");
            double limteSaque = sc.nextDouble();

            Conta conta = new Conta(numero,nome,saldo,limteSaque);
            System.out.println();
            System.out.print("Quanto você deseja sacar: ");
            double valor = sc.nextDouble();
            conta.sacar(valor);
            System.out.printf("Novo saldo de %.2f%n",conta.getSaldo());
        }
        catch (DomainExceptionn e){
            System.out.println("Erro saque: "+e.getMessage());
            e.printStackTrace();
        }
        catch (RuntimeException e){
            System.out.println("Erro inesperado.");
        }
        finally {
            sc.close();
            System.out.println("Fim do programa.");
        }

    }
}
