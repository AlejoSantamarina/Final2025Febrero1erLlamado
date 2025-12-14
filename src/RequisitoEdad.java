public class RequisitoEdad implements Requisito {
    private int edadMinima;

    public RequisitoEdad(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public boolean cumple(Socio socio) {
        if(socio.getEdad() > edadMinima) {
            return true;
        }
        return false;
    }
}
