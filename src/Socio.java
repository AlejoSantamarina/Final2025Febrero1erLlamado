import java.time.LocalDate;
import java.util.ArrayList;

public class Socio {
    private String nombre;
    private int edad;
    private ArrayList<Libro> librosRetirados;
    private ArrayList<LocalDate> fechaDePrestamo;
    private ArrayList<LocalDate> fechaDeDevolucion;
    private ArrayList<String> requisitosEspeciales;

    public Socio(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        librosRetirados = new ArrayList<>();
        fechaDePrestamo = new ArrayList<>();
        fechaDeDevolucion = new ArrayList<>();
        requisitosEspeciales = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public ArrayList<Libro> getLibrosRetirados() {
        return librosRetirados;
    }

    public ArrayList<LocalDate> getFechaDePrestamo() {
        return fechaDePrestamo;
    }

    public ArrayList<LocalDate> getFechaDeDevolucion() {
        return fechaDeDevolucion;
    }

    public ArrayList<String> getRequisitosEspeciales() {
        return requisitosEspeciales;
    }

    public boolean devolvioLibros() {
        int i;
        for(i = 0; i < librosRetirados.size(); i++) {
            if(getFechaDeDevolucion().get(i) == null) {
                return false;
            }
        }
        return true;
    }

    public void solicitarPrestamo(Requisito requisito, Libro libro) {
        if(requisito.cumple(this)) {
            this.librosRetirados.add(libro);
            this.fechaDePrestamo.add(LocalDate.now());
        }
    }

    public void devolverLibro(Libro libro) {
        this.fechaDeDevolucion.add(LocalDate.now());
    }
}
