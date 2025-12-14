public class RequisitoTieneLibrosSinDevolver implements Requisito {

    public boolean cumple(Socio socio) {
        if(socio.debeLibros()) {
            return true;
        }
        return false;
    }
}
