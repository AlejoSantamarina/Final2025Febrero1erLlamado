public class FiltroLibroOR implements FiltroLibro {
    private FiltroLibro filtroLibro1;
    private FiltroLibro filtroLibro2;

    public FiltroLibroOR(FiltroLibro filtroLibro1, FiltroLibro filtroLibro2) {
        this.filtroLibro1 = filtroLibro1;
        this.filtroLibro2 = filtroLibro2;
    }

    public boolean cumple(Libro libro) {
        return filtroLibro1.cumple(libro) || filtroLibro2.cumple(libro);
    }
}
