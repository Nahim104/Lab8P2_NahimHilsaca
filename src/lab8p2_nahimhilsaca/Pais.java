/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_nahimhilsaca;

import java.util.ArrayList;

/**
 *
 * @author nahim
 */
public class Pais {
    
    private String nombre;
    private ArrayList <Nadador> nadadores = new ArrayList<>();
    private int num_medallas;

    public Pais(String nombre, int num_medallas) {
        this.nombre = nombre;
        this.num_medallas = num_medallas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Nadador> getNadadores() {
        return nadadores;
    }

    public void setNadadores(ArrayList<Nadador> nadadores) {
        this.nadadores = nadadores;
    }

    public int getNum_medallas() {
        return num_medallas;
    }

    public void setNum_medallas(int num_medallas) {
        this.num_medallas = num_medallas;
    }

    @Override
    public String toString() {
        return "Pais" + "nombre:" + nombre + " num_medallas:" + num_medallas ;
    }
    
    
    
     
    
    
}
