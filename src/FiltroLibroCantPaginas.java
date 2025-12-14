public class FiltroLibroCantPaginas implements FiltroLibro {
    private int cantPaginas;

    public FiltroLibroCantPaginas(int cantPaginas) {
        this.cantPaginas = cantPaginas;
    }

    public boolean cumple(Libro libro) {
        return libro.getCantPaginas() < cantPaginas;
    }
}
