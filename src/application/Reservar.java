package application;

import entities.Reserva;
import Exception.DomainException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Reservar {
    public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
             SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
             try {
             System.out.print("Número do quarto: ");
             int numero = sc.nextInt();
             System.out.print("Data de entrada (dd/MM/yyyy): ");
             Date entrada = sdf.parse(sc.next());
             System.out.print("Data de saída (dd/MM/yyyy): ");
             Date saida = sdf.parse(sc.next());

             Reserva reserva = new Reserva(numero, entrada, saida);
             System.out.println(reserva);
             System.out.println("=============================================");
             System.out.println("Entre com os dados de atulizção da reserva: ");
             System.out.print("Data de entrada (dd/MM/yyyy): ");
             entrada = sdf.parse(sc.next());
             System.out.print("Data de saída (dd/MM/yyyy): ");
             saida = sdf.parse(sc.next());
             reserva.atualizar(entrada, saida);

             } catch (ParseException e){
             System.out.println("Data inválida!");
             }catch (DomainException e){
             System.out.println(e.getMessage());
             }catch (InputMismatchException e){
                 System.out.println("Apenas números são aceitos!");
             }finally {
                 sc.close();
             }
    }

}

