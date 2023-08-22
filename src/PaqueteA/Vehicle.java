package PaqueteA;

/**
 *
 * @author harol
 */
public class Vehicle {

    // Atributos
    private String placa = "";
    private String fabricante = "";
    private String modelo = "";
    private String color = "";

    // Propiedades
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Constructor
    public Vehicle() {
        
        this.placa = "";
        this.fabricante = "";
        this.modelo = "";
        this.color = "";
    }

    public Vehicle(String placa, String fabricante, String modelo, String color) {

        this.placa = placa;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
    }

   
}
