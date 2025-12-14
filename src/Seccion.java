import java.util.ArrayList;

public class Seccion extends BCU {
    private ArrayList<Libro> libros;

    public Seccion() {
        libros = new ArrayList<>();
    }

    public ArrayList<Libro> librosDisponibles(ArrayList<String> requisitosEspeciales) {
        ArrayList<Libro> librosDisponibles = new ArrayList<>();
        for(Libro libro : libros) {
            librosDisponibles.addAll(libro.librosDisponibles(requisitosEspeciales));
        }
        return librosDisponibles;
    }

    public int cantLibros() {
        int cantLibros = 0;
        for(Libro libro : libros) {
            cantLibros+= libro.cantLibros();
        }
        return cantLibros;
    }

    public int cantLibrosNoPrestados() {
        int cantLibrosNoPrestados = 0;
        for(Libro libro : libros) {
            cantLibrosNoPrestados = libro.cantLibrosNoPrestados();
        }
        return cantLibrosNoPrestados;
    }

    public double porcentajeLibrosNoPrestados() {
        double porcentajeLibrosNoPrestados = 0;
        double totalLibros = 0;
        double totalLibrosNoPrestados = 0;
        for(Libro libro : libros) {
            totalLibros+= libro.cantLibros();
            totalLibrosNoPrestados+= libro.cantLibrosNoPrestados();
        }
        return totalLibrosNoPrestados/totalLibros;
    }
}
