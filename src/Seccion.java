import java.util.ArrayList;

public class Seccion extends BCU {
    private ArrayList<BCU> componentes;

    public Seccion() {
        componentes = new ArrayList<>();
    }

    public ArrayList<Libro> librosDisponibles(ArrayList<String> requisitosEspeciales) {
        ArrayList<Libro> librosDisponibles = new ArrayList<>();
        for(BCU componente : componentes) {
            librosDisponibles.addAll(componente.librosDisponibles(requisitosEspeciales));
        }
        return librosDisponibles;
    }

    public int cantLibros() {
        int cantLibros = 0;
        for(BCU componente : componentes) {
            cantLibros+= componente.cantLibros();
        }
        return cantLibros;
    }

    public int cantLibrosNoPrestados() {
        int cantLibrosNoPrestados = 0;
        for(BCU componente : componentes) {
            cantLibrosNoPrestados += componente.cantLibrosNoPrestados();
        }
        return cantLibrosNoPrestados;
    }

    public double porcentajeLibrosNoPrestados() {
        double porcentajeLibrosNoPrestados = 0;
        double totalLibros = 0;
        double totalLibrosNoPrestados = 0;
        for(BCU componente : componentes) {
            totalLibros+= componente.cantLibros();
            totalLibrosNoPrestados+= componente.cantLibrosNoPrestados();
        }
        return totalLibrosNoPrestados/totalLibros;
    }
}
