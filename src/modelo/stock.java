/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 *
 * @author fernanda
 */
public class stock {

    private int nro;
    private prenda prenda;
    private talle talle;
    private color color;
    private sucursal sucursal;
    private material material;
    private int cantidad;



    public stock(){}
    public stock(int nro, prenda prenda, talle talle, color color, sucursal sucursal, material material, int cantidad){
        this.nro = nro;
        this.prenda = prenda;
        this.talle = talle;
        this.color = color;
        this.sucursal = sucursal;
        this.material = material;
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public color getColor() {
        return color;
    }

    public void setColor(color color) {
        this.color = color;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public prenda getPrenda() {
        return prenda;
    }

    public void setPrenda(prenda prenda) {
        this.prenda = prenda;
    }

    public sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public talle getTalle() {
        return talle;
    }

    public void setTalle(talle talle) {
        this.talle = talle;
    }

    public material getMaterial() {
        return material;
    }

    public void setMaterial(material material) {
        this.material = material;
    }


    

}
