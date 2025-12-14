public class ReqLibroCaracteristicas implements ReqLibro {
    private String caracteristicas;

    public ReqLibroCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public boolean cumple(Libro libro) {
        if(libro.getCaracteristicas().contains(caracteristicas)) {
            return true;
        }
        return false;
    }
}
