/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso.hospital.xyz;

import java.util.ArrayList;

/**
 *
 * @author marantonio55
 */
public class controlPaciente {
    //aca he creado una lista del tipo objetos 
    private ArrayList<Paciente> listaPacientes;

    //y en el constructor se inicializa la lista
    public controlPaciente() {
        listaPacientes= new ArrayList<>();
    }
    
    public void agregarPacientes(Paciente paciente)
    {
        listaPacientes.add(paciente);
    }
    
    public void listarPacientes()// cree un if para poder mostrar en pantalla que no hay paciente registrado
    {
        if(listaPacientes.isEmpty())
        {
            System.out.println("NO hay ningun paciente registrado ");
        }
        else
        {
            for(Paciente paciente:listaPacientes)// es metodo explicado en clase for-each
            {
                System.out.println(paciente.mostrarDatos());
            
            }
        }
    }   
}
