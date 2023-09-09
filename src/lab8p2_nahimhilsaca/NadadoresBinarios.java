/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_nahimhilsaca;

import java.io.Serializable;
import javax.swing.JComboBox;
import javax.swing.JTable;

/**
 *
 * @author nahim
 */
public class NadadoresBinarios implements Serializable{
    
    private JTable tabla;
    private JComboBox cb_paises;

    public NadadoresBinarios(JTable tabla, JComboBox cb_paises) {
        this.tabla = tabla;
        this.cb_paises = cb_paises;
    }

    public NadadoresBinarios(JTable tabla) {
        this.tabla = tabla;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public JComboBox getCb_paises() {
        return cb_paises;
    }

    public void setCb_paises(JComboBox cb_paises) {
        this.cb_paises = cb_paises;
    }
    
    
    
    
}
