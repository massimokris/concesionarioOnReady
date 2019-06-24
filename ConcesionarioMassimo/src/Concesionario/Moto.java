package Concesionario;

import java.text.DecimalFormat;

public class Moto extends Vehiculo {

    private String cilindrada;
    DecimalFormat formato = new DecimalFormat("$#,###.00");

    //constructor
    public Moto(String marca, String modelo, Double precio, String cilindrada) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }
    //fin constructor

    //getter and setter
    public String getCilindrada() {

        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        if(cilindrada.length() <= 0){
            System.out.println("cilindrada no valida");
        }else {
            this.cilindrada = cilindrada;
        }
    }

    @Override
    public String toString() {
        return "Marca: " + this.getMarca() + " // Modelo: " + this.getModelo() + " // Cilindrada: " + this.getCilindrada() + " // Precio: " + formato.format(this.getPrecio());
    }
}
