public class FiltroLibroCaracteristicas implements FiltroLibro {
    private String caracteristicas;

    public FiltroLibroCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public boolean cumple(Libro libro) {
        if(libro.getCaracteristicas().contains(caracteristicas)) {
            return true;
        }
        return false;
    }
}
