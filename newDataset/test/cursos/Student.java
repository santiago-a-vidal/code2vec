/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package certificacion.cursos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author santiagovidal
 */
public class Student extends Person{
    private int yearOfAdmission;
    private List<Course> courses;

    public Student(String nombre, String apellido, int dni, int añoDeIngreso) {
        super(nombre, apellido, dni);
        this.yearOfAdmission=añoDeIngreso;
        courses=new ArrayList<>();
    }

    public int getYearOfAdmission() {
        return this.yearOfAdmission;
    }

    public void addCurso(Course curso){
        courses.add(curso);
    }
    
    //Ejercicio 2
    public float getGeneralAverage(){
        Iterator<Course> it=courses.iterator();
        float acumulador=0.0f;
        int cursadasConNotas=0;
        while (it.hasNext()) {
            Course curso = it.next();
            Float nota=curso.getScore(this);
            if(nota!=null){
                acumulador=acumulador+nota;
                cursadasConNotas++;
            }
        }
        return acumulador/cursadasConNotas;
    }
    
    //ejercicio 3 (jugar con que no lo agregue a alguna materia).

    @Override
    public String toString() {
        return super.toString()+" "+yearOfAdmission+" "+courses.size();
    }
    
}
