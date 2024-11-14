import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Vehiculo implements IClimaB {
    private boolean estado;
    private float temperatura;
    private int nivelVentilacion;
    private boolean modoEco;
    private String direccionVentilacion;
    private boolean desempañadorActivo;
    private int asientosDelanteros;
    private int asientosTraseros;
    private List<String> mantenimiento;
    private Date citaMantenimiento;

    public Vehiculo() {
        this.estado = false;
        this.temperatura = 20.0f;  // Temperatura inicial
        this.nivelVentilacion = 0;
        this.modoEco = false;
        this.direccionVentilacion = "frontal";
        this.desempañadorActivo = false;
        this.asientosDelanteros = 0;
        this.asientosTraseros = 0;
        this.mantenimiento = new ArrayList<>();
        this.citaMantenimiento = null;
    }

    @Override
    public void encender() {
        estado = true;
        System.out.println("Sistema de climatización encendido.");
    }

    @Override
    public void apagar() {
        estado = false;
        System.out.println("Sistema de climatización apagado.");
    }

    @Override
    public int ajustarTemperatura(int incremento) {
        temperatura += incremento;
        System.out.println("Temperatura ajustada a: " + temperatura + "°C");
        return (int) temperatura;
    }

    @Override
    public int modoAutomatico(int temperaturaAmbiente) {
        temperatura = temperaturaAmbiente > 25 ? 22 : 24;
        System.out.println("Modo automático activado. Temperatura ajustada a: " + temperatura + "°C");
        return (int) temperatura;
    }