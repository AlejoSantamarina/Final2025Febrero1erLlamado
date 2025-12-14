public class ReqLibroNOT implements ReqLibro {
    private ReqLibro reqLibro;

    public ReqLibroNOT(ReqLibro reqLibro) {
        this.reqLibro = reqLibro;
    }

    public boolean cumple(Libro libro) {
        return !reqLibro.cumple(libro);
    }
}
