import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
// Classe que representa um livro
public class Livro {
    private String titulo;
    public Livro(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo() {
        return titulo;
    }
    @Override
    public String toString() {
        return titulo;
    }
}