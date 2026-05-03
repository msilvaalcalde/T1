/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caso.hospital.xyz;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author marantonio55
 */
public class CasoHospitalXyz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sca = new Scanner(System.in);// creamos la variable sca para leer datos desde consola
        controlPaciente control=new controlPaciente();
        
        String rpta= "SI/NO";
        while(rpta.equalsIgnoreCase("SI"))
        {
        try
            {
                System.out.println("/////Registro de Pacientes//////");
                System.out.println("Nombre");
                String nombre=sca.nextLine();

                System.out.println("Apellido paterno");
                String apellidoPaterno=sca.nextLine();

                System.out.println("Apellido materno");
                String apellidoMaterno=sca.nextLine();

                System.out.println("Tipo de documento (DNI/CE): ");
                String tipoDocumento=sca.nextLine();

                System.out.println("Numero de documento: ");
                String nroDocumento=sca.nextLine();

                if(nroDocumento.length()< 8)
                {
                    throw new Exception("Documento invalido");

                }

                System.out.println("Fecha de nacimiento (AAAA-MM-DD): ");
                String fechaTexto=sca.nextLine();

                LocalDate fechaNacimiento = LocalDate.parse(fechaTexto);

                System.out.println("Tipo de sangre: ");
                String tipoSangre=sca.nextLine();

                System.out.println("Alergias: ");
                String alergias=sca.nextLine();

                System.out.println("Celular: ");
                String celular=sca.nextLine();

                if(celular.length()!=9)
                {
                    throw new Exception("Complete los 9 dijitos.");
                }

                System.out.println("Correo: ");
                String correo=sca.nextLine();

                if(!correo.contains("@"))
                {
                    throw new Exception("Correo erroneo.");
                }

                Paciente p = new Paciente();
                p.setNombres(nombre);

                
                p.setApellidoPaterno(apellidoPaterno);
                p.setApellidoMaterno(apellidoMaterno);
                p.setTipoDocumento(tipoDocumento);
                p.setNroIndentificacion(nroDocumento);
                p.setFechaNacimiento(fechaNacimiento);
                p.setTipoSangre(tipoSangre);
                p.setAlergias(alergias);
                p.setCelular(celular);
                p.setCorreo(correo);

                control.agregarPacientes(p);

                System.out.println("Paciente registrado con exito. ");




            } catch(Exception e)
            {
                System.out.println("Error: " + e.getMessage());
            }
            
        System.out.println("Desea registrar a un paciente nuevo (SI/NO): ");
        rpta=sca.nextLine();
        
        }
        System.out.println("\n =------Lista de Pacientes------");
        control.listarPaciente();
        
        sc.close();
        
        
        }
        
        
        
        
        
        
        
    }
    
}
