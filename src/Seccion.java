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

    public int cantLibrosCumplen(FiltroLibro filtroLibro) {
        int cantLibrosNoPrestados = 0;
        for(BCU componente : componentes) {
            cantLibrosNoPrestados += componente.cantLibrosCumplen(filtroLibro);
        }
        return cantLibrosNoPrestados;
    }

    public double calcularPorcentaje(FiltroLibro filtroLibro) {
        double librosQuecumplen = cantLibrosCumplen(filtroLibro);
        int totalLibros = cantLibros();
        if(totalLibros == 0) {
            return 0;
        }
        return librosQuecumplen/totalLibros;
    }
}
