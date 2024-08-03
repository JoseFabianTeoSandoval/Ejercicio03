package umg.principal.Conductores;

public class ConductorDeCoche extends Conductor{
    private int añosDeExperiencia = 0;
    public ConductorDeCoche(String nombre, String licencia, int añosDeExperiencia) {
        super(nombre, licencia);
        this.añosDeExperiencia = añosDeExperiencia;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
    }
}
