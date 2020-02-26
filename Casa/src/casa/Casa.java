/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package casa;

/**
 *
 * @author Coss Mendiola Diana Karen
 */
public class Casa {

    private int puertas;
    private int pisos;
    private int television;
    private int muebles;

    public Casa(int puertas, int pisos, int television, int muebles) {
        this.puertas = puertas;
        this.pisos = pisos;
        this.television = television;
        this.muebles = muebles;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public int getTelevision() {
        return television;
    }

    public void setTelevision(int television) {
        this.television = television;
    }

    public int getMuebles() {
        return muebles;
    }

    public void setMuebles(int muebles) {
        this.muebles = muebles;
    }
    
}
