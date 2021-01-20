/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 *
 * @author fernanda
 */
public class sucursal {
    private int numero;
    private String nombre;
    private String direccion;

    public sucursal(){}
    public sucursal(int numero, String nombre, String direccion){
        this.numero= numero;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }



}
