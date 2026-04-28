package entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {
    private Integer numeroDoQuarto;
    private Date entrada;
    private Date saida;

    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reserva(){

    }

    public Reserva(Integer numeroDoQuarto, Date entrada, Date saida) {
        this.numeroDoQuarto = numeroDoQuarto;
        this.entrada = entrada;
        this.saida = saida;
    }

    public Integer getNumeroDoQuarto() {
        return numeroDoQuarto;
    }

    public Date getEntrada() {
        return entrada;
    }

    public Date getSaida() {
        return saida;
    }
    public long duracao(){
        long dff = saida.getTime() - entrada.getTime();
        return TimeUnit.DAYS.convert(dff,TimeUnit.MILLISECONDS);
    }
    public String atualizar(Date entrada, Date saida){
        Date agora = new Date();
        if (entrada.before(agora) || saida.before(agora)){
           return "Erro na reserva: as datas para atualização devem ser datas futuras.";
        } if (!saida.after(entrada)) {
            return "Erro na reserva: saida tem que ser posterior a entrada.";
    }
        this.entrada = entrada;
        this.saida = saida;
        return null;
    }

    @Override
    public String toString() {
        return "Reserva: " +
                "Número do quarto: " + numeroDoQuarto +
                ", Entrada: " + sdf.format(entrada) +
                ", Saída: " + sdf.format(saida) +
                " "+
                duracao()+
                " noites";
    }
}

