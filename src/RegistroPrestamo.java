import java.time.LocalDate;

public class RegistroPrestamo {
    private Libro libro;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;

    public RegistroPrestamo(Libro libro, LocalDate fechaPrestamo) {
        libro = libro;
        this.fechaPrestamo = fechaPrestamo;
    }

    public boolean estaPendiente() {
        return fechaDevolucion == null;
    }

    public void registrarLibro(Libro libro) {
        this.libro = libro;
    }

    public void registrarPrestamo(LocalDate fecha) {
        this.fechaPrestamo = fecha;
    }

    public void registrarDevolucion(LocalDate fecha) {
        this.fechaDevolucion = fecha;
    }
}
