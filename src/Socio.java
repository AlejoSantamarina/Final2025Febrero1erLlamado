import java.time.LocalDate;
import java.util.ArrayList;

public class Socio {
    private String nombre;
    private int edad;
    private ArrayList<RegistroPrestamo> registroPrestamos;
    private ArrayList<String> requisitosEspeciales;

    public Socio(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        registroPrestamos = new ArrayList<>();
        requisitosEspeciales = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public ArrayList<RegistroPrestamo> getRegistroPrestamos() {
        return registroPrestamos;
    }

    public ArrayList<String> getRequisitosEspeciales() {
        return requisitosEspeciales;
    }

    public boolean debeLibros() {
        for(RegistroPrestamo registroPrestamo : registroPrestamos) {
            if(registroPrestamo.estaPendiente()) {
                return true;
            }
        }
        return false;
    }

    public void solicitarPrestamo(Libro libro) {
        if(libro.getReqLibro().cumple(this)) {
            RegistroPrestamo nuevoPrestamo = new RegistroPrestamo(libro, LocalDate.now());
            libro.setSocio_prestatario(this);
            registroPrestamos.add(nuevoPrestamo);
        }
    }

    public void devolverLibro(Libro libro) {
        for(RegistroPrestamo registroPrestamo : registroPrestamos) {
            if(registroPrestamo.estaPendiente() && registroPrestamo.getLibro().equals(libro)) {
                registroPrestamo.registrarDevolucion(LocalDate.now());
                libro.setSocio_prestatario(null);
            }
        }
    }
}
