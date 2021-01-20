/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 *
 * @author fernanda
 */
public class color {
    private int nro;
    private String descripcion;


public color(){}
public color(int nro, String descripcion){
    this.nro = nro;
    this.descripcion = descripcion;
}

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


}
