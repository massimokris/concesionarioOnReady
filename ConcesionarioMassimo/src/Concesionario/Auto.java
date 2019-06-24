package Concesionario;

import java.text.DecimalFormat;

public class Auto extends Vehiculo {

    private Integer puertas;
    DecimalFormat formato = new DecimalFormat("$#,###.00");

    //constructor
    public Auto(String marca, String modelo, Double precio, Integer puertas) {
        super(marca, modelo, precio);
        this.puertas = puertas;
    }
    //fin constructor

    //getter and setter
    public void setPuertas(Integer puertas) {
        if(puertas <= 0){
            System.out.println("puertas no validas");
        }else {
            this.puertas = puertas;
        }
    }

    public Integer getPuertas() {

        return puertas;
    }
    //fin getter and setter

    @Override
    public String toString() {
        return "Marca: " + this.getMarca() + " // Modelo: " + this.getModelo() + " // Puertas: " + this.getPuertas() + " // Precio: " + formato.format(this.getPrecio());
    }
}
