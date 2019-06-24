package Concesionario;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class Concesionario {
    DecimalFormat formato = new DecimalFormat("$#,###.00");

    private List<Vehiculo> vehiculos;

    public Concesionario() {

        this.vehiculos = new ArrayList<>();
    }

    public void mostrarVehiculos(){

        for(int i = 0 ; i < vehiculos.size() ; i++) {

            System.out.println(vehiculos.get(i));
        }
    }

    public void agregarVehiculos(List<Vehiculo> vehiculos) {

        this.vehiculos = vehiculos;
    }

    public void precioMayor() {

        Collections.sort(vehiculos);
        System.out.println("Vehiculo mas caro: " + this.vehiculos.get(0).getMarca() + " " + this.vehiculos.get(0).getModelo());
    }

    public void precioBajo() {

        System.out.println("Vehiculo mas barato: " + this.vehiculos.get(vehiculos.size()-1).getMarca() + " " + this.vehiculos.get(vehiculos.size()-1).getModelo());
    }

    public void ordenarVehiculos(){

        System.out.println("Vehiculos ordenados por precio de mayor a menor:");
        vehiculos.forEach(automotor -> System.out.println(automotor.getMarca() + " " + automotor.getModelo()));
    }

    public void vahiculoConY(String letra){

        System.out.print("Vehiculo que contiene en el modelo la letra '"+ letra +"' : ");

        for(int i = 0; i< this.vehiculos.size(); i++){

            String modelo = this.vehiculos.get(i).getModelo();

            if(modelo.contains(letra)){

                System.out.println(this.vehiculos.get(i).getMarca() + " " + this.vehiculos.get(i).getModelo() + " " + formato.format(this.vehiculos.get(i).getPrecio()));
            }
        }
    }
}

