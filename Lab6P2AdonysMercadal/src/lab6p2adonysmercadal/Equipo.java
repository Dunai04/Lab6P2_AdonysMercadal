/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2adonysmercadal;

/**
 *
 * @author adony
 */
public class Equipo {
    String equipo;
    String nombreequipo;
    String ciudad;
    String Estadio;

    public Equipo() {
    }
    
    
    public Equipo(String equipo, String nombreequipo, String ciudad, String Estadio) {
        this.equipo = equipo;
        this.nombreequipo = nombreequipo;
        this.ciudad = ciudad;
        this.Estadio = Estadio;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getNombreequipo() {
        return nombreequipo;
    }

    public void setNombreequipo(String nombreequipo) {
        this.nombreequipo = nombreequipo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstadio() {
        return Estadio;
    }

    public void setEstadio(String Estadio) {
        this.Estadio = Estadio;
    }

    @Override
    public String toString() {
        return nombreequipo;
    }
    
}
