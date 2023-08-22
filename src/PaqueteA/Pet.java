
package PaqueteA;


public class Pet {
    // Atributos
    private String nombre;
    private int edad;

    // Constructor por defectooo
    public Pet() {
        nombre="";
        edad=0;
    }

    // Constructor con parámetros
    public Pet(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos get y set para el atributo 'name'
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos get y set para el atributo 'age'
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
