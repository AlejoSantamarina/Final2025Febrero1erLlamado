public class RequisitoLibrosSinDevolver implements Requisito {

    public boolean cumple(Socio socio) {
        if(socio.devolvioLibros()) {
            return true;
        }
        return false;
    }
}
