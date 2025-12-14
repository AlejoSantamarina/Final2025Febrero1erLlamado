public class RequisitoOR implements Requisito {
    private Requisito requisito1;
    private Requisito requisito2;

    public RequisitoOR(Requisito requisito1, Requisito requisito2) {
        this.requisito1 = requisito1;
        this.requisito2 = requisito2;
    }

    public boolean cumple(Socio socio) {
        return requisito1.cumple(socio) || requisito2.cumple(socio);
    }
}
