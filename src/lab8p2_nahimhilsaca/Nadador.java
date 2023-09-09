/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_nahimhilsaca;

import java.io.Serializable;

/**
 *
 * @author nahim
 */
public class Nadador implements Serializable{
    
    private String nombre_nadador;
    private String Nacionalidad;
    private double edad;
    private double metros;
    private String estilo_natacion;
    private int distancia;
    private int tiemporapido;
    private int num_medallas;

    public Nadador(String nombre_nadador, String Nacionalidad, double edad, double metros, String estilo_natacion, int distancia, int tiemporapido, int num_medallas) {
        this.nombre_nadador = nombre_nadador;
        this.Nacionalidad = Nacionalidad;
        this.edad = edad;
        this.metros = metros;
        this.estilo_natacion = estilo_natacion;
        this.distancia = distancia;
        this.tiemporapido = tiemporapido;
        this.num_medallas = num_medallas;
    }

    public Nadador(String nombre_nadador) {
        this.nombre_nadador = nombre_nadador;
    }
    
    
    
    public String getNombre_nadador() {
        return nombre_nadador;
    }

    public void setNombre_nadador(String nombre_nadador) {
        this.nombre_nadador = nombre_nadador;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public double getEdad() {
        return edad;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }

    public double getMetros() {
        return metros;
    }

    public void setMetros(double metros) {
        this.metros = metros;
    }

    public String getEstilo_natacion() {
        return estilo_natacion;
    }

    public void setEstilo_natacion(String estilo_natacion) {
        this.estilo_natacion = estilo_natacion;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public int getTiemporapido() {
        return tiemporapido;
    }

    public void setTiemporapido(int tiemporapido) {
        this.tiemporapido = tiemporapido;
    }

    public int getNum_medallas() {
        return num_medallas;
    }

    public void setNum_medallas(int num_medallas) {
        this.num_medallas = num_medallas;
    }

    @Override
    public String toString() {
        return "Nadador" + "nombre_nadador:" + nombre_nadador + " Nacionalidad:" + Nacionalidad + ", edad=" + edad + " metros=" + metros + ", estilo_natacion=" + estilo_natacion + "distancia=" + distancia + "tiemporapido=" + tiemporapido + " num_medallas=" + num_medallas ;
    }
    
    
    
    
}//Fin de la clase
