package application;

import entities.Reserva;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Reservar {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("Número do quarto: ");
        int numero = sc.nextInt();
        System.out.print("Data de entrada (dd/MM/yyyy): ");
        Date entrada = sdf.parse(sc.next());
        System.out.print("Data de aida (dd/MM/yyyy): ");
        Date saida = sdf.parse(sc.next());
        if (!saida.after(entrada)){
            System.out.println("Erro na reserva: saida tem que ser posterior a entrada.");
        }else{
            Reserva reserva = new Reserva(numero,entrada,saida);
            System.out.println(reserva);
            System.out.println();
            System.out.println();
            System.out.println("Entre com os dados de atulizção da reserva: ");
            System.out.print("Data de entrada (dd/MM/yyyy): ");
             entrada = sdf.parse(sc.next());
            System.out.print("Data de aida (dd/MM/yyyy): ");
             saida = sdf.parse(sc.next());

            Date agora = new Date();
            if (entrada.before(agora) || saida.before(agora)){
                System.out.println("Erro na reserva: as datas para atualização devem ser datas futuras.");
            } else if (!saida.after(entrada)) {
                System.out.println("Erro na reserva: saida tem que ser posterior a entrada.");
            }else{
                reserva.atualizar(entrada,saida);
                System.out.println(reserva);
            }
        }
    }
}
