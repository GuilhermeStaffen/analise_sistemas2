import java.time.LocalDate;

public class EstrategiaMultaLivro implements IEstrategiaMulta {
    @Override
    public double calcularMulta(LocalDate dataDeDevolucao) {
        long diasAtraso = LocalDate.now().toEpochDay() - dataDeDevolucao.toEpochDay();
        return diasAtraso > 0 ? diasAtraso * 2.0 : 0.0;
    }
}