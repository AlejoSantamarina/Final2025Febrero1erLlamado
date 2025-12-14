public class ReqLibroCantPaginas implements ReqLibro {
    private int cantPaginas;

    public ReqLibroCantPaginas(int cantPaginas) {
        this.cantPaginas = cantPaginas;
    }

    public boolean cumple(Libro libro) {
        return libro.getCantPaginas() < cantPaginas;
    }
}
