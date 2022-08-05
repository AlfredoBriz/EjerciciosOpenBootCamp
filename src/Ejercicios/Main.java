//Para practicar la encapsulación:

        //Crear clase Persona.

        //Crear variables las privadas edad, nombre y telefono de la clase Persona.

        //Crear gets y sets de cada propiedad.

        //Crear un objeto persona en el main.

        //Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.
package Ejercicios;


public class Main {

    public static void main(String[] args) {

        Persona persona = new Persona();

        // Uso de Setters - Doy valores
        persona.setEdad(30);
        persona.setNombre("Leonardo");
        persona.setTelefono("209837364");

        // Uso de Getters - Recibo los valores
        System.out.println(persona.getEdad());
        System.out.println(persona.getNombre());
        System.out.println(persona.getTelefono());
    }
}




class Persona {

    //Atributos
    private int edad;
    private String nombre;
    private String telefono;


    // Getters and Setters
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}






















