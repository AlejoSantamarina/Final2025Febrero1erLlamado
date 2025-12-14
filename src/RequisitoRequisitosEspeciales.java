public class RequisitoRequisitosEspeciales implements Requisito {
    private String requisito;

    public RequisitoRequisitosEspeciales(String requisito) {
        this.requisito = requisito;
    }

    public boolean cumple(Socio socio) {
        if(socio.getRequisitosEspeciales().contains(requisito)) {
            return true;
        }
        return false;
    }
}
