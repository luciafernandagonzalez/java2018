/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 *
 * @author fernanda
 */
public class lineadesolicitud {

    private prenda Prenda;
    private talle Talle;
    private color Color;
    private material Material;
    private int Cantidad;

    public lineadesolicitud(){}

    public lineadesolicitud(prenda Prenda, talle Talle, color Color, material Material, int Cantidad){
        this.Prenda = Prenda;
        this.Talle = Talle;
        this.Color = Color;
        this.Material = Material;
        this.Cantidad = Cantidad;
    }

    public color getColor() {
        return Color;
    }

    public void setColor(color Color) {
        this.Color = Color;
    }

    public prenda getPrenda() {
        return Prenda;
    }

    public void setPrenda(prenda Prenda) {
        this.Prenda = Prenda;
    }

    public talle getTalle() {
        return Talle;
    }

    public void setTalle(talle Talle) {
        this.Talle = Talle;
    }

    public material getMaterial() {
        return Material;
    }

    public void setMaterial(material Material) {
        this.Material = Material;
    }

    

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }







}
