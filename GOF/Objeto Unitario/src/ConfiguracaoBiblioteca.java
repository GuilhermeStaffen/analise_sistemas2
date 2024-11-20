public class ConfiguracaoBiblioteca {
    private static ConfiguracaoBiblioteca configuracao;
    private String horariosDeFuncionamento;
    private double valorMultaDiaria;

    private ConfiguracaoBiblioteca(String horariosDeFuncionamento, double valorMultaDiaria) {
        this.horariosDeFuncionamento = horariosDeFuncionamento;
        this.valorMultaDiaria = valorMultaDiaria;
    }

    public static ConfiguracaoBiblioteca definirConfiguracoes(String horarios, double multa) {
        if (configuracao == null) {
            configuracao = new ConfiguracaoBiblioteca(horarios, multa);
        }
        return configuracao;
    }

    public String getHorariosDeFuncionamento() {
        return horariosDeFuncionamento;
    }

    public double getValorMultaDiaria() {
        return valorMultaDiaria;
    }

    @Override
    public String toString() {
        return "Horários: " + horariosDeFuncionamento + ", Multa Diária: R$ " + valorMultaDiaria;
    }
}