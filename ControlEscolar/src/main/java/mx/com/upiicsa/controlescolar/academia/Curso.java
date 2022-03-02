/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.upiicsa.controlescolar.academia;

import java.util.ArrayList;
import mx.com.upiicsa.controlescolar.co.Alumno;
import mx.com.upiicsa.controlescolar.co.Profesor;

/**
 *
 * @author Erick
 */
public class Curso {
    private Materia materia;
    private String horario;
    private Profesor profesor;
    private ArrayList<Alumno> alumnos; 
    
    //Constructor
    public Curso(){
        alumnos = new ArrayList<>();//Instancia de ArrayList
        System.out.println("---------------->Constructor Curso");
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public void addAlumno(Alumno alumno){
        alumnos.add(alumno);
    }
    
    public void printList(){
        for(var alumno:alumnos){
            System.out.println("Nombre: "+alumno.getNombre()+" "+alumno.getPrimerApellido());
        }
    }
    public static void main(String[] args) {
        Alumno a1 = new Alumno();
        a1.setNombre("Angel");
        a1.setPrimerApellido("Angeles");
        a1.setSegundoApellido("Molina");
        a1.setBoleta("2020600083");
        Alumno a2 = new Alumno();
        a2.setNombre("Omar");
        a2.setPrimerApellido("Cruz");
        a2.setSegundoApellido("Molina");
        a2.setBoleta("2020600043");
        Curso java = new Curso();
        java.addAlumno(a1);
        java.addAlumno(a2);
        java.printList();
    }
}
