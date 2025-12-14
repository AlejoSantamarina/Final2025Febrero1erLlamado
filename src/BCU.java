import java.util.ArrayList;

public abstract class BCU {

    public abstract ArrayList<Libro> librosDisponibles(ArrayList<String> requisitosEspeciales);
    public abstract int cantLibros();
    public abstract int cantLibrosCumplen(FiltroLibro filtroLibro);
    public abstract double calcularPorcentaje(FiltroLibro filtroLibro);
}
