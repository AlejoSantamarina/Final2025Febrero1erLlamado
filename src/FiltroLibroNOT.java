public class FiltroLibroNOT implements FiltroLibro {
    private FiltroLibro filtroLibro;

    public FiltroLibroNOT(FiltroLibro filtroLibro) {
        this.filtroLibro = filtroLibro;
    }

    public boolean cumple(Libro libro) {
        return !filtroLibro.cumple(libro);
    }
}
