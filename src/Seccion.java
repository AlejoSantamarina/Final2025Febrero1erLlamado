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

    public int cantLibrosCumplen(ReqLibro reqLibro) {
        int cantLibrosNoPrestados = 0;
        for(BCU componente : componentes) {
            cantLibrosNoPrestados += componente.cantLibrosCumplen(reqLibro);
        }
        return cantLibrosNoPrestados;
    }

    public double calcularPorcentaje(ReqLibro reqLibro) {
        double librosQuecumplen = cantLibrosCumplen(reqLibro);
        int totalLibros = cantLibros();
        if(totalLibros == 0) {
            return 0;
        }
        return librosQuecumplen/totalLibros;
    }
}
