public class ReqLibroAND implements ReqLibro {
    private ReqLibro reqLibro1;
    private ReqLibro reqLibro2;

    public ReqLibroAND(ReqLibro reqLibro1, ReqLibro reqLibro2) {
        this.reqLibro1 = reqLibro1;
        this.reqLibro2 = reqLibro2;
    }

    public boolean cumple(Libro libro) {
        return reqLibro1.cumple(libro) && reqLibro2.cumple(libro);
    }
}
