import java.util.Date;
import java.util.List;

/**
 * Interfaz que define el comportamiento del sistema de climatización de un vehículo.
 */
public interface IClimaB {

    /**
     * Enciende el sistema de climatización.
     * 
     * @return un mensaje indicando que el sistema ha sido encendido.
     */
    String encender();

    /**
     * Apaga el sistema de climatización.
     * 
     * @return un mensaje indicando que el sistema ha sido apagado.
     */
    String apagar();

    /**
     * Ajusta la temperatura interna del sistema en un incremento especificado.
     * 
     * @param incremento La cantidad de grados para aumentar o disminuir la temperatura.
     * @return la nueva temperatura ajustada.
     */
    int ajustarTemperatura(int incremento);

    /**
     * Activa el modo automático de climatización ajustando la temperatura según el clima externo.
     * 
     * @param temperaturaAmbiente La temperatura ambiente externa.
     * @return la temperatura ajustada automáticamente.
     */
    int modoAutomatico(int temperaturaAmbiente);

    /**
     * Configura el nivel de ventilación entre los valores 0 a 3.
     * 
     * @param intensidad El nivel de ventilación deseado.
     * @return un mensaje indicando el nivel de ventilación configurado.
     */
    String ajustarVentilacion(int intensidad);

    /**
     * Activa el modo de ahorro de energía, reduciendo la intensidad de ventilación.
     * 
     * @return un mensaje indicando que el modo Eco ha sido activado.
     */
    String activarModoEco();

    /**
     * Cambia la dirección de ventilación a una opción específica.
     * 
     * @param direccion La dirección de ventilación deseada (parabrisas, frontal, pies, todo).
     * @return un mensaje indicando la dirección de ventilación configurada.
     */
    String ajustarDireccionVentilacion(String direccion);

    /**
     * Ajusta la calefacción de los asientos delanteros y traseros a un nivel específico.
     * 
     * @param nivelDelantero Nivel de calefacción para los asientos delanteros (0 a 3).
     * @param nivelTrasero Nivel de calefacción para los asientos traseros (0 a 3).
     * @return un mensaje indicando los niveles de calefacción ajustados.
     */
    String activarCalefaccionAsientos(int nivelDelantero, int nivelTrasero);

    /**
     * Activa la calefacción rápida para calentar el habitáculo rápidamente.
     * 
     * @return un mensaje indicando que la calefacción rápida ha sido activada.
     */
    String activarCalefaccionRapida();

    /**
     * Activa el desempañador del vehículo.
     * 
     * @return un mensaje indicando que el desempañador ha sido activado.
     */
    String activarDesempañador();

    /**
     * Desactiva el desempañador del vehículo.
     * 
     * @return un mensaje indicando que el desempañador ha sido desactivado.
     */
    String desactivarDesempañador();

    /**
     * Programa la próxima cita de mantenimiento del sistema.
     * 
     * @param fecha La fecha de la cita de mantenimiento.
     * @return un mensaje indicando la fecha de la cita de mantenimiento programada.
     */
    String programarMantenimiento(Date fecha);

    /**
     * Retorna una lista con el historial de mantenimiento, incluyendo fechas y detalles de eventos.
     * 
     * @return una lista con el historial de mantenimiento del sistema.
     */
    List<String> verHistorialMantenimiento();
}
