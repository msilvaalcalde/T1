/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso.hospital.xyz;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marantonio55
 */
public class Paciente {
    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String tipoDocumento;
    private String nroIndentificacion;
    private LocalDate fechaNacimiento;
    private String tipoSangre;
    private List<String> tipoAlergias;
    private String celular;
    private String correo;

    public Paciente() {
        this.tipoAlergias = new ArrayList<>();
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }


    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNroIndentificacion() {
        return nroIndentificacion;
    }

    public void setNroIndentificacion(String nroIndentificacion) {
        this.nroIndentificacion = nroIndentificacion;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getAlergias()
    {
        String alergiasConcatenadas = String.join("; ", tipoAlergias);
        return alergiasConcatenadas;
    }
    public void setAlergias(List<String> alergias){
        this.tipoAlergias = alergias; 
    }
    
    public int getEdad()
    {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public String mostrarDatos()
    {
        return "Paciente: " + nombres + " " + apellidoPaterno + " " + apellidoMaterno +
               "\nDocumento: " + tipoDocumento + " - " + nroIndentificacion +
               "\nFecha de Nacimiento: " + fechaNacimiento + 
               "\nEdad: " + getEdad() +
               "\nTipo de Sangre: " + tipoSangre + 
               "\nAlergias: " + getAlergias() +
               "\nCelular: " + celular +
               "\nCorreo: " + correo;
    }
    
    
}
