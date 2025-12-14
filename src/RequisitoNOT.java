public class RequisitoNOT implements Requisito {
    private Requisito requisito;

    public RequisitoNOT(Requisito requisito) {
        this.requisito = requisito;
    }

    public boolean cumple(Socio socio) {
        return !requisito.cumple(socio);
    }
}
