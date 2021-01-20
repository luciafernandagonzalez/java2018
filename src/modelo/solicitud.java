/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;
import java.util.ArrayList;

/**
 *
 * @author fernanda
 */
public class solicitud {

    private String fecha;
    private sucursal Sucursal;
    private estado Estado;
    private ArrayList<lineadesolicitud> lineasdesolicitud = new ArrayList<lineadesolicitud>();


    public solicitud(){}
    public solicitud(String fecha, sucursal Sucursal){
        this.fecha = fecha;
        this.Sucursal = Sucursal;
        this.Estado = Estado.Pendiente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public sucursal getSucursal() {
        return Sucursal;
    }

    public void setSucursal(sucursal Sucursal) {
        this.Sucursal = Sucursal;
    }

   


    public estado getEstado() {
        return Estado;
    }

    public void setEstado(estado Estado) {
        this.Estado = Estado;
    }

    public ArrayList<lineadesolicitud> getLineasdesolicitud() {
        return lineasdesolicitud;
    }

    public void setLineasdesolicitud(ArrayList<lineadesolicitud> lineasdesolicitud) {
        this.lineasdesolicitud = lineasdesolicitud;
    }



}
