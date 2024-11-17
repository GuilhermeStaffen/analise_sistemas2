import java.time.LocalDate;

//interface a ser utilizada para realizar o calculo de multa
public interface Calculadora {
    double calcular(LocalDate Devolucao, LocalDate dataAtual);
}