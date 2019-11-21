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
public class Professor extends Person{
    private int hours;
    private float salary;
    private List<Course> coursesTaught;

    public Professor(String nombre, String apellido, int dni) {
        super(nombre, apellido, dni);
        coursesTaught=new ArrayList<>();
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float sueldo) {
        this.salary = sueldo;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int cantidadHoras) {
        this.hours = cantidadHoras;
    }
    public void addCourse(Course curso){
        coursesTaught.add(curso);
    }
    
    public List<Course> getCoursesWithStudentsBeforeThan(int añoDeIngreso){
        Iterator<Course> it=coursesTaught.iterator();
        List<Course> cursosConIngresantesAnteriores=new ArrayList<>();
        while (it.hasNext()) {
            Course curso = it.next();
            if(curso.hasStudentsBeforeThan(añoDeIngreso)){
                cursosConIngresantesAnteriores.add(curso);
            }
        }
        return cursosConIngresantesAnteriores;
    }
    
}
