/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_nahimhilsaca;

/**
 *
 * @author nahim
 */
public class Evento {
    private String estilo_natacion;
    private int distancia_evento;
    private int record_actual;

    public Evento(String estilo_natacion, int distancia_evento, int record_actual) {
        this.estilo_natacion = estilo_natacion;
        this.distancia_evento = distancia_evento;
        this.record_actual = record_actual;
    }

    public String getEstilo_natacion() {
        return estilo_natacion;
    }

    public void setEstilo_natacion(String estilo_natacion) {
        this.estilo_natacion = estilo_natacion;
    }

    public int getDistancia_evento() {
        return distancia_evento;
    }

    public void setDistancia_evento(int distancia_evento) {
        this.distancia_evento = distancia_evento;
    }

    public int getRecord_actual() {
        return record_actual;
    }

    public void setRecord_actual(int record_actual) {
        this.record_actual = record_actual;
    }

    @Override
    public String toString() {
        return "Evento" + "estilo_natacion=" + estilo_natacion + " distancia_evento=" + distancia_evento + " record_actual=" + record_actual ;
    }
    
    
    
    
}
