import java.util.ArrayList;

public class Libro extends BCU {
    private int cantPaginas;
    private Socio socio_prestatario;
    private Requisito requisito;
    private ArrayList<String> caracteristicas;

    public Libro(int cantPaginas, Socio socio_prestatario, Requisito requisito) {
        this.cantPaginas = cantPaginas;
        this.socio_prestatario = socio_prestatario;
        this.requisito = requisito;
        caracteristicas = new ArrayList<>();
    }

    public Requisito getReqLibro() {
        return requisito;
    }

    public int getCantPaginas() {
        return cantPaginas;
    }

    public Socio getSocio_prestatario() {
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

    public int cantLibrosCumplen(FiltroLibro filtroLibro) {
        if(filtroLibro.cumple(this)) {
            return 1;
        }
        return 0;
    }

    public double calcularPorcentaje(FiltroLibro filtroLibro) {
        return this.cantLibrosCumplen(filtroLibro);
    }

    public void setSocio_prestatario(Socio socio_prestatario) {
        this.socio_prestatario = socio_prestatario;
    }
}
