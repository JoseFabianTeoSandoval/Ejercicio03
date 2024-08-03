package umg.principal.Conductores;

public class Conductor {
    public String nombre;
    public String licencia;

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + "\nLicencia: " + licencia);
    }
}
