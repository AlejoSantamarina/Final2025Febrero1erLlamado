import java.util.ArrayList;

public class Libro extends BCU {
    private int cantPaginas;
    private String socio_prestatario;
    private ArrayList<String> caracteristicas;

    public Libro(int cantPaginas, String socio_prestatario) {
        this.cantPaginas = cantPaginas;
        this.socio_prestatario = socio_prestatario;
    }

    public int getCantPaginas() {
        return cantPaginas;
    }

    public String getSocio_prestatario() {
        return socio_prestatario;
    }

    public ArrayList<String> getCaracteristicas() {
        return caracteristicas;
    }

    public ArrayList<Libro> librosDisponibles(ArrayList<String> requisitosEspeciales) {
        ArrayList<Libro> librosDisponibles = new ArrayList<>();
        if(this.socio_prestatario == null && this.caracteristicas.containsAll(requisitosEspeciales)) {
            librosDisponibles.add(this);
        }
        return librosDisponibles;
    }

    public int cantLibros() {
        return 1;
    }

    public int cantLibrosNoPrestados() {
        if(this.socio_prestatario == null) {
            return 1;
        }
        return 0;
    }
}
