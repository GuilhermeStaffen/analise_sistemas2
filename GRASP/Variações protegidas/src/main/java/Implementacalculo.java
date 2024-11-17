import java.time.LocalDate;

// Implementação da interface para calculo
public class Implementacalculo implements Calculadora {
    private static final double MULTADIARIA = 2.0; // Multa fixa por dia de atraso

    @Override //sobreescreve metodo definido na interface
    public double calcular(LocalDate Devolucao, LocalDate dataAtual) {
        if (dataAtual.isAfter(Devolucao)) {
            long dias = java.time.temporal.ChronoUnit.DAYS.between(Devolucao, dataAtual);
            return dias * MULTADIARIA;
        }
        return 0;
    }
}