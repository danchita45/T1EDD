/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareas1;

/**
 *
 * @author Danchita45
 */
public class Auto {
    public int Anio;
    public String Modelo;
    public String placas;

    public Auto(int Anio, String Modelo, String placas) {
        this.Anio = Anio;
        this.Modelo = Modelo;
        this.placas = placas;
    }

    

    @Override
    public String toString() {
        return "Auto{" + "Anio=" + Anio + ", Modelo=" + Modelo + ", placas=" + placas + '}';
    }
    
    public Auto() {
    }

    public int getAnio() {
        return Anio;
    }

    public void setAnio(int Anio) {
        this.Anio = Anio;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }
    

    
    
    
    

    
}
