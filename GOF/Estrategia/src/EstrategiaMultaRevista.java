import java.time.LocalDate;

public class EstrategiaMultaRevista implements IEstrategiaMulta {
    @Override
    public double calcularMulta(LocalDate dataDeDevolucao) {
        long diasAtraso = LocalDate.now().toEpochDay() - dataDeDevolucao.toEpochDay();
        return diasAtraso > 0 ? diasAtraso * 1.0 : 0.0;
    }
}