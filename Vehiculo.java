import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * La clase Vehiculo representa un vehículo que implementa las funcionalidades
 * de control de clima y calefacción de asientos.
 */
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

    /**
     * Constructor por defecto de la clase Vehiculo.
     */
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

    /**
     * Enciende el sistema de climatización.
     *
     * @return Un mensaje indicando que el sistema de climatización está encendido.
     */
    @Override
    public String encender() {
        estado = true;
        return "Sistema de climatización encendido.";
    }

    /**
     * Apaga el sistema de climatización.
     *
     * @return Un mensaje indicando que el sistema de climatización está apagado.
     */
    @Override
    public String apagar() {
        estado = false;
        return "Sistema de climatización apagado.";
    }

    /**
     * Ajusta la temperatura del sistema de climatización.
     *
     * @param incremento El valor a incrementar o decrementar en la temperatura.
     * @return La temperatura ajustada.
     */
    @Override
    public int ajustarTemperatura(int incremento) {
        temperatura += incremento;
        return (int) temperatura;
    }

    /**
     * Activa el modo automático de temperatura basado en la temperatura ambiente.
     *
     * @param temperaturaAmbiente La temperatura ambiente.
     * @return La temperatura ajustada automáticamente.
     */
    @Override
    public int modoAutomatico(int temperaturaAmbiente) {
        temperatura = temperaturaAmbiente > 25 ? 22 : 24;
        return (int) temperatura;
    }

    /**
     * Ajusta el nivel de ventilación del sistema.
     *
     * @param intensidad El nivel de intensidad de la ventilación (0 a 3).
     * @return Un mensaje indicando el ajuste realizado o si el nivel es inválido.
     */
    @Override
    public String ajustarVentilacion(int intensidad) {
        if (intensidad >= 0 && intensidad <= 3) {
            nivelVentilacion = intensidad;
            return "Nivel de ventilación ajustado a: " + nivelVentilacion;
        } else {
            return "Nivel de ventilación inválido. Debe estar entre 0 y 3.";
        }
    }

    /**
     * Activa el modo Eco, reduciendo la intensidad de la ventilación.
     *
     * @return Un mensaje indicando que el modo Eco ha sido activado.
     */
    @Override
    public String activarModoEco() {
        modoEco = true;
        nivelVentilacion = Math.max(nivelVentilacion - 1, 0);  // Reduce intensidad en modo eco
        return "Modo Eco activado. Nivel de ventilación ajustado a: " + nivelVentilacion;
    }

    /**
     * Ajusta la dirección de la ventilación.
     *
     * @param direccion La dirección de la ventilación.
     * @return Un mensaje indicando la dirección ajustada.
     */
    @Override
    public String ajustarDireccionVentilacion(String direccion) {
        direccionVentilacion = direccion;
        return "Dirección de ventilación ajustada a: " + direccionVentilacion;
    }

    /**
     * Activa la calefacción en los asientos delanteros y traseros a un nivel específico.
     *
     * @param nivelDelantero El nivel de calefacción para los asientos delanteros (0 a 3).
     * @param nivelTrasero El nivel de calefacción para los asientos traseros (0 a 3).
     * @return Un mensaje indicando el ajuste realizado o si el nivel es inválido.
     */
    @Override
    public String activarCalefaccionAsientos(int nivelDelantero, int nivelTrasero) {
        if (nivelDelantero >= 0 && nivelDelantero <= 3) {
            asientosDelanteros = nivelDelantero;
            return "Calefacción de asientos delanteros ajustada a: " + asientosDelanteros;
        }
        if (nivelTrasero >= 0 && nivelTrasero <= 3) {
            asientosTraseros = nivelTrasero;
            return "Calefacción de asientos traseros ajustada a: " + asientosTraseros;
        } else {
            return "Nivel de calefacción inválido para asientos.";
        }
    }

    /**
     * Activa la calefacción rápida ajustando la temperatura a un valor alto.
     *
     * @return Un mensaje indicando que la calefacción rápida ha sido activada.
     */
    @Override
    public String activarCalefaccionRapida() {
        temperatura = 28.0f;
        return "Calefacción rápida activada. Temperatura ajustada a: " + temperatura + "°C";
    }

    /**
     * Activa el desempañador.
     *
     * @return Un mensaje indicando que el desempañador ha sido activado.
     */
    @Override
    public String activarDesempañador() {
        desempañadorActivo = true;
        return "Desempañador activado.";
    }

    /**
     * Desactiva el desempañador.
     *
     * @return Un mensaje indicando que el desempañador ha sido desactivado.
     */
    @Override
    public String desactivarDesempañador() {
        desempañadorActivo = false;
        return "Desempañador desactivado.";
    }

    /**
     * Programa una cita de mantenimiento para el vehículo.
     *
     * @param fecha La fecha de la cita de mantenimiento.
     * @return Un mensaje indicando la fecha programada para el mantenimiento.
     */
    @Override
    public String programarMantenimiento(Date fecha) {
        citaMantenimiento = fecha;
        mantenimiento.add("Mantenimiento programado para: " + fecha.toString());
        return "Cita de mantenimiento programada para: " + fecha;
    }

    /**
     * Obtiene el historial de mantenimiento del vehículo.
     *
     * @return Una lista de strings con el historial de mantenimiento.
     */
    @Override
    public List<String> verHistorialMantenimiento() {
        return mantenimiento;
    }
}
