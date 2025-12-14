public class ReqLibroDisponible implements ReqLibro {

    public boolean cumple(Libro libro) {
        if(libro.getSocio_prestatario() == null) {
            return true;
        }
        return false;
    }
}
