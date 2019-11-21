/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package certificacion.cursos;

/**
 *
 * @author santiagovidal
 */
public class Person {
    private String name;
    private String surname;
    private int id;

    public Person(String nombre, String apellido, int dni) {
        this.name = nombre;
        this.surname = apellido;
        this.id = dni;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getID() {
        return id;
    }
    
    

    @Override
    public String toString() {
        return name+" "+surname+" "+id; 
    }
    
    
    
    
}
