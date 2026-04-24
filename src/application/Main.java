package application;

import entities.Desenvolvedor;
import entities.Funcionario;
import entities.Gerente;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario("Matheus",5000.0);
        Funcionario func2 = new Desenvolvedor("Matheus Rian",6000.0,500,60);
        Funcionario func3 = new Gerente("Rian",9000.0,500);
    }
}
