/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 *
 * @author fernanda
 */
public class ComboBoxItem {
    private int numero;
    private String valor;

    public ComboBoxItem(int numero, String valor){
        this.numero = numero;
        this.valor = valor;

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    

}
